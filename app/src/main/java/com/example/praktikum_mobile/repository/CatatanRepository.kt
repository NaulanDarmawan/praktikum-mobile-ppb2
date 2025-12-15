package com.example.praktikum_mobile.repository

import com.example.praktikum_mobile.entities.Catatan
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface CatatanRepository {
    @POST("notes")
    suspend fun createCatatan(@Body catatan: Catatan): Response<Catatan>

    @GET("notes")
    suspend fun getCatatan(): Response<List<Catatan>>

    @GET("notes/{id}")
    suspend fun getCatatan(@Path("id") id: Int): Response<Catatan>

    @PUT("notes/{id}")
    suspend fun editCatatan(@Path("id") id: Int, @Body catatan: Catatan): Response<Catatan>
}