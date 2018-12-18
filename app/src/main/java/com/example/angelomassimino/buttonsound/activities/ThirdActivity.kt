package com.example.angelomassimino.buttonsound.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.angelomassimino.buttonsound.R
import com.example.angelomassimino.buttonsound.showToast

class ThirdActivity : AppCompatActivity() {

    companion object {
        val TAG: String = ThirdActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        //Toast.makeText(context, "Benvenuto :-)", Toast.LENGTH_SHORT).show()
        showToast("Benvenuto :-)")
    }
}
