package ru.andreewkov.questions.presentation.data

data class Item(
    val question: String,
    val correctAnswer: String,
    val incorrectAnswers: List<String>,
    val type: ItemType,
    val difficulty: ItemDifficulty,
    val category: ItemCategory,
)

data class SavedItem(
    val id: Int,
    val item: Item,
)
