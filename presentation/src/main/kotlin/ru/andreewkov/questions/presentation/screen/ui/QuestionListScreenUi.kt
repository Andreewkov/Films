package ru.andreewkov.questions.presentation.screen.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.andreewkov.questions.presentation.data.Item
import ru.andreewkov.questions.presentation.data.QuestionsListState
import ru.andreewkov.questions.presentation.ui.createStubItem
import ru.andreewkov.questions.presentation.utils.AppPreview
import ru.andreewkov.questions.presentation.utils.ThemedAppSurface
import ru.andreewkov.questions.presentation.viewmodel.QuestionListViewModel
import ru.andreewkov.questions.presentation.viewmodel.ViewModelFactory

@AppPreview
@Composable
internal fun QuestionListScreenPreview() {
    ThemedAppSurface {
        QuestionListContent(stubbedItems)
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
        QuestionListContent(items = questionsState.items)
    }
    // TODO add content
}

@Composable
internal fun QuestionListContent(items: List<Item>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(
            horizontal = 16.dp,
            vertical = 12.dp
        )
    ) {
        this.items(
            items = items,
            //key = { it.correctAnswer }
        ) {
            QuestionCard(item = it)
        }
    }
}

val stubbedItems = (0..20).toList().map { createStubItem(it) }
