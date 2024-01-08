pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Questions"
include(":app")
include(":presentation")
include(":database")
include(":database_api")
include(":cloud")
include(":cloud_api")
include(":data")
include(":data_api")
