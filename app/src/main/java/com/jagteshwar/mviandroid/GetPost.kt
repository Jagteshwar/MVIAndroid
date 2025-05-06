package com.jagteshwar.mviandroid

import com.jagteshwar.mviandroid.network.PostApi
import com.jagteshwar.mviandroid.network.model.Post
import com.jagteshwar.mviandroida.DataState
import com.jagteshwar.mviandroida.UiComponent
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetPost(
    private val postApi: PostApi
) {

    fun execute(): Flow<DataState<List<Post>>> {
        return flow {
            emit(DataState.Loading(true))
            try {
                val posts = postApi.getPosts()
                emit(DataState.Success(data = posts))
            } catch (e: Exception) {
                e.printStackTrace()
                emit(DataState.Error(UiComponent.Toast(e.message ?: "Unknown error.")))
            } finally {
                emit(DataState.Loading(false))
            }
        }
    }
}