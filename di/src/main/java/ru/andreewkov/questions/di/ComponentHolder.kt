package ru.andreewkov.questions.di

import java.lang.IllegalStateException

object ComponentHolder {

    private var components = listOf<Component>()

    @Suppress("UNCHECKED_CAST")
    fun <T> get(componentClass: Class<T>): T {
        return components.find { it.isComponentMatched(componentClass) } as T
            ?: componentNotFound(componentClass)
    }

    private fun <T : Component> T.isComponentMatched(componentClass: Class<*>): Boolean {
        return javaClass.interfaces.find { it == componentClass} != null
    }

    fun update(components: List<Component>) {
        this.components = components
    }

    private fun <T> componentNotFound(componentClass: Class<out T>): Nothing {
        throw IllegalStateException("Component $componentClass not found in ComponentHolder")
    }

    interface Component
}
