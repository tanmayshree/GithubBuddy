package com.tanmayshree.githubbuddy.repository

import androidx.lifecycle.LiveData
import com.tanmayshree.githubbuddy.RepoItemModel
import com.tanmayshree.githubbuddy.dao.RepoDao

class RepoRepository(private val dao: RepoDao) {

    val allRepos: LiveData<List<RepoItemModel>> = dao.getClassItems()

    suspend fun insertRepo(repoItem: RepoItemModel) = dao.insertRepo(repoItem)

    suspend fun deleteRepo(repoItem: RepoItemModel) = dao.deleteRepo(repoItem)
}