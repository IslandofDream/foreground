package com.example.foreground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foreground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            val intent = Intent(this@MainActivity, MusicPlayerService::class.java)
            intent.action = Actions.START_FOREGROUND
            startService(intent)
        }

        binding.btnStop.setOnClickListener {
            val intent = Intent(this@MainActivity, MusicPlayerService::class.java)
            intent.action = Actions.STOP_FOREGROUND
            startService(intent)
        }
    }
}