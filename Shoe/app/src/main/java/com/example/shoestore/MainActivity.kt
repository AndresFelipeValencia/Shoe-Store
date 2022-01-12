package com.example.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.shoestore.adapter.ItemAdapter
import com.example.shoestore.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val instanceOfStore = Store()

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val myDataset = instanceOfStore.getShoes()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(myDataset)

        recyclerView.setHasFixedSize(true)

        instanceOfStore.createShoeList()

    }

}

