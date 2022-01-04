package com.example.shoestore.data

import com.example.shoestore.R
import com.example.shoestore.model.ShoeTwo

class Datasource {

    fun loadShoes(): List<ShoeTwo> {
        return listOf(
            ShoeTwo(R.string.shoe_nike, R.drawable.image_nike),
            ShoeTwo(R.string.shoe_polo, R.drawable.image_polo),
            ShoeTwo(R.string.shoe_jordan, R.drawable.image_jordan),
            ShoeTwo(R.string.shoe_adidas, R.drawable.image_adidas),
            ShoeTwo(R.string.shoe_new_balance, R.drawable.new_balance),
            ShoeTwo(R.string.shoe_reebok, R.drawable.image_reebok)
        )
    }
}