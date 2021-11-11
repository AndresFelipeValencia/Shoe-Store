package com.example.shoestore

import android.widget.ImageView
import java.util.ArrayList

class Store {

    private val shoes = ArrayList<Shoe>()

    private fun addToCart() {

    }

    private fun buy() {
    }

    private fun clean() {
    }

    private fun createShoeList() {
        val shoeNike = Shoe()
        shoeNike.brand = "nike"
        shoeNike.image = R.id.imageView
        shoes.add(shoeNike)

        val shoeAdidas = Shoe()
        shoeAdidas.brand = "adidas"
        shoeAdidas.image = R.id.imageView2
        shoes.add(shoeAdidas)

        val shoeReebok = Shoe()
        shoeReebok.brand = "reebok"
        shoeReebok.image = R.id.imageView3
        shoes.add(shoeReebok)

        val shoePolo = Shoe()
        shoePolo.brand = "polo"
        shoePolo.image = R.id.imageView4
        shoes.add(shoeReebok)

        val shoeJordan = Shoe()
        shoeJordan.brand = "jordan"
        shoeJordan.image = R.id.imageView5
        shoes.add(shoeJordan)

        val shoeNewBalance = Shoe()
        shoeNewBalance.brand = "newbalance"
        shoeNewBalance.image = R.id.imageView6
        shoes.add(shoeNewBalance)




    }


}
