package ru.andreewkov.questions.presentation.ui

import ru.andreewkov.questions.presentation.data.Item
import ru.andreewkov.questions.presentation.data.ItemCategory
import ru.andreewkov.questions.presentation.data.ItemDifficulty
import ru.andreewkov.questions.presentation.data.ItemType

private const val CORRECT = "Correct"
private const val INCORRECT = "Correct"

fun createStubItem(index: Int): Item {
    return Item(
        question = index.toString(),
        correctAnswer = CORRECT,
        incorrectAnswers = listOf(INCORRECT, INCORRECT, INCORRECT),
        type = getItemType(index),
        difficulty = getItemDifficulty(index),
        category = getItemCategory(index)
    )
}

private fun getItemType(index: Int): ItemType {
    val i = index.mod(3) - 1
    return when (i) {
        0 -> ItemType.Single
        1 -> ItemType.Multiple
        else -> ItemType.Undefined(index.toString())
    }
}

private fun getItemDifficulty(index: Int): ItemDifficulty {
    val i = index.mod(4) - 1
    return when (i) {
        0 -> ItemDifficulty.Easy
        1 -> ItemDifficulty.Medium
        2 -> ItemDifficulty.Hard
        else -> ItemDifficulty.Undefined(index.toString())
    }
}

private fun getItemCategory(index: Int): ItemCategory {
    return ItemCategory.Undefined(index.toString())
}