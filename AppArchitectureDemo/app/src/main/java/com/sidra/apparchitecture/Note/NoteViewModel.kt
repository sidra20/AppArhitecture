package com.sidra.apparchitecture.Note

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import com.sidra.core.model.Note
import com.sidra.local_data_source.AppDatabase
import com.sidra.service.MyService
import com.sidra.service.PostsService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(val service: MyService) : ViewModel() {

    var notes = service.allnotes
    var title = MutableLiveData<String>()


    init {
        viewModelScope.launch {
            service.allnotes
        }
    }
    fun insert(note: Note)= viewModelScope.launch {
        service.insert(note)
    }



    fun saveNote()
    {
        try {
            if(title.value!!.isNotEmpty()){
                val t = title.value!!.toString()

                val obj = Note(0,t)
                insert(obj)
                title.value=""



//            Toast.makeText(getApplication(), "Note Added!", Toast.LENGTH_SHORT).show()
            }
        }
        catch (e:Exception){
            Log.d("main",""+e.message)
        }

    }


}