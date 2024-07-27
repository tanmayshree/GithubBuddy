package com.tanmayshree.githubbuddy

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tanmayshree.githubbuddy.dao.RepoDao

@Database(entities = [RepoItemModel::class], version = 1)
abstract class DB: RoomDatabase()
{

    abstract fun getDao(): RepoDao

    companion object {
        @Volatile
        var instance: DB? = null

        fun getDb(context: Context): DB{
            instance?.let {
                return it
            }

            instance = Room.databaseBuilder(context = context, DB::class.java, "db")
                .allowMainThreadQueries()
                .build()

            return instance!!
        }
    }
}