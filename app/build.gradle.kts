plugins {
    id("com.android.application")
}

android {
    namespace = "ru.pulsedialer.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "ru.pulsedialer.app"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
