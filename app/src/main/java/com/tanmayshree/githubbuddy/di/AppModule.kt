package com.tanmayshree.githubbuddy.di

import android.app.Application
import com.tanmayshree.githubbuddy.DB
import com.tanmayshree.githubbuddy.api.Api
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDB(app: Application): DB {
        return DB.getDb(app)
    }

    @Provides
    @Singleton
    fun provideApi(app: Application): Api {
        return Retrofit.Builder()
            .baseUrl("https://www.google.com/")
            .build()
            .create(Api::class.java)
    }
}