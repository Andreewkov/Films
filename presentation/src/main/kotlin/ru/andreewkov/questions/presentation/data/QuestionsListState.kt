package ru.andreewkov.questions.presentation.data

sealed class QuestionsListState {

    data object Initialized : QuestionsListState()

    data object Loading : QuestionsListState()

    data class Success(val questions: List<Question>) : QuestionsListState()
}