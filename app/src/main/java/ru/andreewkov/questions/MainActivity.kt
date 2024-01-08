package ru.andreewkov.questions

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.andreewkov.questions.main.MainUi
import ru.andreewkov.questions.main.MainViewModel

class MainActivity : ComponentActivity() {

    private val viewModel by lazy { MainViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MainUi(viewModel) }

        viewModel.loadQuestions()
    }
}
