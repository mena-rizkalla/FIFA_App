package com.example.fifaapp.manager

import com.example.fifaapp.model.FixtureResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path

interface CallFixture {

    @GET("v2/seasons/{id}/fixtures")
    @Headers(
        "X-RapidAPI-Key: 02dcb079e5msh5c3e904cc18ea5bp10e7e2jsn22047f2cb8ed",
        "X-RapidAPI-Host: elenasport-io1.p.rapidapi.com"
    )
    fun callFixture(@Path("id") id:Int) : Call<FixtureResponse>
}