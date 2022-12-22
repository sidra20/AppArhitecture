package com.sidra.service

import com.sidra.core.model.Note
import com.sidra.local_data_source.NoteRepository

class MyService(private val noteRepository: NoteRepository) {

    val allnotes = noteRepository.notes

    suspend fun insert(note: Note){
        noteRepository.insert(note)
    }
}