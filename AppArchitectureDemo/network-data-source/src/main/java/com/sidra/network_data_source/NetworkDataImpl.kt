package com.sidra.network_data_source

import com.sidra.core.Network.IPostsNetworkDataSource
import com.sidra.core.model.Posts
import retrofit2.Response
import retrofit2.http.GET

class NetworkDataImpl : IPostsNetworkDataSource {

    override fun getPosts(posts: Posts) : Posts {

       return posts

    }
}