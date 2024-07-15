package com.tanmayshree.githubbuddy

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [TestObject::class], version = 1)
abstract class DB: RoomDatabase()
{

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