package com.sidra.core.Services

import com.sidra.core.model.Note
import com.sidra.core.model.Posts

interface IPostService {
    fun getPosts(posts: Posts)

    fun getNotes(note: List<Note>)

}