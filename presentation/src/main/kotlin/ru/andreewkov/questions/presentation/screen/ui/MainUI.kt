package ru.andreewkov.questions.presentation.screen.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.andreewkov.questions.presentation.utils.AppPreview
import ru.andreewkov.questions.presentation.utils.ThemedAppSurface
import ru.andreewkov.questions.presentation.R
import ru.andreewkov.questions.presentation.viewmodel.MainViewModel
import ru.andreewkov.questions.presentation.viewmodel.ViewModelFactory

@AppPreview
@Composable
private fun MainUiPreview() {
    ThemedAppSurface {
        Column {
            MainTopAppBar()
            QuestionListScreenPreview()
        }
    }
}

@Composable
fun MainUi() {
    val mainViewModel: MainViewModel = viewModel(
        factory = ViewModelFactory,
    )

    ThemedAppSurface {
        Column {
            MainTopAppBar()
            QuestionListScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MainTopAppBar() {
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
