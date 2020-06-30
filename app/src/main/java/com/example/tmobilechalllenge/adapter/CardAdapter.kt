package com.example.tmobilechalllenge.adapter

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.tmobilechalllenge.R
import com.example.tmobilechalllenge.model.Card
import kotlinx.android.synthetic.main.card_item.view.*

class CardAdapter(private val list: MutableList<Card>) :
    RecyclerView.Adapter<CardAdapter.CustomViewHolder>() {

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        list[position].card.image?.let { cardImage ->
            val layoutParams: ViewGroup.LayoutParams =
                ConstraintLayout.LayoutParams(cardImage.size.width, cardImage.size.height)

            holder.itemView.card_image.layoutParams = layoutParams
            holder.itemView.card_item.layoutParams = layoutParams

            Glide
                .with(holder.itemView)
                .applyDefaultRequestOptions(RequestOptions().centerInside())
                .load(cardImage.url)
                .into(holder.itemView.card_image)
        }


        if (list[position].card.title?.value?.isEmpty() != true){
            holder.itemView.title_value_textview.text = list[position].card.title?.value?: ""
            holder.itemView.title_value_textview.textSize = list[position].card.title?.attributes?.font?.size?.toFloat() ?: 16F
            val newColor = list[position].card.title?.attributes?.textColor ?: "#FFFFFF"
            holder.itemView.title_value_textview.setTextColor(Color.parseColor(newColor))
        }
        if (list[position].card.description?.value?.isEmpty() != true){
            holder.itemView.description_value_textview.text =
                list[position].card.description?.value ?: ""
            holder.itemView.description_value_textview.textSize = list[position].card.description?.attributes?.font?.size?.toFloat() ?: 8F
            val newColor = list[position].card.description?.attributes?.textColor ?: "#FFFFFF"
            holder.itemView.description_value_textview.setTextColor(Color.parseColor(newColor))
        }
        if (list[position].card.title?.value?.isBlank() == null && list[position].card.title?.value == null && (list[position].card.image == null)){
            holder.itemView.title_value_textview.visibility = View.GONE
            holder.itemView.description_value_textview.visibility = View.GONE
        }
//
    }
}