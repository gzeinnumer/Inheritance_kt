package com.gzeinnumer.inheritancekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //call 1
        val t1 =MathTeacer(21,"Zein")
        //call 2
        t1.teachMath()

        println()

        val t2 = Footballer(18, "Pai","Barca")
        t2.playFootball()

        val p1 = AuthLog("Pass salah")
    }
}

open class Person(age : Int, name: String){
    //1 first run
    init {
        println("My name is $name")
        println("I am $age years old")
    }
}

class MathTeacer(age: Int, name: String):Person(age, name){
    //2 second run
    init {
        println("Start teach")
    }
    //3 third run
    fun teachMath(){
        println("Teaching math")
    }
}

class Footballer(age: Int, name: String, club: String):Person(age, name){
    //2 second run
    init {
        println("Club: $club")
    }
    //3 third run
    fun playFootball(){
        println("Playing")
    }
}


open class Log{
    var data: String=""
    var numberOfData = 0
    constructor(_data: String){

    }
    constructor(_data: String, _numberOfData: Int){
        data=_data
        numberOfData=_numberOfData
        println("$data : $numberOfData kali")
    }
}

class AuthLog: Log{
    constructor(_data: String): super("Dari Autlog -> + $_data"){

    }
    constructor(_data: String, _numberOfData: Int): super(_data,_numberOfData){

    }
}