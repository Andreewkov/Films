package ru.andreewkov.questions.viewmodel

import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.andreewkov.questions.data.Question
import ru.andreewkov.questions.data.QuestionsListState
import ru.andreewkov.questions.data.QuestionsListState.Initialized
import ru.andreewkov.questions.screen.QuestionsListScreenUiProvider
import ru.andreewkov.questions.screen.QuestionsListScreenUiProviderStub

class QuestionListViewModel : ViewModel(), QuestionsListScreenUiProvider {

    private val mainHandler = Handler(Looper.getMainLooper())

    private val _questionsState = MutableLiveData<QuestionsListState>(Initialized)
    override val questionsListState: LiveData<QuestionsListState>
        get() = _questionsState

    fun loadQuestions() {
        _questionsState.postValue(QuestionsListState.Loading)

        // TODO load questions
        mainHandler.postDelayed(MOCK_QUESTIONS_DELAY) {
            onQuestionsLoaded(QuestionsListScreenUiProviderStub.stubbedQuestions)
        }
    }

    private fun onQuestionsLoaded(questions: List<Question>) {
        _questionsState.postValue(QuestionsListState.Success(questions))
    }

    companion object {
        private const val MOCK_QUESTIONS_DELAY = 1000L
    }
}
