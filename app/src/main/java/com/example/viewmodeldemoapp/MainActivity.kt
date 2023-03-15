package com.example.viewmodeldemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainActivityViewModel
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // binding object
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_main)

        // View Model
        viewModel = ViewModelProvider(this)
            .get(MainActivityViewModel::class.java)

        binding.textView.text = viewModel.getCurrentCount().toString()

        binding.btn.setOnClickListener(){
            binding.textView.text = viewModel.getUpdatedCount().toString()
        }

    }
}