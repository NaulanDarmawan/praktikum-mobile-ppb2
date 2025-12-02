package com.example.praktikum_mobile.repository

import com.example.praktikum_mobile.entities.Catatan
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface CatatanRepository {
    @POST("notes")
    suspend fun createCatatan(@Body catatan: Catatan): Response<Catatan>
}