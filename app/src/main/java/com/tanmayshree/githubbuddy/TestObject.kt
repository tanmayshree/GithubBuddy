package com.tanmayshree.githubbuddy

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TestObject(
    var name: String,
    @PrimaryKey(autoGenerate = true) var id: Int
)
