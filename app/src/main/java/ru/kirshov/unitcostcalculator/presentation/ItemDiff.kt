package ru.kirshov.unitcostcalculator.presentation

import androidx.recyclerview.widget.DiffUtil
import ru.kirshov.unitcostcalculator.data.ItemModel

class ItemDiff:DiffUtil.ItemCallback<ItemModel>() {
    override fun areItemsTheSame(oldItem: ItemModel, newItem: ItemModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ItemModel, newItem: ItemModel): Boolean {
       return oldItem.id == newItem.id
    }
}