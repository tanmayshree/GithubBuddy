package com.tanmayshree.githubbuddy.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.tanmayshree.githubbuddy.RepoItemModel


@Dao
interface RepoDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertRepo(repoItem: RepoItemModel)

    @Delete
    suspend fun deleteRepo(repoItem: RepoItemModel)

    @Query("SELECT * FROM RepoItemModel ORDER BY id ASC")
    fun getClassItems(): LiveData<List<RepoItemModel>>
}