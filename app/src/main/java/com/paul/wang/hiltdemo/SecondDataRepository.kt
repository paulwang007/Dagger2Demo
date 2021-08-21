package com.paul.wang.hiltdemo

import javax.inject.Inject

class SecondDataRepository @Inject constructor() : MainDataInterface {
    override fun getData(): String = "DEF"
}
