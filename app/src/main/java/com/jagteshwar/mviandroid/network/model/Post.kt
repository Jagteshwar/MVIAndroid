@file:Suppress("PLUGIN_IS_NOT_ENABLED")

package com.jagteshwar.mviandroid.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Post(
    val id: Int,
    val postId: Int,
    val title: String,
    val body: String
)
