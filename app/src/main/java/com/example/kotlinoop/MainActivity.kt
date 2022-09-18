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
        println(myUser.information())

        println(myUser.name)
        println(myUser.age)

        val james = Musician("James", "Guitar", 55)

        println(james.age)

        val lars = SuperMusician("Lars", "Drums", 60)
        lars.sing()

        // Static Polymorphism
        val mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(5,12, 13))

        // Dynamic Polymorphism
        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()

        // Abstract and Interface

        val myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = true
        println(myPiano.roomName)
        myPiano.info()
    }
}