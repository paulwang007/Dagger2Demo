package com.paul.wang.hiltdemo.activity

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.paul.wang.hiltdemo.DemoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(application: Application) : AndroidViewModel(application) {

    @Inject
    lateinit var demoRepository: DemoRepository

    fun getLiveDataText(): LiveData<String> = MutableLiveData(demoRepository.getText())
}
