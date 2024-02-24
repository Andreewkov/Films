package ru.andreewkov.questions.presentation.viewmodel

import android.os.Bundle
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.CreationExtras
import kotlinx.coroutines.flow.MutableSharedFlow
import ru.andreewkov.questions.di.ComponentHolder
import ru.andreewkov.questions.presentation.di.PresentationComponent

class MainViewModel(extras: CreationExtras) : ViewModel() {

    private val _loadQuestionsRequest = MutableSharedFlow<LoadQuestionsRequest>()
    val loadQuestionsRequest: SharedFlow<LoadQuestionsRequest>
        get() = _loadQuestionsRequest

    init {
        ComponentHolder.get(PresentationComponent::class.java).inject(this)
    }

    fun onCreateActivity(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            viewModelScope.launch {
                _loadQuestionsRequest.emit(LoadQuestionsRequest())
            }
        }
    }

    class LoadQuestionsRequest
}
