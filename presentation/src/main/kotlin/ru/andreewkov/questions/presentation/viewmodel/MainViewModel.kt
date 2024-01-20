package ru.andreewkov.questions.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import ru.andreewkov.questions.data_api.DataApiInterface
import ru.andreewkov.questions.di.ComponentHolder
import ru.andreewkov.questions.presentation.di.PresentationComponent
import ru.andreewkov.questions.presentation.screen.model.MainUiModel
import ru.andreewkov.questions.presentation.screen.model.QuestionsListUiModel
import javax.inject.Inject

class MainViewModel : ViewModel(), MainUiModel {

    private val questionListViewModel by lazy { QuestionListViewModel() }
    override val questionsListUiModel: QuestionsListUiModel
        get() = questionListViewModel

    @Inject
    lateinit var data: DataApiInterface

    init {
        ComponentHolder.get(PresentationComponent::class.java).inject(this)
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