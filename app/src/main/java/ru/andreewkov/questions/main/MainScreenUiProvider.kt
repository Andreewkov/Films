package ru.andreewkov.questions.main

import ru.andreewkov.questions.screen.QuestionsListScreenUiProvider
import ru.andreewkov.questions.screen.QuestionsListScreenUiProviderStub

interface MainScreenUiProvider {
    val questionsListScreenUiProvider: QuestionsListScreenUiProvider
}

object MainScreenUiProviderStub : MainScreenUiProvider {
    override val questionsListScreenUiProvider: QuestionsListScreenUiProvider
        get() = QuestionsListScreenUiProviderStub

}