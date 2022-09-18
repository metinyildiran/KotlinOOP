package com.example.kotlinoop

class Musician(name:String, instrument:String, age: Int) {

    // Encapsulation

    var name: String? = name
        get
        private set

    var instrument: String? = instrument
    var age: Int? = age
        get
        private set

}