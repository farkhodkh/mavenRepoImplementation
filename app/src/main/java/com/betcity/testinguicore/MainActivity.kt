package com.betcity.testinguicore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.betcity.testinguicore.databinding.ActivityMainBinding
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val b = PrimaryButton()
    }
}