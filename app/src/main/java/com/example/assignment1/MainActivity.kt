package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvNumber =findViewById<RecyclerView>(R.id.rvnumbers)

        rvNumber.layoutManager=
            LinearLayoutManager(baseContext)
        val numberAdapter =fibonaccirvAdapter(fibonacci(maxNumber = 100))
        rvNumber.adapter=numberAdapter
    }

  
}
fun fibonacci(maxNumber:Int):MutableList<BigInteger>{
    var count=0;
    var firstNumber=0.toBigInteger()
    var secondNumber=1.toBigInteger()
    var sum = 0.toBigInteger()
    var fibNumbers= mutableListOf<BigInteger>()
    while(count<=maxNumber){
        println(firstNumber)
        sum = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = sum
        count ++
        fibNumbers.add(firstNumber)
    }
    return fibNumbers
}