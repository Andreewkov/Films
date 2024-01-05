package ru.andreewkov.questions.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.andreewkov.questions.screen.list.QuestionListScreen

class MainActivity : ComponentActivity() {

    private val viewModel by lazy { MainViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MainUi(viewModel) }

        viewModel.loadQuestions()
    }
}
