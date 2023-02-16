package ru.kirshov.unitcostcalculator.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.kirshov.unitcostcalculator.R
import ru.kirshov.unitcostcalculator.data.ItemModel
import ru.kirshov.unitcostcalculator.databinding.ViewListItemBinding

class ItemListAdapter: ListAdapter<ItemModel, ItemListHolder>(ItemDiff()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemListHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_list_item, parent, false)
        return ItemListHolder(v = ViewListItemBinding.bind(view))
    }

    override fun onBindViewHolder(holder: ItemListHolder, position: Int) {
        val model = getItem(position)
        holder.bind(title = model.id)
    }
}