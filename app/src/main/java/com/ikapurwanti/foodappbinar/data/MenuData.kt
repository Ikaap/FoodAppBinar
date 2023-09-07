package com.ikapurwanti.foodappbinar.data

import com.ikapurwanti.foodappbinar.R
import com.ikapurwanti.foodappbinar.model.Categories
import com.ikapurwanti.foodappbinar.model.Menu

object MenuData {

    private var menuImage = intArrayOf(
        R.drawable.img_menu_chicken_burger,
        R.drawable.img_menu_pizza_burger,
        R.drawable.img_menu_pancake,
        R.drawable.img_menu_supreme_veggie_burger,
        R.drawable.img_menu_pizzania,
        R.drawable.img_menu_potato_corn_burger,
    )

    private var menuName = arrayOf(
        "Chicken Burger",
        "Pizza Burger",
        "Pancake",
        "Supreme Veggie Burger",
        "Pizzania",
        "Potato Corn Burger"
    )

    private var menuPrice = doubleArrayOf(
        40000.0,
        65000.0,
        20000.0,
        65000.0,
        87000.0,
        69000.0
    )

    private var menuRating = doubleArrayOf(
        4.6,
        3.5,
        4.0,
        4.6,
        3.0,
        5.0
    )

    val listDataMenu : ArrayList<Menu>
        get() {
            val listMenu = arrayListOf<Menu>()
            for (position in menuName.indices){
                val dataMenu = Menu()
                dataMenu.image = menuImage[position]
                dataMenu.name = menuName[position]
                dataMenu.price = menuPrice[position]
                dataMenu.rating = menuRating[position]
                listMenu.add(dataMenu)
            }
            return listMenu
        }
}