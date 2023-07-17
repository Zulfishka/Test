package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initClickers()
    }

    private fun initClickers() {
        with(binding) {
        plusBtn.setOnClickListener {
            resultTv.text=Math().add(firstEd.text.toString(), secondEd.text.toString())
        }

        devideBtn.setOnClickListener {
            resultTv.text = Math().divide(firstEd.text.toString(),secondEd.text.toString())
        }
    }
}
}