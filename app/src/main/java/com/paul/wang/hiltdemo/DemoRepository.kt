package com.paul.wang.hiltdemo

import javax.inject.Inject

class DemoRepository @Inject constructor() {
    fun getText(): String = "ABCD"
}
