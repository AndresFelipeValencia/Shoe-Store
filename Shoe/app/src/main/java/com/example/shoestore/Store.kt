package com.example.shoestore

import android.content.Context
import android.widget.Toast
import java.text.FieldPosition

class Store {

    private val listShoe: MutableList<Shoe> = mutableListOf()
    private val listCar: MutableList<Shoe> = mutableListOf()

    fun createShoeList() {
        val shoeNike = Shoe()
        shoeNike.brand = (EnumBrand.NIKE)
        shoeNike.imageId = R.id.id_image_nike
        shoeNike.nameShoe = "Nike Air Force 1"
        shoeNike.colorShoe = "White"
        shoeNike.sizeShoe = 40
        listShoe.add(shoeNike)

        val shoePolo = Shoe()
        shoePolo.brand = (EnumBrand.POLO)
        shoePolo.imageId = R.id.id_image_polo
        shoePolo.nameShoe = "Polo Fashion"
        shoePolo.colorShoe = "Black Red"
        shoePolo.sizeShoe = 41
        listShoe.add(shoePolo)

        val shoeJordan = Shoe()
        shoeJordan.brand = (EnumBrand.JORDAN)
        shoeJordan.imageId = R.id.id_image_jordan
        shoeJordan.nameShoe = "Nike Jordan"
        shoeJordan.colorShoe = "Black Red"
        shoeJordan.sizeShoe = 39
        listShoe.add(shoeJordan)

        val shoeAdidas = Shoe()
        shoeAdidas.brand = (EnumBrand.ADIDAS)
        shoeAdidas.imageId = R.id.id_image_adidas
        shoeAdidas.nameShoe = "Adidas Trainer"
        shoeAdidas.colorShoe = "Black"
        shoeAdidas.sizeShoe = 41
        listShoe.add(shoeAdidas)

        val shoeNewBalance = Shoe()
        shoeNewBalance.brand = (EnumBrand.NEWBALANCE)
        shoeNewBalance.imageId = R.id.id_image_new_balance
        shoeNewBalance.nameShoe = "Balance Coffee"
        shoeNewBalance.colorShoe = "Light grey"
        shoeNewBalance.sizeShoe = 42
        listShoe.add(shoeNewBalance)

        val shoeReebok = Shoe()
        shoeReebok.brand = (EnumBrand.REEBOK)
        shoeReebok.imageId = R.id.id_image_reebok
        shoeReebok.nameShoe = "Reebok Gold"
        shoeReebok.colorShoe = "Black Gold"
        shoeReebok.sizeShoe = 38
        listShoe.add(shoeReebok)
    }

    fun addToCart(shoePosition: Int, requireContext: Context) {
        val shoe = listShoe[shoePosition]
        when {
            shoe.isSold -> {
                Toast.makeText(
                    requireContext, "The shoe is not available.",
                    Toast.LENGTH_SHORT
                ).show()
            }
            listCar.contains(shoe) -> {
                listCar.remove(shoe)
            }
            else -> {
                listCar.add(shoe)
            }
        }
    }

    fun quantityShoe(): Int {
        return listCar.size
    }

    fun buy(requireContext: Context) {
        if (listCar.isEmpty()) {
            Toast.makeText(
                requireContext,
                "It is not possible to make the purchase, empty basket.",
                Toast.LENGTH_SHORT
            ).show()
        } else if (listCar.isNotEmpty()) {
            listCar.forEach { shoe ->
                shoe.isSold = true
            }
            listCar.clear()
            Toast.makeText(
                requireContext, "Thanks for your purchase.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    fun clean(requireContext: Context) {
        listCar.clear()
        Toast.makeText(requireContext, "Cart is empty!.", Toast.LENGTH_SHORT).show()
    }

}
