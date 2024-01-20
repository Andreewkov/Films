package ru.andreewkov.questions.di

import dagger.Component
import ru.andreewkov.questions.MainActivity
import ru.andreewkov.questions.data.di.DataApiProviderModule
import ru.andreewkov.questions.data_api.DataApi
import ru.andreewkov.questions.presentation.di.PresentationApiProviderModule

@Component(
    modules = [
        ApplicationModule::class,
        DataApiProviderModule::class,
        PresentationApiProviderModule::class
    ],
)
interface ApplicationComponent : ComponentHolder.Component {
    fun dataApi(): DataApi

    fun inject(activity: MainActivity)
}
