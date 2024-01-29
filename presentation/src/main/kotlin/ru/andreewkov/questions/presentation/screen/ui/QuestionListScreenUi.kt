package ru.andreewkov.questions.presentation.screen.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.andreewkov.questions.presentation.data.Question
import ru.andreewkov.questions.presentation.data.QuestionsListState
import ru.andreewkov.questions.presentation.utils.AppPreview
import ru.andreewkov.questions.presentation.utils.ThemedAppSurface
import ru.andreewkov.questions.presentation.viewmodel.QuestionListViewModel
import ru.andreewkov.questions.presentation.viewmodel.ViewModelFactory

@AppPreview
@Composable
internal fun QuestionListScreenPreview() {
    ThemedAppSurface {
        QuestionListContent(stubbedQuestions)
    }
}

@Composable
internal fun QuestionListScreen() {
    val questionListViewModel: QuestionListViewModel = viewModel(
        factory = ViewModelFactory,
    )
    val questionsStateFlow = questionListViewModel.questionsState.collectAsState()
    val questionsState = questionsStateFlow.value

    if (questionsState is QuestionsListState.Success) {
        QuestionListContent(questions = questionsState.questions)
    }
    // TODO add content
}

@Composable
internal fun QuestionListContent(questions: List<Question>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(
            horizontal = 16.dp,
            vertical = 12.dp
        )
    ) {
        items(
            items = questions,
            key = { it.id }
        ) {
            QuestionCard(question = it)
        }
    }
}


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
