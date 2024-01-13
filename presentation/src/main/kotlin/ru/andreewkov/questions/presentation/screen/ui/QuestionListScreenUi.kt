package ru.andreewkov.questions.presentation.screen.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.unit.dp
import ru.andreewkov.questions.presentation.data.Question
import ru.andreewkov.questions.presentation.data.QuestionsListState
import ru.andreewkov.questions.presentation.screen.model.QuestionsListUiModel
import ru.andreewkov.questions.presentation.screen.model.QuestionsListUiModelStub
import ru.andreewkov.questions.presentation.utils.AppPreview
import ru.andreewkov.questions.presentation.utils.ThemedAppSurface

@AppPreview
@Composable
internal fun QuestionListScreenPreview() {
    ThemedAppSurface {
        QuestionListScreen(QuestionsListUiModelStub)
    }
}

@Composable
internal fun QuestionListScreen(provider: QuestionsListUiModel) {
    val questionsState = provider.questionsListState.observeAsState()
    val state = questionsState.value
    if (state is QuestionsListState.Success) {
        QuestionList(questions = state.questions)
    }
    // TODO add content
}

@Composable
internal fun QuestionList(questions: List<Question>) {
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
