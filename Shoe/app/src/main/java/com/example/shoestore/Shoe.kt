package com.example.shoestore

import androidx.annotation.StringRes

class Shoe {
    var isCar: Boolean = false
    var isSold: Boolean = false
    var nameShoe: String = ""
    lateinit var brand: EnumBrand
    var colorShoe: String = ""
    var sizeShoe: Int = 0
    var imageId: Int = 0

}