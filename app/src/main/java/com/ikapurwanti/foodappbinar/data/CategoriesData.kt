package com.ikapurwanti.foodappbinar.data

import com.ikapurwanti.foodappbinar.R
import com.ikapurwanti.foodappbinar.model.Categories


object CategoriesData {

    private var categoriesImage = intArrayOf(
        R.drawable.img_ctg_pizza,
        R.drawable.img_ctg_pancake,
        R.drawable.img_ctg_noodle,
        R.drawable.img_ctg_icecream,
        R.drawable.img_ctg_sandwich,
    )

    private var categoriesName = arrayOf(
        "Pizza",
        "Pancake",
        "Noodle",
        "Ice Cream",
        "Sandwich",
    )

    val listDataCategories : ArrayList<Categories>
        get() {
            val listCategories = arrayListOf<Categories>()
            for (position in categoriesName.indices){
                val dataCategories = Categories()
                dataCategories.image = categoriesImage[position]
                dataCategories.name = categoriesName[position]
                listCategories.add(dataCategories)
            }
            return listCategories
        }
}