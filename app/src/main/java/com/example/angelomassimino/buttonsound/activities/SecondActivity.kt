package com.example.angelomassimino.buttonsound.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.angelomassimino.buttonsound.Constants
import com.example.angelomassimino.buttonsound.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        val TAG: String = SecondActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Safe Call ?.
        // Safe Call ?.let{ }

        val bundle: Bundle? = intent.extras

        bundle?.let {
            val msg = bundle.getString(Constants.USER_MESSAGE_KEY)
            txvUserMessage.text = msg
        }
    }
}
