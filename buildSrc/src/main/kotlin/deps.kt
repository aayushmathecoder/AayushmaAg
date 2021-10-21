object Versions {
    const val agp = "4.2.1"

    const val kotlin = "1.5.0"
    const val appCompat = "1.3.0"
    const val material = "1.3.0"
    const val ktx = "1.5.0"
    const val constraintLayout = "2.0.4"
    const val junit = "1.1.2"
    const val junitTest = "4.+"
    const val espresso = "3.3.0"
    const val coroutines = "1.3.9"
}

object deps {
    object android {
        object build {
            const val minSdkVersion = 19
            const val targetSdkVersion = 30
            const val buildToolVersion = "30.0.3"

            object classpath {
                const val buildTool = "com.android.tools.build:gradle:${Versions.agp}"
                const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
            }
        }
        object core {
            const val ktx = "androidx.core:core-ktx:${Versions.ktx}"
            const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
            const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        }
        object ui {
            const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
            const val material = "com.google.android.material:material:${Versions.material}"
        }
        object testing {
            const val junit = "androidx.test.ext:junit:${Versions.junit}"
            const val junitTest = "junit:junit:${Versions.junitTest}"
            const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
        }
        object kotlin {
            const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
        }
    }
}