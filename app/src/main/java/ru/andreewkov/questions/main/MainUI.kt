package ru.andreewkov.questions.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ru.andreewkov.questions.screen.list.QuestionListScreen
import ru.andreewkov.questions.utils.AppPreview
import ru.andreewkov.questions.utils.ThemedAppSurface
import ru.andreewkov.questios.R

@AppPreview
@Composable
fun MainUiPreview() {
    MainUi(mainScreenUiProvider = MainScreenUiProviderStub)
}

@Composable
fun MainUi(mainScreenUiProvider: MainScreenUiProvider) {
    ThemedAppSurface {
        Column {
            MainTopAppBar()
            QuestionListScreen(provider = mainScreenUiProvider.questionsListScreenUiProvider)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopAppBar() {
    Surface(shadowElevation = 8.dp) {
        CenterAlignedTopAppBar(
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.primary,
            ),
            title = {
                Text(text = "Questions", color = MaterialTheme.colorScheme.onPrimary)
            },
            modifier = Modifier
        )
    }
}

@Composable
private fun MainTopBackIcon() {
    Image(
        painter = painterResource(id = R.drawable.ic_back),
        contentDescription = "Back",
    )
}
