package com.paul.wang.hiltdemo

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

@Module
@InstallIn(SingletonComponent::class)
class DemoRepository @Inject constructor() {
    fun getText(): String = "ABCD"
}
