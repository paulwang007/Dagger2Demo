package com.paul.wang.hiltdemo

/**
 * Interface can't be constructor-injected, therefore, use @Module and link the implementation class to Hilt.
 */
interface MainDataInterface {
    fun getData(): String
}
