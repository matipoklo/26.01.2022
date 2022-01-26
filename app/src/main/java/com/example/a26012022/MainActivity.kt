package com.example.a26012022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val CTV = findViewById<CheckedTextView>(R.id.CTV1)
        val CTV2 = findViewById<CheckedTextView>(R.id.CTV2)
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

                val msg = getString(R.string.msg_shown)+ " " +
                        getString(if (CTV.isChecked)
                            R.string.zaznaczony else R.string.niezaznaczony)
                Toast.makeText(this@MainActivity, msg,
                    Toast.LENGTH_SHORT).show()
            }
            if (CTV2 != null) {
                CTV2.isChecked = false
                CTV2.setCheckMarkDrawable(
                    android.R.drawable.checkbox_off_background)

                CTV2.setOnClickListener {
                    CTV2.isChecked = !CTV2.isChecked
                    CTV2.setCheckMarkDrawable(
                        if (CTV2.isChecked)
                            android.R.drawable.checkbox_on_background
                        else
                            android.R.drawable.checkbox_off_background)

                    val msg = getString(R.string.msg_shown2)+ " " +
                            getString(if (CTV2.isChecked)
                                R.string.zaznaczony else R.string.niezaznaczony)
                    Toast.makeText(this@MainActivity, msg,
                        Toast.LENGTH_SHORT).show()
                }


            }


}
}}
