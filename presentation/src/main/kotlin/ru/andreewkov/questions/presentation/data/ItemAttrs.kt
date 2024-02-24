package ru.andreewkov.questions.presentation.data

sealed class ItemType {

    data object Single : ItemType()

    data object Multiple : ItemType()

    data class Undefined(val type: String) : ItemType()
}

sealed class ItemDifficulty {

    data object Easy : ItemDifficulty()

    data object Medium : ItemDifficulty()

    data object Hard : ItemDifficulty()

    data class Undefined(val difficulty: String) : ItemDifficulty()
}

sealed class ItemCategory {

    data class Undefined(val category: String) : ItemCategory()
}


