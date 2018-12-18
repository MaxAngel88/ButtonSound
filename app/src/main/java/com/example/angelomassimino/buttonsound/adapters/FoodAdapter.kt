package com.example.angelomassimino.buttonsound.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.angelomassimino.buttonsound.R
import com.example.angelomassimino.buttonsound.models.Food
import kotlinx.android.synthetic.main.food_entry.view.*

class FoodAdapter(var context: Context, var foodList: ArrayList<Food> ) : BaseAdapter(){



    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val food = this.foodList[position]

        val inflator = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var foodView = inflator.inflate(R.layout.food_entry, null)
        foodView.imgFood.setImageResource(food.image!!)
        foodView.tvName.text = food.name!!

        return foodView
    }

    override fun getItem(position: Int): Any {
        return foodList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return foodList.size
    }

}