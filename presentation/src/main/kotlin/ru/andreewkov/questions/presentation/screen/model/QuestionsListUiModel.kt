package ru.andreewkov.questions.presentation.screen.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.andreewkov.questions.presentation.data.Question
import ru.andreewkov.questions.presentation.data.QuestionsListState

interface QuestionsListUiModel {
    val questionsListState: LiveData<QuestionsListState>
}

internal object QuestionsListUiModelStub : QuestionsListUiModel {

    val stubbedQuestions = listOf(
        Question(id = 0, title = "A? FSJKFSB SAF JDASKLF NSDLFKN SFADLKNNA DSFLKN ", answer = "A"),
        Question(id = 1, title = "B?", answer = "B"),
        Question(id = 2, title = "C?", answer = "C"),
        Question(id = 3, title = "D?", answer = "D"),
        Question(id = 4, title = "E?", answer = "E"),
        Question(id = 5, title = "F?", answer = "F"),
        Question(id = 6, title = "H?", answer = "H"),
        Question(id = 7, title = "I?", answer = "I"),
        Question(id = 8, title = "J?", answer = "J"),
        Question(id = 9, title = "I?", answer = "I"),
        Question(id = 10, title = "K?", answer = "K"),
        Question(id = 11, title = "L?", answer = "L"),
        Question(id = 12, title = "M?", answer = "M"),
        Question(id = 13, title = "N?", answer = "N"),
        Question(id = 14, title = "O?", answer = "O"),
        Question(id = 15, title = "P?", answer = "P"),
        Question(id = 16, title = "Q?", answer = "Q"),
    )
    override val questionsListState: LiveData<QuestionsListState> = MutableLiveData(
        QuestionsListState.Success(stubbedQuestions)
    )
}