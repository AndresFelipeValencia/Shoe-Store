package com.example.shoestore

import android.widget.Toast

class Store {

    val listShoe: MutableList<Shoe> = mutableListOf()
    val listCar: MutableList<Shoe> = mutableListOf()
//    private val shoes = ArrayList<Shoe>()

    fun createShoeList() {
        val shoeNike = Shoe()
        shoeNike.listBrand = listOf(EnumBrand.NIKE)
        shoeNike.imageId = R.id.id_image_nike
        listShoe.add(shoeNike)

        val shoePolo = Shoe()
        shoePolo.listBrand = listOf(EnumBrand.POLO)
        shoePolo.imageId = R.id.id_image_adidas
        listShoe.add(shoePolo)

        val shoeJordan = Shoe()
        shoeJordan.listBrand = listOf(EnumBrand.JORDAN)
        shoeJordan.imageId = R.id.id_image_new_balance
        listShoe.add(shoeJordan)

        val shoeAdidas = Shoe()
        shoeAdidas.listBrand = listOf(EnumBrand.ADIDAS)
        shoeAdidas.imageId = R.id.id_image_polo
        listShoe.add(shoeAdidas)

        val shoeNewBalance = Shoe()
        shoeNewBalance.listBrand = listOf(EnumBrand.NEWBALANCE)
        shoeNewBalance.imageId = R.id.id_image_reebok
        listShoe.add(shoeNewBalance)

        val shoeReebok = Shoe()
        shoeReebok.listBrand = listOf(EnumBrand.REEBOK)
        shoeReebok.imageId = R.id.id_image_jordan
        listShoe.add(shoeReebok)
    }

    fun addToCart(id: Int) {
        val shoeZero = listShoe[0]
        if (listCar.contains(shoeZero)) {
            listCar.remove(shoeZero)
        } else {
            listCar.add(shoeZero)
        }

        val shoeOne = listShoe[1]
        if (listCar.contains(shoeOne)) {
            listCar.remove(shoeOne)
        } else  {
            listCar.add(shoeOne)
        }

        val shoeTwo = listShoe[2]
        if (listCar.contains(shoeTwo)) {
            listCar.remove(shoeTwo)
        } else {
            listCar.add(shoeTwo)
        }

        val shoeThree = listShoe[3]
        if (listCar.contains(shoeThree)) {
            listCar.remove(shoeThree)
        } else {
            listCar.add(shoeThree)
        }

        val shoeFour = listShoe[4]
        if (listCar.contains(shoeFour)) {
            listCar.remove(shoeFour)
        } else {
            listCar.add(shoeFour)
        }

        val shoeFive = listShoe[5]
        if (listCar.contains(shoeFive)) {
            listCar.remove(shoeFive)
        } else  {
            listCar.add(shoeFive)
        }
    }

    fun buy() {

    }

    fun clean() {
        listCar.clear()
    }




}
