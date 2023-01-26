package com.example.demoapi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface APIService {
    // @Path
    @GET("posts/{id}/comments")
    fun getListCommentByPath(@Path("id") postId: Int): Call<MutableList<User>>

    // @Query
    @GET("comments")
    fun getListCommentByQuery(@Query("postId") postId: Int): Call<MutableList<User>>
}