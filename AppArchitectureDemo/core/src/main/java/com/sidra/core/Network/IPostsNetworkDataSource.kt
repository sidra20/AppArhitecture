package com.sidra.core.Network

import com.sidra.core.model.Posts

interface IPostsNetworkDataSource {
    fun getPosts(posts: Posts) : Posts
}