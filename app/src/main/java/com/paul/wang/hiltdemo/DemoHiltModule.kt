package com.paul.wang.hiltdemo

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class MainDataRepo

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondDataRepo

@Module // Link this class to Hilt.
@InstallIn(ViewModelComponent::class) // Adding all components into this scope.
abstract class DemoHiltModule {

    @Binds // Binding this interface implementation to Hilt.
    abstract fun bindMainDataRepository(mainDataInterfaceImpl: MainDataRepository) : MainDataInterface
}
