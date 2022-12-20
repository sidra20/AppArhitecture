package com.sidra.core.Local

import com.sidra.core.model.Posts

interface IPostsLocalDataSorce {

    fun getPosts(posts: Posts)
}