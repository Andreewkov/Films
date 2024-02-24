package ru.andreewkov.questions.data.di

import dagger.Component
import ru.andreewkov.questions.data_api.DataApi
import ru.andreewkov.questions.di.ComponentHolder
import javax.inject.Singleton

@Singleton
@Component(
    modules = [DataModule::class]
)
interface DataComponent : DataApi, ComponentHolder.Component {

    companion object {
        fun create(): DataApi {
            return DaggerDataComponent.create()
        }
    }
}