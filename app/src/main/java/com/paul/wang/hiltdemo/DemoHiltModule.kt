package com.paul.wang.hiltdemo

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DemoHiltModule {

    @Binds
    abstract fun bindDataRepository(mainDataInterfaceImpl: DemoRepository) : MainDataInterface
}
