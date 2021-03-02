package com.makhalibagas.welcomescreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.makhalibagas.welcomescreen.databinding.ActivityWelcomeBinding

@Suppress("DEPRECATION")
class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = resources.getColor(R.color.purple_200)
        val binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}