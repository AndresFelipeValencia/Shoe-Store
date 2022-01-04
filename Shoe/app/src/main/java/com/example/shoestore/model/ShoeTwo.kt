package com.example.shoestore.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ShoeTwo (
        @StringRes val stringResourceId: Int,
        @DrawableRes val imageResourceId: Int
    )
