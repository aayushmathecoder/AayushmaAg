// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(deps.android.build.classpath.buildTool)
        classpath(deps.android.build.classpath.gradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}
