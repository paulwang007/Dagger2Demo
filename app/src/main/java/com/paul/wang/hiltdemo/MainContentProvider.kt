package com.paul.wang.hiltdemo

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.components.SingletonComponent

/**
 * Hilt doesn't support ContentProvider ATM, add an Hilt EntryPoint.
 */
class MainContentProvider: ContentProvider() {

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface MainContentProviderEntryPoint {
        fun getSomeString(): String
    }

    override fun onCreate(): Boolean {
        TODO("Not yet implemented")
    }

    override fun query(
        p0: Uri,
        p1: Array<out String>?,
        p2: String?,
        p3: Array<out String>?,
        p4: String?
    ): Cursor? {
        // To use the Hilt EntryPoint.
        val mainContentProviderEntryPoint = EntryPointAccessors.fromApplication(context?.applicationContext, MainContentProviderEntryPoint::class.java)
        val someString = mainContentProviderEntryPoint.getSomeString()

        return null
    }

    override fun getType(p0: Uri): String? {
        TODO("Not yet implemented")
    }

    override fun insert(p0: Uri, p1: ContentValues?): Uri? {
        TODO("Not yet implemented")
    }

    override fun delete(p0: Uri, p1: String?, p2: Array<out String>?): Int {
        TODO("Not yet implemented")
    }

    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int {
        TODO("Not yet implemented")
    }
}
