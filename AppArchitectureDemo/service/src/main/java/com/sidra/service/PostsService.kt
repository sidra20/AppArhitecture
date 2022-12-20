package com.sidra.service

import com.sidra.core.Local.IPostsLocalDataSorce
import com.sidra.core.Network.IPostsNetworkDataSource
import com.sidra.core.Services.IPostService
import com.sidra.core.model.Posts

class PostsService(val local : IPostsLocalDataSorce, val networkDataSource: IPostsNetworkDataSource) : IPostService{
    override fun getPosts(posts: Posts) {
        networkDataSource.getPosts(posts)

    }
}