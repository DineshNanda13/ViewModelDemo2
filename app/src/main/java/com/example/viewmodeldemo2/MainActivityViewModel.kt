package com.example.viewmodeldemo2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int) : ViewModel() {

    //private var num1 : Int = 0
    //private var num2 : Int = 0
    //private var num3 : Int = 0

    //private var sum = 0

    private var sum = MutableLiveData<Int>()
    val totalData : LiveData<Int>
    get() = sum

    /*The code inside the init block is the first to be executed when the class is instantiated.
    The init block is run every time the class is instantiated,
    with any kind of constructor as we shall see next. Multiple initializer blocks can be written in a class.*/
    init{
        //sum = startingTotal
        sum.value = startingTotal
    }

    /*fun getSum(): Int{
        return sum
    }*/

    fun setSum(input:Int){
        //sum += input
        sum.value = (sum.value)?.plus(input)
    }

}