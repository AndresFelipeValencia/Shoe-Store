package com.example.shoestore

class Shoe {

    val listShoes: MutableList<EnumShoe> = mutableListOf()

//    var brand = ""
//    var imageId: Int = 0

    fun isNike(): Boolean {
        return if (listShoes.contains(EnumShoe.NIKE)) {
            true
        } else listShoes.contains(EnumShoe.NIKE)
    }

    fun isPolo(): Boolean {
        return if (listShoes.contains(EnumShoe.POLO)) {
            true
        } else listShoes.contains(EnumShoe.POLO)
    }

    fun isAdidas(): Boolean {
        return if (listShoes.contains(EnumShoe.ADIDAS)) {
            true
        } else listShoes.contains(EnumShoe.ADIDAS)
    }

    fun isNewBalance(): Boolean {
        return if (listShoes.contains(EnumShoe.NEWBALANCE)) {
            true
        } else listShoes.contains(EnumShoe.NEWBALANCE)
    }

}