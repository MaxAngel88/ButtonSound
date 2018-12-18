package com.example.angelomassimino.buttonsound.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.angelomassimino.buttonsound.Constants
import com.example.angelomassimino.buttonsound.R
import com.example.angelomassimino.buttonsound.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_Capo.setOnClickListener {
            Log.i(TAG, "Capo Clicked!!")

            //Toast.makeText(context, "Capo Clicked!!", Toast.LENGTH_SHORT).show()
            showToast("Capo "+resources.getString(R.string.toast_message), Toast.LENGTH_LONG)
        }

        button_Nappi.setOnClickListener {
            Log.i(TAG, "Nappi Clicked!!")

            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        button_sendMsgNextAct.setOnClickListener {
            val message : String = et_userMessage.text.toString()

            Log.i(TAG, "sendMsgNextAct Clicked!!")

            //Move from MainActivity to SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(Constants.USER_MESSAGE_KEY, message)
            startActivity(intent)
        }

        button_share.setOnClickListener {
            val message : String = et_userMessage.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to : "))
        }

        button_recycler_view.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }

        button_gridGallery.setOnClickListener {
            val intent = Intent(this, FourActivity::class.java)
            startActivity(intent)
        }
    }

}
