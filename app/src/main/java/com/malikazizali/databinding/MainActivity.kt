package com.malikazizali.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.malikazizali.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.tvHello.text = "WELCOME"
    }
}