package com.sidra.apparchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sidra.apparchitecture.Note.NoteViewModel
import com.sidra.apparchitecture.Note.NotesModelFactory
import com.sidra.apparchitecture.databinding.LayoutAddBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding:LayoutAddBinding

    lateinit var viewModel: NoteViewModel

    @Inject
    lateinit var factory: NotesModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.layout_add)

        viewModel= ViewModelProvider(this, factory).get(NoteViewModel::class.java)

//        binding.viewmodel=viewModel
//        binding.lifecycleOwner=this

    }
}