package com.jagteshwar.mviandroid

import com.jagteshwar.mviandroid.network.PostApi
import com.jagteshwar.mviandroid.network.model.Post
import com.jagteshwar.mviandroida.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetPost(
    private val postApi: PostApi
) {

    fun execute(): Flow<DataState<List<Post>>> {
        return flow {

        }
    }
}