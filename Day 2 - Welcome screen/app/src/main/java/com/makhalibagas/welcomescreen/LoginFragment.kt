package com.makhalibagas.welcomescreen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.annotation.NonNull
import com.makhalibagas.welcomescreen.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding =  FragmentLoginBinding.inflate(layoutInflater, container, false)
        getActivity()?.getWindow()?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)
        onClick(binding)
        return binding.root
    }

    private fun onClick(binding: FragmentLoginBinding) {
        binding.btLogin.setOnClickListener {
            startActivity(Intent(context, MainActivity::class.java))
            activity?.finish()
        }
    }
}