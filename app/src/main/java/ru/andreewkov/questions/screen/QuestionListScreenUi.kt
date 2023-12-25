package ru.andreewkov.questions.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.andreewkov.questions.ui.theme.AppTheme
import ru.andreewkov.questions.utils.AppPreview
import ru.andreewkov.questions.utils.ThemedFillMaxSizeSurface

@AppPreview
@Composable
fun QuestionListPreview() = QuestionListScreen()

@Composable
fun QuestionListScreen() {
    ThemedFillMaxSizeSurface(color = MaterialTheme.colorScheme.background) {
        QuestionListScreenContent()
    }
}

@Composable
fun QuestionListScreenContent() {
    // TODO add content
}
