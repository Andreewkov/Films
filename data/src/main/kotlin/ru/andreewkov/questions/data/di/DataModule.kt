package ru.andreewkov.questions.data.di

import dagger.Module
import dagger.Provides
import ru.andreewkov.questions.data.DataClass
import ru.andreewkov.questions.data_api.DataApiInterface

@Module
class DataModule {

    @Provides
    fun provideDataApiInterface(): DataApiInterface {
        return DataClass()
    }
}
