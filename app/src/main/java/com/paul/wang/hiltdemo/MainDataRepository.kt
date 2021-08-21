package com.paul.wang.hiltdemo

import retrofit2.Retrofit
import javax.inject.Inject

class MainDataRepository @Inject constructor(@SecondaryRetrofit private val retrofit: Retrofit) : MainDataInterface {
    override fun getData(): String {
        return retrofit.baseUrl().toString()
    }
}
