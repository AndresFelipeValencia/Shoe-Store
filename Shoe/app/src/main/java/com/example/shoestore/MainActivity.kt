package com.example.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.ImageView
import com.example.shoestore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val instanceOfStore = Store()

    val listShoeSelected: MutableList<EnumShoe> = mutableListOf()

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.imageNike.setOnClickListener {
           if (listShoeSelected.contains(EnumShoe.NIKE)){
               listShoeSelected.add(EnumShoe.NIKE)
           }
        }

        binding.imagePolo.setOnClickListener {
           if (listShoeSelected.contains(EnumShoe.POLO)){
               listShoeSelected.add(EnumShoe.POLO)
           }
        }

        binding.imageAdidas.setOnClickListener {
            if (listShoeSelected.contains(EnumShoe.ADIDAS)){
                listShoeSelected.add(EnumShoe.ADIDAS)
            }
        }

        binding.imageNewBalance.setOnClickListener {
            if (listShoeSelected.contains(EnumShoe.NEWBALANCE)){
                listShoeSelected.add(EnumShoe.NEWBALANCE)
            }
        }

        binding.sumaNumberShoe.setText(0)

        binding.idButtonBuy.setOnClickListener {
            buy()
        }

        binding.idButtonClean.setOnClickListener {
            clean()
        }
    }

    fun addToCar() {

    }

    fun buy() {

    }

    fun clean() {
        listShoeSelected.clear()
    }


}