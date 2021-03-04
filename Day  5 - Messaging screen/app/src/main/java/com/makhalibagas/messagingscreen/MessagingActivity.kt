package com.makhalibagas.messagingscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

@Suppress("DEPRECATION")
class MessagingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = resources.getColor(R.color.purple_200)
        setContentView(R.layout.activity_messaging)


        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
    }
}