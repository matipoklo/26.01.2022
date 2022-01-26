package com.example.a26012022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CTV = findViewById<CheckedTextView>(R.id.CTV1)
        if (CTV != null) {
            CTV.isChecked = false
            CTV.setCheckMarkDrawable(
                android.R.drawable.checkbox_off_background)

            CTV.setOnClickListener {
                CTV.isChecked = !CTV.isChecked
                CTV.setCheckMarkDrawable(
                    if (CTV.isChecked)
                        android.R.drawable.checkbox_on_background
                    else
                        android.R.drawable.checkbox_off_background)

                //val msg = getString(R.string.msg_shown)+ " " +
                        //getString(if (CTV.isChecked)
                            //R.string.checked else R.string.unchecked)
                //Toast.makeText(this@MainActivity, msg,
                    //Toast.LENGTH_SHORT).show()
            }
    }
}
}