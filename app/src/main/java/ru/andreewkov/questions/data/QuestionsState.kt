package ru.andreewkov.questions.data

sealed class QuestionsListState {

    data object Initialized : QuestionsListState()

    data object Loading : QuestionsListState()

    data class Success(val questions: List<Question>) : QuestionsListState()

}