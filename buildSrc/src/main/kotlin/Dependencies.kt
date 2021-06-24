/**
 * other libraries
 */
object Dependencies {

    // kotlin
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"

    // coroutine
    const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}"
    const val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}"

    // multidex
    const val multidex = "androidx.multidex:multidex:${Versions.multidex}"

    // network
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"

    // glide
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"

    // Timber and Logger
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    const val orhanobut = "com.orhanobut:logger:${Versions.orhanobut}"

    // Hilt
    const val hilt = "com.google.dagger:hilt-android:${Versions.daggerHilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.daggerHilt}"
}
