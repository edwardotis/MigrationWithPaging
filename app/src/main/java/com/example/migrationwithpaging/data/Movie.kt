package com.example.migrationwithpaging.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Movie(
    @PrimaryKey
    val id: Int,
    @SerializedName("popularity")
    val popularity: Double,
    @SerializedName("original_title")
    val title: String,
    @SerializedName("poster_path")
    val posterPath: String
)