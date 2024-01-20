package ru.andreewkov.questions

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.andreewkov.questions.di.ComponentHolder
import ru.andreewkov.questions.di.ApplicationComponent
import ru.andreewkov.questions.presentation.screen.ui.MainUi
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var a: A

    override fun onCreate(savedInstanceState: Bundle?) {
        ComponentHolder.get(ApplicationComponent::class.java).inject(this)
        super.onCreate(savedInstanceState)
        setContent { MainUi() }
    }

    interface A

    class B : A

}
