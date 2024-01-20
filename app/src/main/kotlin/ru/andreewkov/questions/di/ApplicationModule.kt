package ru.andreewkov.questions.di

import dagger.Module
import dagger.Provides
import ru.andreewkov.questions.MainActivity

@Module
class ApplicationModule {

    @Provides
    fun provideA(): MainActivity.A {
        return MainActivity.B()
    }
}