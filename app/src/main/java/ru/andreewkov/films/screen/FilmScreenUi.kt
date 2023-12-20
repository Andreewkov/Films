package ru.andreewkov.films.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.andreewkov.films.ui.theme.AppTheme
import ru.andreewkov.films.utils.AppPreview

@AppPreview
@Composable
fun FilmListPreview() = FilmListScreen()

@Composable
fun FilmListScreen() {
    AppTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            FilmListScreenContent()
        }
    }
}

@Composable
fun FilmListScreenContent() {
    // TODO add content
}
