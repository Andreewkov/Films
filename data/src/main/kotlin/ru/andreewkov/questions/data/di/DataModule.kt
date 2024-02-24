package ru.andreewkov.questions.data.di

import dagger.Module
import dagger.Provides
import ru.andreewkov.questions.data.QuestionRepository
import ru.andreewkov.questions.data_api.Repository

@Module
class DataModule {

    @Provides
    fun provideRepository(): Repository {
        return QuestionRepository()
    }
}
