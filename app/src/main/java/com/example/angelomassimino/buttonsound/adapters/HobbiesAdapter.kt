package com.example.angelomassimino.buttonsound.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.angelomassimino.buttonsound.models.Hobby
import com.example.angelomassimino.buttonsound.R
import com.example.angelomassimino.buttonsound.showToast
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter(val context: Context, private val hobbies : List<Hobby>) : RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>(){

    companion object {
        val TAG: String = HobbiesAdapter::class.java.simpleName
    }

    // Create a layout for every elemenent to list
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, p0, false)
        return MyViewHolder(view)
    }

    // Return the length of the list
    override fun getItemCount(): Int {
        return hobbies.size
    }

    // Bind the data and the view
    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        val hobby = hobbies[p1]
        p0.setData(hobby, p1)

    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var currentHobby : Hobby? = null
        var currentPosition : Int = 0

        init {
            itemView.setOnClickListener {
                //Toast.makeText(context, currentHobby!!.title + " Clicked!", Toast.LENGTH_SHORT).show()
                currentHobby?.let {
                    context.showToast(it.title +" "+context.resources.getString(R.string.toast_message))
                }
            }

            itemView.imgShare.setOnClickListener{
                currentHobby?.let {
                    val message : String = "My Hobby is: " + it.title

                    val intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, message)
                    intent.type = "text/plain"

                    context.startActivity(Intent.createChooser(intent, "Share to : "))
                }
            }
        }

        fun setData(hobby: Hobby?, pos: Int){
            hobby?.let {
                itemView.txvTitle.text = hobby.title
            }
            this.currentHobby = hobby
            this.currentPosition = pos
        }

    }

}
