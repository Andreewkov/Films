package ru.andreewkov.questions.presentation.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import ru.andreewkov.questions.presentation.R
import ru.andreewkov.questions.presentation.ui.theme.AppTheme

@Composable
internal fun ThemedAppSurface(content: @Composable () -> Unit) {
    AppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            content()
        }
    }
}

@Composable
internal fun Heart(size: Dp, color: Color, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.ic_heart),
        contentDescription = "Like",
        colorFilter = ColorFilter.tint(color),
        modifier = modifier
            .width(size)
    )
}
