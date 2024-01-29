package ru.andreewkov.questions

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import ru.andreewkov.questions.presentation.screen.ui.MainUi
import ru.andreewkov.questions.presentation.viewmodel.MainViewModel
import ru.andreewkov.questions.presentation.viewmodel.QuestionListViewModel
import ru.andreewkov.questions.presentation.viewmodel.ViewModelFactory

class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels { ViewModelFactory }
    private val questionListViewModel: QuestionListViewModel by viewModels { ViewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MainUi() }

        observeViewModel()
        mainViewModel.onCreateActivity(savedInstanceState)
    }

    private fun observeViewModel() {
        lifecycleScope.launch {
            mainViewModel.loadQuestionsRequest.collect { onLoadQuestionRequest(it) }
        }
    }

    private fun onLoadQuestionRequest(request: MainViewModel.LoadQuestionsRequest) {
        questionListViewModel.loadQuestions()
    }
}
