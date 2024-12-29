rootProject.name = "LibsodiumWasmTest"

pluginManagement {
    repositories {
//        mavenCentral()
//        gradlePluginPortal()
    }
    plugins {
        kotlin("multiplatform") version "2.0.21"
    }
}

include(":composeApp")
