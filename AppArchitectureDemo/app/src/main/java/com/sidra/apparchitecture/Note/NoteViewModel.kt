package com.sidra.apparchitecture.Note

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.sidra.core.model.Note
import com.sidra.local_data_source.AppDatabase
import com.sidra.service.PostsService

class NoteViewModel(val service: PostsService) : ViewModel() {

    fun getNote(note: List<Note>){
        service.getNotes(note)
    }

}