package com.tanmayshree.githubbuddy.di

import android.app.Application
import android.content.Context
import com.tanmayshree.githubbuddy.DB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule{

    @Provides
    fun provideDB(app: Application): DB{
        return DB.getDb(app)
    }
}