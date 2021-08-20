package com.paul.wang.hiltdemo

import javax.inject.Inject

class DemoRepository @Inject constructor() : MainDataInterface {
    override fun getData(): String = "ABCD"
}
