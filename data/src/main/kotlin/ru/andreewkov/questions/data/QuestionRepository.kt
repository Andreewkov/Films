package ru.andreewkov.questions.data

import ru.andreewkov.questions.data_api.DataItem
import ru.andreewkov.questions.data_api.Repository
import ru.andreewkov.questions.data_api.SavedDataItem

class QuestionRepository : Repository {
    override suspend fun getItems(
        type: String?,
        difficulty: String?,
        category: String?
    ): List<DataItem> {
        TODO("Not yet implemented")
    }

    override suspend fun saveItem(item: DataItem, answer: String): SavedDataItem {
        TODO("Not yet implemented")
    }

    override suspend fun removeSavedItem(id: String) {
        TODO("Not yet implemented")
    }

    override suspend fun getSavedItems(): List<SavedDataItem> {
        TODO("Not yet implemented")
    }
}