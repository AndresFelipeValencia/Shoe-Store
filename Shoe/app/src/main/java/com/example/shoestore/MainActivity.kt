package com.example.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.shoestore.adapter.ItemAdapter
import com.example.shoestore.adapter.OnItemClickListener
import com.example.shoestore.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val instanceOfStore = Store()

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        instanceOfStore.createShoeList()

        val myDataset = instanceOfStore.getShoes()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(myDataset, object: OnItemClickListener{
            override fun onItemClicked(shoe: Shoe) {
                Toast.makeText(this@MainActivity, "Click a ${shoe.brand}", Toast.LENGTH_SHORT).show()
            }

        })

        recyclerView.setHasFixedSize(true)

    }

}

