import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    kotlin("multiplatform")
//    kotlin("plugin.serialization") version "2.0.21"
}

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser {
//            webpackTask {
//
//            }
//            testTask {
//                useKarma {
//                    useChrome()
//                }
//            }
        }
        binaries.executable()
    }
    
    sourceSets {
        
        commonMain.dependencies {
        }
        wasmJsMain.dependencies {
            implementation(npm("libsodium-wrappers-sumo", "0.7.13"))
        }
    }
}


