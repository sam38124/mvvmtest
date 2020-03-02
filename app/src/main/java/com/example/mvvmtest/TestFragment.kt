package com.example.mvvmtest

import androidx.databinding.DataBindingUtil
import com.example.mvvmtest.databinding.ActivityMainBinding
import com.example.mvvmtest.model.Test
import com.orange.jzchi.jzframework.JzFragement

class TestFragment() :JzFragement(R.layout.activity_main){
    override fun viewInit() {
        val binding= ActivityMainBinding.bind(rootview) as ActivityMainBinding
        val user =  Test("xzxxzzx",11);
        binding.user = user;
        user.mUserName="fuck"
    }

}