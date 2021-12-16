package com.example.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    val instanceOfStore = Store()

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

        instanceOfStore.createShoeList()

        shoeNike = findViewById(R.id.id_image_nike)
        shoeNike?.setOnClickListener {
            instanceOfStore.addToCart(it.id)
        }

        shoePolo = findViewById(R.id.id_image_polo)
        shoePolo?.setOnClickListener {
            instanceOfStore.addToCart(it.id)
        }

        shoeJordan = findViewById(R.id.id_image_jordan)
        shoeJordan?.setOnClickListener {
            instanceOfStore.addToCart(it.id)
        }

        shoeAdidas = findViewById(R.id.id_image_adidas)
        shoeAdidas?.setOnClickListener {
            instanceOfStore.addToCart(it.id)
        }

        shoeNewBalance = findViewById(R.id.id_image_new_balance)
        shoeNewBalance?.setOnClickListener {
            instanceOfStore.addToCart(it.id)
        }

        shoeReebok = findViewById(R.id.id_image_reebok)
        shoeReebok?.setOnClickListener {
            instanceOfStore.addToCart(it.id)
        }

        buttonBuy = findViewById(R.id.id_button_buy)
        buttonBuy?.setOnClickListener {
            instanceOfStore.buy()
        }

        buttonClean = findViewById(R.id.id_button_clean)
        buttonClean?.setOnClickListener {
            instanceOfStore.clean()
        }


    }


}

