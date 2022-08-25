package com.example.fifaapp

import com.example.fifaapp.model.FixtureResponse

interface ResponseListener {
    fun didfitch(response: FixtureResponse , message : String)
    fun didEroor(message: String)
}