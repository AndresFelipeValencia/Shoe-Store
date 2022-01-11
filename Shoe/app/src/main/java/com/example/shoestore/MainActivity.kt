package com.example.shoestore
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.shoestore.EnumBrand.*
import com.example.shoestore.adapter.ItemAdapter
import com.example.shoestore.data.Datasource

class MainActivity : AppCompatActivity() {
    private val instanceOfStore = Store()

    var shoeNikeView: ImageView? = null
    var shoePoloView: ImageView? = null
    private var shoeJordanView: ImageView? = null
    var shoeAdidasView: ImageView? = null
    var shoeNewBalanceView: ImageView? = null
    var shoeReebokView: ImageView? = null
    var quantityShoe: TextView? = null
    private var buttonBuy: Button? = null
    private var buttonClean: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadShoes()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)

        buttonBuy = findViewById(R.id.button_buy)
        buttonClean = findViewById(R.id.button_clean)
        quantityShoe = findViewById(R.id.number_shoe)

//        shoeNikeView = findViewById(R.id.image_nike)
//        shoePoloView = findViewById(R.id.image_polo)
//        shoeJordanView = findViewById(R.id.image_jordan)
//        shoeAdidasView = findViewById(R.id.image_adidas)
//        shoeNewBalanceView = findViewById(R.id.image_new_balance)
//        shoeReebokView = findViewById(R.id.image_reebok)

        instanceOfStore.createShoeList()

        instanceOfStore.listShoe.forEach { shoe ->
            when (shoe.brand) {
                NIKE -> shoeNikeView!!.setImageResource(shoe.imageId)
                POLO -> shoePoloView!!.setImageResource(shoe.imageId)
                JORDAN -> shoeJordanView!!.setImageResource(shoe.imageId)
                ADIDAS -> shoeAdidasView!!.setImageResource(shoe.imageId)
                NEWBALANCE -> shoeNewBalanceView!!.setImageResource(shoe.imageId)
                REEBOK -> shoeReebokView!!.setImageResource(shoe.imageId)
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
            instanceOfStore.clean(0, requireContext = this, imageView = shoeNikeView!!)
            instanceOfStore.clean(1, requireContext = this, imageView = shoePoloView!!)
            instanceOfStore.clean(2, requireContext = this, imageView = shoeJordanView!!)
            instanceOfStore.clean(3, requireContext = this, imageView = shoeAdidasView!!)
            instanceOfStore.clean(4, requireContext = this, imageView = shoeNewBalanceView!!)
            instanceOfStore.clean(5, requireContext = this, imageView = shoeReebokView!!)
            quantityShoe!!.text = instanceOfStore.quantityShoe().toString()
        }
    }

}

//            instanceOfStore.listShoe.forEach { shoe ->
//                when (shoe.brand) {
//
//                    else ->
//                }
//            }

