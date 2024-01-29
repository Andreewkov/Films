package ru.andreewkov.questions.presentation.di

import dagger.Module
import dagger.Provides
import ru.andreewkov.questions.data_api.DataApi

@Module
class PresentationComponentProviderModule {

    @Provides
    fun providePresentationComponent(
        dataApi: DataApi,
    ): PresentationComponent {
        return DaggerPresentationComponent.builder()
            .dataApi(dataApi)
            .build()
    }
}