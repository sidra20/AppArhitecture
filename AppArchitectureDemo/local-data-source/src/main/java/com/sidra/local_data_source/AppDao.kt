package com.sidra.local_data_source

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.sidra.core.model.Note

@Dao
interface AppDao {

    @Insert
    suspend fun insert(note: Note)

    @Query("Select * from note")
    fun getNotes():LiveData<List<Note>>
}