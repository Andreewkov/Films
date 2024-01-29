package ru.andreewkov.questions.presentation.viewmodel

import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import ru.andreewkov.questions.presentation.data.Question
import ru.andreewkov.questions.presentation.data.QuestionsListState
import ru.andreewkov.questions.presentation.data.QuestionsListState.Initialized
import ru.andreewkov.questions.presentation.screen.ui.stubbedQuestions

class QuestionListViewModel(extras: CreationExtras) : ViewModel() {

    private val mainHandler = Handler(Looper.getMainLooper())

    private val _questionsState = MutableStateFlow<QuestionsListState>(Initialized)
    val questionsState: StateFlow<QuestionsListState>
        get() = _questionsState.asStateFlow()

    fun loadQuestions() {
        viewModelScope.launch {
            _questionsState.emit(QuestionsListState.Loading)
        }

        // TODO load questions
        mainHandler.postDelayed(MOCK_QUESTIONS_DELAY) {
            onQuestionsLoaded(stubbedQuestions)
        }
    }

    private fun onQuestionsLoaded(questions: List<Question>) {
        viewModelScope.launch {
            _questionsState.emit(QuestionsListState.Success(questions))
        }
    }

    companion object {
        private const val MOCK_QUESTIONS_DELAY = 5000L
    }
}
