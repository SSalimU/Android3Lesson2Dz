package com.example.android3lesson2dz.data.network.apiserveces

import com.example.android3lesson2dz.models.LocationModel
import com.example.android3lesson2dz.models.RickAndMortyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface LocationApiService {

    @GET("/api/location")
    fun fetchLocations(): Call<RickAndMortyResponse<LocationModel>>

    @GET("/api/location/{id}")
    fun fetchDetailLocation(@Path("id") id : Int): Call<LocationModel>
}
