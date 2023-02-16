package ru.kirshov.unitcostcalculator.presentation.models

import java.util.UUID

data class UiItemModel(
    val id:String = UUID.randomUUID().toString(),
    val price:String = "",
    val weight:String = "",
    val weightType: WeightType = WeightType.GRAM
)

enum class WeightType{
    GRAM, LITER
}