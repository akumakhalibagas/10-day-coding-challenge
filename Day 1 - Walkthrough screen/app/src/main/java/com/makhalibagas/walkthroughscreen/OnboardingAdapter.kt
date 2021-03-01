package com.makhalibagas.walkthroughscreen

import android.content.Context
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.makhalibagas.walkthroughscreen.databinding.ContentOnboardBinding

class OnboardingAdapter(
        private val context: Context,
        private val onBoard: List<OnBoard>,
        private val onboardViewPager : ViewPager
) : PagerAdapter() {

    override fun getCount(): Int = onBoard.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean = view === `object`

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val binding = ContentOnboardBinding.inflate(LayoutInflater.from(context), container, false)
        binding.image.setImageResource(onBoard[position].image)
        binding.tvTitle.setText(onBoard[position].title)
        binding.tvDesc.setText(onBoard[position].desc)

        onboardViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

                if (position == 0){

                    binding.bg1.visibility = View.VISIBLE
                    binding.bg2.visibility = View.GONE
                    binding.bg3.visibility = View.GONE

                }else if (position == 1){

                    binding.bg1.visibility = View.GONE
                    binding.bg2.visibility = View.VISIBLE
                    binding.bg3.visibility = View.GONE

                }else{

                    binding.bg1.visibility = View.GONE
                    binding.bg2.visibility = View.GONE
                    binding.bg3.visibility = View.VISIBLE

                }
            }

            override fun onPageSelected(position: Int) {

            }
        })

        container.addView(binding.root)
        return binding.root
    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view = `object` as View
        container.removeView(view)
    }

}