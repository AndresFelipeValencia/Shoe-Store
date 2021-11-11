package com.example.shoestore

import java.util.ArrayList

class Store {

    private val shoes = ArrayList<Shoe>()

    fun addToCart() {

    }

    fun buy() {
    }

    fun clean() {
    }

    fun createShoeList() {
        val shoeNike = Shoe()
        shoeNike.brand = "nike"
        shoeNike.imageId = R.id.id_image_nike
        shoes.add(shoeNike)

        val shoeAdidas = Shoe()
        shoeAdidas.brand = "adidas"
        shoeAdidas.imageId = R.id.id_image_polo
        shoes.add(shoeAdidas)

        val shoeReebok = Shoe()
        shoeReebok.brand = "reebok"
        shoeReebok.imageId = R.id.id_image_jordan
        shoes.add(shoeReebok)

        val shoePolo = Shoe()
        shoePolo.brand = "polo"
        shoePolo.imageId = R.id.id_image_adidas
        shoes.add(shoeReebok)

        val shoeJordan = Shoe()
        shoeJordan.brand = "jordan"
        shoeJordan.imageId = R.id.id_image_new_balance
        shoes.add(shoeJordan)

        val shoeNewBalance = Shoe()
        shoeNewBalance.brand = "newbalance"
        shoeNewBalance.imageId = R.id.id_image_reebok
        shoes.add(shoeNewBalance)




    }


}
