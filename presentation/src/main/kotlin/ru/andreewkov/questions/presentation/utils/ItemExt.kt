package ru.andreewkov.questions.presentation.utils

import ru.andreewkov.questions.data_api.DataItem
import ru.andreewkov.questions.data_api.SavedDataItem
import ru.andreewkov.questions.presentation.data.Item
import ru.andreewkov.questions.presentation.data.ItemCategory
import ru.andreewkov.questions.presentation.data.ItemDifficulty
import ru.andreewkov.questions.presentation.data.ItemType
import ru.andreewkov.questions.presentation.data.SavedItem

private fun String.parseItemType(): ItemType {
    return when (this) {
        "boolean" -> ItemType.Single
        "multiple" -> ItemType.Multiple
        else -> ItemType.Undefined(type = this)
    }
}

private fun String.parseItemDifficulty(): ItemDifficulty {
    return when (this) {
        "easy" -> ItemDifficulty.Easy
        "medium" -> ItemDifficulty.Medium
        "hard" -> ItemDifficulty.Hard
        else -> ItemDifficulty.Undefined(difficulty = this)
    }
}

private fun String.parseItemCategory(): ItemCategory {
    return when (this) {

        else -> ItemCategory.Undefined(category = this)
    }
}

fun DataItem.toItem(): Item {
    return Item(
        question = question,
        correctAnswer = correctAnswer,
        incorrectAnswers = incorrectAnswers,
        type = type.parseItemType(),
        difficulty = difficulty.parseItemDifficulty(),
        category = category.parseItemCategory(),
    )
}

fun SavedDataItem.toSavedItem(): SavedItem {
    return SavedItem(
        id = id,
        item = dataItem.toItem(),
    )
}
