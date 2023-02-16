package ru.kirshov.unitcostcalculator.presentation


import androidx.recyclerview.widget.RecyclerView
import ru.kirshov.unitcostcalculator.databinding.ViewListItemBinding

class ItemListHolder(private val v: ViewListItemBinding) : RecyclerView.ViewHolder(v.root) {
    fun bind(title: String) {
        v.itemTitle.text = title
    }
}