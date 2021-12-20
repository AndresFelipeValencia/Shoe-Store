package com.example.shoestore
import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val instanceOfStore = Store()

    var shoeNike: ImageView? = null
    var shoePolo: ImageView? = null
    var shoeJordan: ImageView? = null
    var shoeAdidas: ImageView? = null
    var shoeNewBalance: ImageView? = null
    var shoeReebok: ImageView? = null
    var quantityShoe: TextView? = null
    private var buttonBuy: Button? = null
    private var buttonClean: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shoeNike = findViewById(R.id.id_image_nike)
        shoePolo = findViewById(R.id.id_image_polo)
        shoeJordan = findViewById(R.id.id_image_jordan)
        shoeAdidas = findViewById(R.id.id_image_adidas)
        shoeNewBalance = findViewById(R.id.id_image_new_balance)
        shoeReebok = findViewById(R.id.id_image_reebok)
        buttonBuy = findViewById(R.id.id_button_buy)
        buttonClean = findViewById(R.id.id_button_clean)
        quantityShoe = findViewById(R.id.id_number_shoe)

        instanceOfStore.createShoeList()


        shoeNike?.setOnClickListener {
            instanceOfStore.addToCart(0, requireContext = this)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }


        shoePolo?.setOnClickListener {
            instanceOfStore.addToCart(1, requireContext = this)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }


        shoeJordan?.setOnClickListener {
            instanceOfStore.addToCart(2, requireContext = this)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }


        shoeAdidas?.setOnClickListener {
            instanceOfStore.addToCart(3, requireContext = this)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }


        shoeNewBalance?.setOnClickListener {
            instanceOfStore.addToCart(4, requireContext = this)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }


        shoeReebok?.setOnClickListener {
            instanceOfStore.addToCart(5, requireContext = this)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }


        buttonBuy?.setOnClickListener {
            instanceOfStore.buy(requireContext = this)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }


        buttonClean?.setOnClickListener {
            instanceOfStore.clean(requireContext = this)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }

    }

}

