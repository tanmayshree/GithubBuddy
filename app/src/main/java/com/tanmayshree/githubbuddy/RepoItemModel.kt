package com.tanmayshree.githubbuddy

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RepoItemModel(
    @PrimaryKey(autoGenerate = true) var id: Int,
    var name: String,
)
