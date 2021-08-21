package com.paul.wang.hiltdemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import retrofit2.Retrofit
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class MainRetrofit

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondaryRetrofit

@Module
@InstallIn(ViewModelComponent::class)
class NetworkHiltModule {

    @MainRetrofit
    @Provides
    fun provideMainRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.google.com")
            .build()
    }

    @SecondaryRetrofit
    @Provides
    fun provideSecondRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.paul.wang.com")
            .build()
    }
}
