package com.malikazizali.databinding.rvdatabinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.malikazizali.databinding.databinding.ItemStudentBinding

class StudentAdapter(var listStudent : ArrayList<Student>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder(val binding : ItemStudentBinding) : RecyclerView.ViewHolder(binding.root) {
        fun dataBind(itemData : Student){
            binding.dataStudent = itemData
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var v = ItemStudentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataBind(listStudent[position])
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }
}