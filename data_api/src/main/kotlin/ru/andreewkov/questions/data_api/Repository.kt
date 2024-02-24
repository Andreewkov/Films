package ru.andreewkov.questions.data_api

interface Repository {

    suspend fun getItems(
        type: String? = null,
        difficulty: String? = null,
        category: String? = null,
    ): List<DataItem>

    suspend fun saveItem(
        item: DataItem,
        answer: String,
    ): SavedDataItem

    suspend fun removeSavedItem(
        id: String,
    )

    suspend fun getSavedItems(): List<SavedDataItem>
}