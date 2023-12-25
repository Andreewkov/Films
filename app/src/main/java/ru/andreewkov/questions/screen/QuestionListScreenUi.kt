package ru.andreewkov.questions.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.andreewkov.questions.ui.theme.AppTheme
import ru.andreewkov.questions.utils.AppPreview

@AppPreview
@Composable
fun QuestionListPreview() = QuestionListScreen()

@Composable
fun QuestionListScreen() {
    AppTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            QuestionListScreenContent()
        }
    }
}

@Composable
fun QuestionListScreenContent() {
    // TODO add content
}
