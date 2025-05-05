package com.jagteshwar.mviandroid.network

import com.jagteshwar.mviandroid.network.model.Post

interface PostApi {

    suspend fun getPosts(): List<Post>
}