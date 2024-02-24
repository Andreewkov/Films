package ru.andreewkov.questions.data_api

data class DataItem(
    val question: String,
    val correctAnswer: String,
    val incorrectAnswers: List<String>,
    val type: String,
    val difficulty: String,
    val category: String,
)

data class SavedDataItem(
    val id: Int,
    val dataItem: DataItem,
)
