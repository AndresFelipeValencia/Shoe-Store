package com.example.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onTouchEvent(event: MotionEvent): Boolean {
        return super.onTouchEvent(event)
    }

    private var shoeNike: ImageView? = null
    private var shoePolo: ImageView? = null
    private var shoeJordan: ImageView? = null
    private var shoeAdidas: ImageView? = null
    private var shoeNewBalance: ImageView? = null
    private var shoeReebok: ImageView? = null

    private var buttonBuy: Button? = null
    private var buttonClean: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val instanceOfStore = Store()
        instanceOfStore.createShoeList()
        instanceOfStore.addToCart()
        instanceOfStore.buy()
        instanceOfStore.clean()

        shoeNike = findViewById(R.id.id_image_nike)
        shoeNike?.setOnClickListener() {}

        shoePolo = findViewById(R.id.id_image_polo)
        shoePolo?.setOnClickListener() {}

        shoeJordan = findViewById(R.id.id_image_jordan)
        shoeJordan?.setOnClickListener() {}

        shoeAdidas = findViewById(R.id.id_image_adidas)
        shoeAdidas?.setOnClickListener() {}

        shoeNewBalance = findViewById(R.id.id_image_new_balance)
        shoeNewBalance?.setOnClickListener() {}

        shoeReebok = findViewById(R.id.id_image_reebok)
        shoeReebok?.setOnClickListener() {}

        buttonBuy = findViewById(R.id.id_button_buy)
        buttonBuy?.setOnClickListener() {}

        buttonClean = findViewById(R.id.id_button_clean)
        buttonClean?.setOnClickListener() {}


    }


}

