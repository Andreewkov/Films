package ru.andreewkov.questions.main

import androidx.lifecycle.ViewModel
import ru.andreewkov.questions.screen.QuestionsListScreenUiProvider
import ru.andreewkov.questions.viewmodel.QuestionListViewModel

class MainViewModel : ViewModel(), MainScreenUiProvider {

    private val questionListViewModel by lazy { QuestionListViewModel() }
    override val questionsListScreenUiProvider: QuestionsListScreenUiProvider
        get() = questionListViewModel

    fun loadQuestions() {
        questionListViewModel.loadQuestions()
    }
}