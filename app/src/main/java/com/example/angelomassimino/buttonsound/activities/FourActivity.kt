package com.example.angelomassimino.buttonsound.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.angelomassimino.buttonsound.R
import com.example.angelomassimino.buttonsound.adapters.FoodAdapter
import com.example.angelomassimino.buttonsound.models.Food
import kotlinx.android.synthetic.main.activity_four.*

class FourActivity : AppCompatActivity(){

    companion object {
        val TAG: String = FourActivity::class.java.simpleName
    }

    var adapter: FoodAdapter? = null
    var foodList = ArrayList<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        // Load favorite Food TODO add drawable images
        foodList.add(Food("Coca Cola", R.drawable.cocacola))
        foodList.add(Food("Arancini", R.drawable.arancini))
        foodList.add(Food("Lasagne", R.drawable.lasagne))
        foodList.add(Food("Panino",R.drawable.panino))
        foodList.add(Food("Patatine", R.drawable.patatine))
        foodList.add(Food("Pizza", R.drawable.pizza))
        foodList.add(Food("Tiramisù", R.drawable.tiramisu))

        adapter = FoodAdapter(this, foodList)

        gvFoods.adapter = adapter

    }


}