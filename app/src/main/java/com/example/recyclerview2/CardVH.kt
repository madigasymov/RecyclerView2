package com.example.recyclerview2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.vh_cards.view.*

class CardVH(
    parent: ViewGroup,
    private val cardClicked: (Int) -> Unit
): RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.vh_cards, parent, false)) {

    fun bind(model: CardModel) {

        itemView.setOnClickListener { cardClicked(adapterPosition) }
        itemView.apply {
            Glide.with(this).load(model.image).placeholder(R.drawable.sunrise).into(ivImage)
            if (model.like)
                ivLike.setImageResource(R.drawable.ic_heart_filled)
            else
                ivLike.setImageResource(R.drawable.ic_heart_empty)
            tvTitle.text = model.title
            tvText.text = model.text
            tvPrice.text = String.format("$%d/ за ночь", model.price)
            tvRating.text = model.rate.toString()
            tvReview.text = String.format("(%d)", model.review)
        }
    }
}