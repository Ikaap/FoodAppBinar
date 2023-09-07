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
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(menuList[position])
    }
    inner class ViewHolder(private val binding: ItemMenuBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(menu : Menu){
            with(binding){
                ivMenuImage.setImageResource(menu.image)
                tvMenuName.text = menu.name
                tvMenuPrice.text = menu.price.toString()
                tvMenuRating.text = menu.rating.toString()

            }
        }
    }
    override fun getItemCount(): Int {
        return menuList.size
    }


}