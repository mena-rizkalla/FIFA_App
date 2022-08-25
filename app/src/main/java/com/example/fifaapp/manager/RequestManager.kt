package com.example.fifaapp.manager

import android.content.Context
import android.widget.Toast
import com.example.fifaapp.ResponseListener
import com.example.fifaapp.model.FixtureData
import com.example.fifaapp.model.FixtureResponse
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class RequestManager(val context: Context) {


    val retrofit = Retrofit.Builder().baseUrl("https://elenasport-io1.p.rapidapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

     val callFixture : CallFixture = retrofit.create(CallFixture::class.java)

      fun getFixture(responseListener: ResponseListener, id : Int){
         val call : Call<FixtureResponse> = callFixture.callFixture(id)
         call.enqueue(object : Callback<FixtureResponse> {
             override fun onResponse(
                 call: Call<FixtureResponse>,
                 response: Response<FixtureResponse>
             ) {

               responseListener.didfitch(response.body()!!,response.message())

             }

             override fun onFailure(call: Call<FixtureResponse>, t: Throwable) {
                // Toast.makeText(context,call.toString(),Toast.LENGTH_SHORT).show()
             }

         })
     }


}