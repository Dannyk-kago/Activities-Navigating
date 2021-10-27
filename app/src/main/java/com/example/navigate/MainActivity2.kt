package com.example.navigate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigate.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val actionBar = supportActionBar

        actionBar!!.title = "Second Activity"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}