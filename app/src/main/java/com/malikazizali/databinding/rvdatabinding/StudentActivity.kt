package com.malikazizali.databinding.rvdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.malikazizali.databinding.R
import com.malikazizali.databinding.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {
    lateinit var binding : ActivityStudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_student)

        val listStudent = arrayListOf(
            Student("Royal", "01391", R.drawable.student),
            Student("Weaboo", "34123", R.drawable.student)
        )

        binding.rvStudent.adapter = StudentAdapter(listStudent)
        binding.rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }
}