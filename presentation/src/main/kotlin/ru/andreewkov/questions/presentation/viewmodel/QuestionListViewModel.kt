package ru.andreewkov.questions.presentation.viewmodel

import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.andreewkov.questions.presentation.data.Question
import ru.andreewkov.questions.presentation.data.QuestionsListState
import ru.andreewkov.questions.presentation.data.QuestionsListState.Initialized
import ru.andreewkov.questions.presentation.screen.model.QuestionsListUiModel
import ru.andreewkov.questions.presentation.screen.model.QuestionsListUiModelStub

internal class QuestionListViewModel : ViewModel(), QuestionsListUiModel {

    private val mainHandler = Handler(Looper.getMainLooper())

    private val _questionsState = MutableLiveData<QuestionsListState>(Initialized)
    override val questionsListState: LiveData<QuestionsListState>
        get() = _questionsState

    fun loadQuestions() {
        _questionsState.postValue(QuestionsListState.Loading)

        // TODO load questions
        mainHandler.postDelayed(MOCK_QUESTIONS_DELAY) {
            onQuestionsLoaded(QuestionsListUiModelStub.stubbedQuestions)
        }
    }

    private fun onQuestionsLoaded(questions: List<Question>) {
        _questionsState.postValue(QuestionsListState.Success(questions))
    }

    companion object {
        private const val MOCK_QUESTIONS_DELAY = 1000L
    }
}
