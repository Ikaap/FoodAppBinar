package com.ikapurwanti.foodappbinar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ikapurwanti.foodappbinar.adapter.CategoriesAdapter
import com.ikapurwanti.foodappbinar.adapter.MenuAdapter
import com.ikapurwanti.foodappbinar.data.CategoriesData
import com.ikapurwanti.foodappbinar.data.MenuData
import com.ikapurwanti.foodappbinar.databinding.ActivityMainBinding
import com.ikapurwanti.foodappbinar.model.Categories
import com.ikapurwanti.foodappbinar.model.Menu


class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private var listCategories : ArrayList<Categories> = arrayListOf()
    private var listMenu : ArrayList<Menu> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        showRecyclerCategories()

        showRecyclerMenu()
    }

    private fun showRecyclerMenu() {
        binding.rvRecommended.setHasFixedSize(true)
        listMenu.addAll(MenuData.listDataMenu)

        binding.rvRecommended.layoutManager = LinearLayoutManager(this)
        val recommendedAdapter = MenuAdapter(listMenu)
        binding.rvRecommended.adapter = recommendedAdapter
    }

    private fun showRecyclerCategories() {
        binding.rvCategories.setHasFixedSize(true)
        listCategories.addAll(CategoriesData.listDataCategories)

        binding.rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val categoriesAdapter = CategoriesAdapter(listCategories)
        binding.rvCategories.adapter = categoriesAdapter
    }
}
