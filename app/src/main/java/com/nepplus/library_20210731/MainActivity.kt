package com.nepplus.library_20210731

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        photoImg.setOnClickListener {
            val myIntent = Intent(this,ViewPhotoDetailActivity::class.java)
            startActivity(myIntent)
        }
    }
}