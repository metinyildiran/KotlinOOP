package com.example.kotlinoop

class User : People {

    // Property
    var name: String? = null
    var age: Int? = null

    // Constructor vs init

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
        println("constructor")
    }

    init {
        println("init")
    }
}