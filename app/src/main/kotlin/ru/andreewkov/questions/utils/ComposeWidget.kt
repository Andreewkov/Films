package ru.andreewkov.questions.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import ru.andreewkov.questions.ui.theme.AppTheme
import ru.andreewkov.questions.R

@Composable
fun ThemedAppSurface(content: @Composable () -> Unit) {
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
fun Heart(size: Dp, color: Color, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.ic_heart),
        contentDescription = "Like",
        colorFilter = ColorFilter.tint(color),
        modifier = modifier
            .width(size)
    )
}
