package com.example.viewmodeldemo2

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    //private var num1 : Int = 0
    //private var num2 : Int = 0
    //private var num3 : Int = 0

    private var sum = 0

    fun getSum(): Int{
        return sum
    }

    fun setSum(input:Int){
        sum += input
    }

}