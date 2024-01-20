package ru.andreewkov.questions

import android.app.Application
import ru.andreewkov.questions.data.di.DaggerDataComponent
import ru.andreewkov.questions.di.ComponentHolder
import ru.andreewkov.questions.di.DaggerApplicationComponent
import ru.andreewkov.questions.presentation.di.DaggerPresentationComponent

class QuestionsApplication : Application() {

    override fun onCreate() {
        initComponentHolder()
        super.onCreate()
    }

    private fun initComponentHolder() {
        val applicationComponent = DaggerApplicationComponent.create()
        val dataComponent = DaggerDataComponent.create()

        val presentationComponent = DaggerPresentationComponent.builder()
            .dataApi(dataComponent)
            .build()

        ComponentHolder.update(
            listOf<ComponentHolder.Component>(
                applicationComponent,
                dataComponent,
                presentationComponent,
            )
        )
    }
}
