package com.ikapurwanti.foodappbinar.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ikapurwanti.foodappbinar.databinding.ItemMenuBinding
import com.ikapurwanti.foodappbinar.model.Menu

class MenuAdapter (private var menuList : ArrayList<Menu>) : RecyclerView.Adapter<MenuAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return menuList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.menuImage.setImageResource(menuList[position].image)
        holder.menuName.text = menuList[position].name
        holder.menuPrice.text = menuList[position].price.toString()
        holder.menuRating.text = menuList[position].rating.toString()
    }

    class ViewHolder(binding: ItemMenuBinding) : RecyclerView.ViewHolder(binding.root) {
        val menuImage = binding.ivMenuImage
        val menuName = binding.tvMenuName
        val menuPrice = binding.tvMenuPrice
        val menuRating = binding.tvMenuRating
    }

}