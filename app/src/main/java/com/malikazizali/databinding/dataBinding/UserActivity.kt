package com.malikazizali.databinding.dataBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.malikazizali.databinding.R
import com.malikazizali.databinding.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    lateinit var binding : ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user)

        binding.userData = User("Royal", "Weaboo")

    }
}