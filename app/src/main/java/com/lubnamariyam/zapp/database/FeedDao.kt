package com.lubnamariyam.zapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FeedDao {
    @Query("SELECT * FROM Feed_table")
    fun getAll(): LiveData<List<FeedEntity>>

    @Insert
    suspend fun insert(feedEntity: FeedEntity)
}