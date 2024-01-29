package ru.andreewkov.questions.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import java.lang.IllegalStateException

object ViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return create(modelClass, CreationExtras.Empty)
    }

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return when (modelClass) {
            MainViewModel::class.java -> MainViewModel(extras)
            QuestionListViewModel::class.java -> QuestionListViewModel(extras)
            else -> throw IllegalStateException("$modelClass should be instantiating in ViewModelFactory")
        } as T
    }
}