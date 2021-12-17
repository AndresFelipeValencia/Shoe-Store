package com.example.shoestore
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val instanceOfStore = Store()

    var shoeNike: ImageView? = null
    var shoePolo: ImageView? = null
    var shoeJordan: ImageView? = null
    var shoeAdidas: ImageView? = null
    var shoeNewBalance: ImageView? = null
    var shoeReebok: ImageView? = null
    var addToCar: ImageView? = null
    var quantityShoe: TextView? = null

    private var buttonBuy: Button? = null
    private var buttonClean: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        instanceOfStore.createShoeList()

        shoeNike = findViewById(R.id.id_image_nike)
        shoeNike?.setOnClickListener {
            instanceOfStore.addToCart(0)
        }

        shoePolo = findViewById(R.id.id_image_polo)
        shoePolo?.setOnClickListener {
            instanceOfStore.addToCart(1)
        }

        shoeJordan = findViewById(R.id.id_image_jordan)
        shoeJordan?.setOnClickListener {
            instanceOfStore.addToCart(2)
        }

        shoeAdidas = findViewById(R.id.id_image_adidas)
        shoeAdidas?.setOnClickListener {
            instanceOfStore.addToCart(3)
        }

        shoeNewBalance = findViewById(R.id.id_image_new_balance)
        shoeNewBalance?.setOnClickListener {
            instanceOfStore.addToCart(4)
        }

        shoeReebok = findViewById(R.id.id_image_reebok)
        shoeReebok?.setOnClickListener {
            instanceOfStore.addToCart(5)
        }

//        addToCar = findViewById(R.id.id_number_shoe)
//        addToCar?.setOnClickListener {
//            instanceOfStore.addToCart(it.id)
//        }

        quantityShoe = findViewById(R.id.id_number_shoe)
        instanceOfStore.quantityShoe()

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

