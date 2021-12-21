package com.example.shoestore
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val instanceOfStore = Store()

    var shoeNikeView: ImageView? = null
    var shoePoloView: ImageView? = null
    var shoeJordanView: ImageView? = null
    var shoeAdidasView: ImageView? = null
    var shoeNewBalanceView: ImageView? = null
    var shoeReebokView: ImageView? = null
    var quantityShoe: TextView? = null
    private var buttonBuy: Button? = null
    private var buttonClean: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shoeNikeView = findViewById(R.id.image_nike)
        shoePoloView = findViewById(R.id.image_polo)
        shoeJordanView = findViewById(R.id.image_jordan)
        shoeAdidasView = findViewById(R.id.image_adidas)
        shoeNewBalanceView = findViewById(R.id.image_new_balance)
        shoeReebokView = findViewById(R.id.image_reebok)
        buttonBuy = findViewById(R.id.button_buy)
        buttonClean = findViewById(R.id.button_clean)
        quantityShoe = findViewById(R.id.number_shoe)

        instanceOfStore.createShoeList()

        instanceOfStore.listShoe.forEach { shoe ->
              when(shoe.brand) {
                  EnumBrand.NIKE -> shoeNikeView!!.setImageResource(shoe.imageId)
                  EnumBrand.POLO -> shoePoloView!!.setImageResource(shoe.imageId)
                  EnumBrand.JORDAN -> shoeJordanView!!.setImageResource(shoe.imageId)
                  EnumBrand.ADIDAS -> shoeAdidasView!!.setImageResource(shoe.imageId)
                  EnumBrand.NEWBALANCE -> shoeNewBalanceView!!.setImageResource(shoe.imageId)
                  EnumBrand.REEBOK -> shoeReebokView!!.setImageResource(shoe.imageId)
              }
        }

        shoeNikeView?.setOnClickListener {
            instanceOfStore.addToCart(0, requireContext = this, imageView = shoeNikeView!!)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }

        shoePoloView?.setOnClickListener {
            instanceOfStore.addToCart(1, requireContext = this, imageView = shoePoloView!!)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }

        shoeJordanView?.setOnClickListener {
            instanceOfStore.addToCart(2, requireContext = this, imageView = shoeJordanView!!)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }

        shoeAdidasView?.setOnClickListener {
            instanceOfStore.addToCart(3, requireContext = this, imageView = shoeAdidasView!!)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }

        shoeNewBalanceView?.setOnClickListener {
            instanceOfStore.addToCart(4, requireContext = this, imageView = shoeNewBalanceView!!)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }

        shoeReebokView?.setOnClickListener {
            instanceOfStore.addToCart(5, requireContext = this, imageView = shoeReebokView!!)
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

