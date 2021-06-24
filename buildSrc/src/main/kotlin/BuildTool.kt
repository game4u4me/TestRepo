object BuildTool {

    const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val safeArgs =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.daggerHilt}"
    const val ktlint = "org.jlleitschuh.gradle:ktlint-gradle:${Versions.ktlint}"  // ./gradlew ktlintCheck
    const val remalDependencyChecker =
        "name.remal:gradle-plugins:${Versions.remalDependencyChecker}"  // gradle checkDependencyUpdates
}