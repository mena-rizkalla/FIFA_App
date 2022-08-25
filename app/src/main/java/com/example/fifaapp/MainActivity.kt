package com.example.fifaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fifaapp.adapter.FixtureAdapter
import com.example.fifaapp.databinding.ActivityMainBinding
import com.example.fifaapp.manager.RequestManager
import com.example.fifaapp.model.FixtureResponse
import kotlinx.coroutines.*
import retrofit2.Retrofit

 class MainActivity : AppCompatActivity(), ResponseListener {

    lateinit var binding  : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


       getData()
    }

     fun getData(){
        var requestManager = RequestManager(this)
        requestManager.getFixture(this,1331)

    }

    override fun didfitch(response: FixtureResponse, message: String) {
        binding.recyclerFixture.setHasFixedSize(true)
        binding.recyclerFixture.layoutManager = LinearLayoutManager(applicationContext)
        var fixtureAdapter = FixtureAdapter(applicationContext,response.data)
        binding.recyclerFixture.adapter = fixtureAdapter
    }

    override fun didEroor(message: String) {
        TODO("Not yet implemented")
    }


}