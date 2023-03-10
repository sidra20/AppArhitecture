package com.sidra.network_data_source

import com.sidra.core.model.Posts
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private const val BASE_URL ="https://jsonplaceholder.typicode.com/"
private val retrofitBuilder = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface ApiInterface{

    @GET("posts")
    suspend fun getPosts(): Response<Posts>

}

object PostsApi {
    val retrofitService:ApiInterface by lazy{

        retrofitBuilder.create(ApiInterface::class.java)
    }
}