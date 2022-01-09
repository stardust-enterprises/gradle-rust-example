pluginManagement.repositories {
    mavenLocal()
    gradlePluginPortal()
}

rootProject.name = "gradle-rust-example"
include("rust-library")
include("application")
