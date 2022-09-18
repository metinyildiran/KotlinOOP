package com.example.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myUser = User("James", 25)
        myUser.name = "Lars"
        myUser.age = 50

        println(myUser.name)
        println(myUser.age)

        val james = Musician("James", "Guitar", 55)

        println(james.age)

        val lars = SuperMusician("Lars", "Drums", 60)
        lars.sing()
    }
}