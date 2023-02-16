package ru.kirshov.unitcostcalculator.data

import ru.kirshov.unitcostcalculator.presentation.models.UiItemModel
import ru.kirshov.unitcostcalculator.presentation.models.WeightType

data class ItemModel(
    val price:Double,
    val weight:Double,
    val weightType: WeightType = WeightType.GRAM
)

fun UiItemModel.toModel():ItemModel{
    return ItemModel(
        price = this.price.toDouble(),
        weight = this.weight.toDouble(),
        weightType = this.weightType
    )
}
