package com.example.recyclerview2

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(
    private val cardClicked: (Int) -> Unit
): RecyclerView.Adapter<CardVH>() {

    private val models: MutableList<CardModel> = arrayListOf()

    fun addData(newModels: List<CardModel>) {
        models.addAll(newModels)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardVH {
        return CardVH(parent, cardClicked)
    }

    override fun getItemCount() = models.size

    override fun onBindViewHolder(holder: CardVH, position: Int) {
        holder.bind(models[position])
    }
}