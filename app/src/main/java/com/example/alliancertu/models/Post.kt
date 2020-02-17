package com.example.alliancertu.models

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Post(
    @PrimaryKey val idPosta: Int,
    @ColumnInfo(name = "textPost") val textPosta: String,
    @ColumnInfo(name = "headingPost") val headingPosta: String,
    @ColumnInfo(name = "imagePost") val imagePosta: Bitmap
)