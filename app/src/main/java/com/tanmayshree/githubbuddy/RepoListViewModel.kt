package com.tanmayshree.githubbuddy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.tanmayshree.githubbuddy.repository.RepoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RepoListViewModel @Inject constructor(): ViewModel() {

    val allRepoItems: LiveData<List<RepoItemModel>>

    private val repository: RepoRepository

    init {
        val dao = DB.getDb(App()).getDao()
        repository = RepoRepository(dao)
        allRepoItems = repository.allRepos
    }

    fun returnSomeText(): String = "Hello this text is from the viewmodel"
}