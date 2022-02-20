package com.lubnamariyam.lubsboutique.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.lubnamariyam.zapp.database.FeedDao
import com.lubnamariyam.zapp.database.FeedEntity
import com.lubnamariyam.zapp.database.ZDatabase

class FeedRepository(application: Application) {
    private var feedDao: FeedDao

    init {
        val database = ZDatabase.getDatabase(application)
        feedDao = database.feedDao()
    }

    val readAllData : List<FeedEntity> =  feedDao.getAll()

    suspend fun insertFeed(feedEntity: FeedEntity) {
        feedDao.insert(feedEntity)
    }

}