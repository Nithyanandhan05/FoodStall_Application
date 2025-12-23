plugins {
    alias(libs.plugins.android.application)
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.simats.foodstall"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.simats.foodstall"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    // Core AndroidX libraries (Updated activity library)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation("androidx.activity:activity:1.10.0") // Updated version
    implementation(libs.constraintlayout)
    implementation(libs.circleimageview)

    // OpenStreetMap (Updated to latest version)
    implementation("org.osmdroid:osmdroid-android:6.1.18")
    implementation("com.github.MKergall:osmbonuspack:6.9.0")

    // Chart Library
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")

    // Firebase & Google Sign-In (Using BoM for version management)
    // Updated BoM version to 34.7.0 as per the image instruction
    implementation(platform("com.google.firebase:firebase-bom:34.7.0"))

    // Add the dependency for the Firebase SDK for Google Analytics (Added as per instruction)
    implementation("com.google.firebase:firebase-analytics")

    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.android.gms:play-services-auth:21.2.0")
    implementation("com.google.android.gms:play-services-location:21.3.0") // Single, updated version

    // Retrofit for networking
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Razorpay for payments
    implementation("com.razorpay:checkout:1.6.36")

    // Glide for image loading
    implementation("com.github.bumptech.glide:glide:4.16.0") // Updated version
    annotationProcessor("com.github.bumptech.glide:compiler:4.16.0") // Updated version

    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    // Add these inside the dependencies { ... } block
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.16.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.3") // Use a recent version
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")

    // Testing libraries
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}