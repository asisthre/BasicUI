package com.example.formapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var buttonRelativeLayout: Button
    private lateinit var buttonConstraintLayout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonRelativeLayout = findViewById(R.id.relativeLayoutButton)
        buttonConstraintLayout = findViewById(R.id.constraintLayoutButton)
        if (::buttonRelativeLayout.isInitialized) {
            buttonRelativeLayout.setOnClickListener(this)
        }
        if (::buttonConstraintLayout.isInitialized) {
            buttonConstraintLayout.setOnClickListener(this)
        }
    }

        override fun onClick(view: View?) {
            if (view == buttonRelativeLayout) {
                loadRelativeLayoutFragment()
            }
            if (view == buttonConstraintLayout) {
                loadConstraintLayoutFragment()
            }
        }


    private fun loadRelativeLayoutFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayoutForm, RelativeLayoutFragment())
    //    fragmentTransaction.show(RelativeLayoutFragment())
        fragmentTransaction.commit()
    }
    private fun loadConstraintLayoutFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayoutForm, ConstraintLayoutFragment())
      //  fragmentTransaction.show(ConstraintLayoutFragment())
        fragmentTransaction.commit()
    }
}