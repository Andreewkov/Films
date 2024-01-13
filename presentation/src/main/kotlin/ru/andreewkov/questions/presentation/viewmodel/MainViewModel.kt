package ru.andreewkov.questions.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import ru.andreewkov.questions.presentation.screen.model.MainUiModel
import ru.andreewkov.questions.presentation.screen.model.QuestionsListUiModel

internal class MainViewModel : ViewModel(), MainUiModel {

    private val questionListViewModel by lazy { QuestionListViewModel() }
    override val questionsListUiModel: QuestionsListUiModel
        get() = questionListViewModel

    init {
        loadQuestions()
    }

    private fun loadQuestions() {
        questionListViewModel.loadQuestions()
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                MainViewModel()
            }
        }
    }
}