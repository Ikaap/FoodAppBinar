package com.ikapurwanti.foodappbinar.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ikapurwanti.foodappbinar.databinding.ItemCategoriesBinding
import com.ikapurwanti.foodappbinar.model.Categories

class CategoriesAdapter(private val categoriesList : ArrayList<Categories>) : RecyclerView.Adapter<CategoriesAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCategoriesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(categoriesList[position])
    }
    inner class ViewHolder(private val binding: ItemCategoriesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(categories: Categories){
            with(binding){
                ivCategories.setImageResource(categories.image)
                tvNameCategories.text = categories.name
            }
        }
    }
    override fun getItemCount(): Int {
        return categoriesList.size
    }
}

