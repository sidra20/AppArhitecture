package com.sidra.apparchitecture.Note

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sidra.service.MyService
import javax.inject.Inject

class NotesModelFactory @Inject constructor(private val service: MyService):
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteViewModel(service)as T
    }
}