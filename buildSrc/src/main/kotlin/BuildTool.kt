object BuildTool {

    const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val safeArgs =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.daggerHilt}"
    const val spotless = "com.diffplug.spotless:spotless-plugin-gradle:${Versions.spotless}"
    const val dokka = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokka}"
    const val dependencyUpdate = "com.github.ben-manes:gradle-versions-plugin:${Versions.dependencyUpdate}" // ./gradlew dependencyUpdate
}
