package com.ikapurwanti.foodappbinar.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ikapurwanti.foodappbinar.databinding.ItemCategoriesBinding
import com.ikapurwanti.foodappbinar.model.Categories


class CategoriesAdapter (private var categoriesList : ArrayList<Categories>) : RecyclerView.Adapter<CategoriesAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCategoriesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.categoriesImage.setImageResource(categoriesList[position].image)
        holder.categoriesName.text = categoriesList[position].name
    }

    class ViewHolder(binding: ItemCategoriesBinding) : RecyclerView.ViewHolder(binding.root) {
        val categoriesImage = binding.ivCategories
        val categoriesName = binding.tvNameCategories
    }

}

