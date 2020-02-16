package com.example.alliancertu.models

sealed class Result<out T : Any> {
    data class Succsess<out T : Any>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
}