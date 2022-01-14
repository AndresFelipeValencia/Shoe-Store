package com.example.shoestore.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoestore.R
import com.example.shoestore.Shoe

class ItemAdapter(
    private val dataset: List<Shoe>, val itemClickListener: OnItemClickListener
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item,itemClickListener)
    }


    override fun getItemCount() = dataset.size

    inner class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val textView: TextView = view.findViewById(R.id.name_shoe)
        private val imageView: ImageView = view.findViewById(R.id.picture_shoe)

        fun bind(shoe: Shoe, clickListener: OnItemClickListener) {
            textView.text = shoe.nameShoe
            imageView.setImageResource(shoe.imageId)

            itemView.setOnClickListener {
                clickListener.onItemClicked(shoe)
            }
        }
    }

}

interface OnItemClickListener{
    fun onItemClicked(shoe: Shoe)
}

