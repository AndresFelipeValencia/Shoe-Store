package com.example.shoestore.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoestore.EnumBrand
import com.example.shoestore.R
import com.example.shoestore.Shoe
import com.example.shoestore.Store
import com.example.shoestore.model.ShoeTwo

class ItemAdapter(
    private val context: Context,
    private val dataset: List<ShoeTwo>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
//        holder.numberView.text = context.resources.getString(item.stringResourceId)
//        holder.cleanView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size

    inner class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.name_shoe)
        val imageView: ImageView = view.findViewById(R.id.picture_shoe)
//        val numberView: TextView = view.findViewById(R.id.button_buy)
//        val cleanView: TextView = view.findViewById(R.id.button_clean)
    }

}
