package com.makhalibagas.walkthroughscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.viewpager.widget.ViewPager
import com.makhalibagas.walkthroughscreen.databinding.ActivityOnboardingBinding

@Suppress("DEPRECATION")
class OnboardingActivity : AppCompatActivity() {

    private val onBoardList = listOf(
            OnBoard(R.drawable.learn_svg, "Learn","Practice with real\nexercices and projects for\nyour portfolio"),
            OnBoard(R.drawable.code_svg,"Code" ,"Learn how to code great\nvideo game interfaces for\ndifferent devices "),
            OnBoard(R.drawable.collect_svg,  "Collect","Collect case studies of the\nbest teachers in the\name industry")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = resources.getColor(android.R.color.white)
        val binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btstarted.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()

        }

        binding.tabs.setupWithViewPager(binding.onboardViewPager, true)

        binding.onboardViewPager.apply {
            adapter = OnboardingAdapter(this@OnboardingActivity, onBoardList, binding.onboardViewPager)

            addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}
                override fun onPageSelected(position: Int) {}
                override fun onPageScrollStateChanged(state: Int) {}
            })
        }
    }
}