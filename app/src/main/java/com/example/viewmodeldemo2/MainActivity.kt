package com.example.viewmodeldemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    //private var num1 : Int = 0
    //private var num2 : Int = 0
    //private var num3 : Int = 0

    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.textView.text = viewModel.getSum().toString()

        binding.button.setOnClickListener {
            /*var str1 = binding.textView.text.toString()
            num1 = str1.toInt()
            var str2 = binding.editText.text.toString()
            num2 = str2.toInt()
            num3 = num2 + num1
            binding.textView.text = num3.toString()*/

            viewModel.setSum(binding.editText.text.toString().toInt())
            binding.textView.text = viewModel.getSum().toString()

        }
    }
}