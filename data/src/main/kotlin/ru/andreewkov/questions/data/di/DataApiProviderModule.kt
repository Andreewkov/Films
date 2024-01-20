package ru.andreewkov.questions.data.di

import dagger.Module
import dagger.Provides
import ru.andreewkov.questions.data_api.DataApi

@Module
object DataApiProviderModule {

    @Provides
    fun provideDataApi(): DataApi {
        return DataComponent.create()
    }
}