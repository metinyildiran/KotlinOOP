package com.example.kotlinoop

class SuperMusician(name: String, instrument: String, age: Int) : Musician(name, instrument, age) {

    fun sing(){
        println("la la la...")
    }

}