package ru.andreewkov.questions.utils

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import ru.andreewkov.questions.ui.theme.AppTheme

@Composable
fun ThemedFillMaxSizeSurface(modifier: Modifier = Modifier, color: Color, content: @Composable () -> Unit) {
    AppTheme {
        Surface(modifier = modifier.fillMaxSize(), color = color) {
            content()
        }
    }
}
