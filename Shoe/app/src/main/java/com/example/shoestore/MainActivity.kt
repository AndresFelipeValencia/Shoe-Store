package com.example.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val SHOE_SELECT = "SHOE_SELECT"
    private val SHOE_COUNT = "SHOE_COUNT"
    private val SHOE_BUY = "SHOE_BUY"
    private val SHOE_CLEAN = "SHOE_CLEAN"

    private val SELECT = "select"

    private val BUY = "buy"

    private val CLEAN = "clean"

    private var shoeSelect = "select"

    private var shoeBuy = "buy"

    private var shoeClean = "clean"

    private var shoeCount = -1

    private val store = Store()
    private var shoeImage: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun clickShoeImage() {
        TODO("Not yet implemented")
    }

    private fun setViewElements() {
        TODO("Not yet implemented")
    }


}

