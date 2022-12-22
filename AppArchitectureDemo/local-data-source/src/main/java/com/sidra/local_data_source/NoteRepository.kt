package com.sidra.local_data_source

import com.sidra.core.model.Note
import javax.inject.Inject

class NoteRepository @Inject constructor(val dao: AppDao) {
    suspend fun insert(note: Note){
        dao.insert(note)
    }

    val notes = dao.getNotes()
}