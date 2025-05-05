package com.jagteshwar.mviandroid.network.model

import com.jagteshwar.mviandroid.network.PostApi
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.url

class PostApiImpl(
    private val client: HttpClient
): PostApi {
    override suspend fun getPosts(): List<Post> {
        return client.get {
            url("https://jsonplaceholder.typicode.com/posts")
        }.body<List<Post>>()
    }
}