package com.sidra.core.Local

import com.sidra.core.model.Note
import com.sidra.core.model.Posts

interface IPostsLocalDataSorce {

    fun getNotes(note: List<Note>)
}