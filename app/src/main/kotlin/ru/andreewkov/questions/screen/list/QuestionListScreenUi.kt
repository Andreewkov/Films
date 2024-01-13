package ru.andreewkov.questions.screen.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.andreewkov.questions.data.Question
import ru.andreewkov.questions.data.QuestionsListState
import ru.andreewkov.questions.screen.QuestionsListScreenUiProvider
import ru.andreewkov.questions.screen.QuestionsListScreenUiProviderStub
import ru.andreewkov.questions.utils.AppPreview
import ru.andreewkov.questions.utils.ThemedAppSurface

@AppPreview
@Composable
fun QuestionListScreenPreview() {
    ThemedAppSurface {
        QuestionListScreen(QuestionsListScreenUiProviderStub)
    }
}

@Composable
fun QuestionListScreen(provider: QuestionsListScreenUiProvider) {
    val questionsState = provider.questionsListState.observeAsState()
    val state = questionsState.value
    if (state is QuestionsListState.Success) {
        QuestionList(questions = state.questions)
    }
    // TODO add content
}

@Composable
fun QuestionList(questions: List<Question>) {
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
