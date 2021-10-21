plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(deps.android.build.targetSdkVersion)
    buildToolsVersion(deps.android.build.buildToolVersion)

    defaultConfig {
        applicationId = "com.aayushma.aayushmaag"
        minSdkVersion(deps.android.build.minSdkVersion)
        targetSdkVersion(deps.android.build.targetSdkVersion)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes.getByName("release") {
        isMinifyEnabled = false
        proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {

    implementation(deps.android.kotlin.kotlinStdLib)
    implementation(deps.android.core.ktx)
    implementation(deps.android.core.appCompat)
    implementation(deps.android.ui.material)
    implementation(deps.android.ui.constraintLayout)
    testImplementation(deps.android.testing.junitTest)
    androidTestImplementation(deps.android.testing.junit)
    androidTestImplementation(deps.android.testing.espresso)
    implementation(deps.android.core.coroutines)
    implementation(deps.android.network.retrofit)
    implementation(deps.android.network.gson)
    implementation(deps.android.network.gsonConvertor)
    implementation(deps.android.network.loggingInterceptor)
}