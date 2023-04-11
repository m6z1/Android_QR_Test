package com.example.qr_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.qr_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var btnCreate: Button
    private lateinit var btnRead: Button

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        btnCreate = binding.QRCreate
        btnRead = binding.QRRead

        btnCreate.setOnClickListener {
            val intent = Intent(this, CreateQRActivity::class.java)
            startActivity(intent)
        }
    }
}