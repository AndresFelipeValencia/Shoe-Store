package com.example.shoestore

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
        shoeNike.image = ""
        shoes.add(shoeNike)

        val shoeAdidas = Shoe()
        shoeAdidas.brand = "adidas"
        shoeAdidas.image = ""
        shoes.add(shoeAdidas)

        val shoeReebok = Shoe()
        shoeReebok.brand = "reebok"
        shoeReebok.image = ""
        shoes.add(shoeReebok)

        val shoePolo = Shoe()
        shoePolo.brand = "polo"
        shoePolo.image = ""
        shoes.add(shoeReebok)

        val shoeJordan = Shoe()
        shoeJordan.brand = "jordan"
        shoeJordan.image = ""
        shoes.add(shoeJordan)

        val shoeNewBalance = Shoe()
        shoeNewBalance.brand = "newbalance"
        shoeNewBalance.image = ""
        shoes.add(shoeNewBalance)

    }


}
