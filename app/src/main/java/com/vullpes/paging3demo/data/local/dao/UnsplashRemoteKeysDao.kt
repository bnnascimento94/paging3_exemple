package com.vullpes.paging3demo.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.vullpes.paging3demo.model.UnsplashRemoteKeys

@Dao
interface UnsplashRemoteKeysDao {

    @Query("select * from unsplash_remote_keys_table where id =:id")
    suspend fun getRemoteKeys(id:String): UnsplashRemoteKeys

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(remoteKeys: List<UnsplashRemoteKeys>)

    @Query("DELETE FROM unsplash_remote_keys_table")
    suspend fun deleteAllRemotekeys()

}