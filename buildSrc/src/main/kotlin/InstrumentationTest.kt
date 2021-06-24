/**
 * ui test libraries
 */
object InstrumentationTest {
    const val androidTestHilt = "com.google.dagger:hilt-android-testing:${Versions.daggerHilt}"
    const val androidTestRoom = "androidx.room:room-testing:${Versions.room}"
    const val androidTestWorkManager = "androidx.work:work-testing:${Versions.workManager}"
    const val androidTestTruth = "com.google.truth:truth:${Versions.truth}"
    const val androidTestAndroidxTestRule = "androidx.test:rules:${Versions.androidxTest}"
    const val androidTestAndroidxTestRunner = "androidx.test:runner:${Versions.androidxTest}"
    const val androidTestAndroidxTestJunitExt = "androidx.test.ext:junit:${Versions.androidxTestExt}"
    const val androidTestAndroidxTestExtKtx =
        "androidx.test.ext:junit-ktx:${Versions.androidxTestExt}"
    const val androidTestEspressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}

/**
 * unit test libraries
 */
object UnitTest {
    const val testJunit = "junit:junit:${Versions.junit}"
    const val testTruth = "com.google.truth:truth:${Versions.truth}"
    const val testMockito = "org.mockito:mockito-core:${Versions.mockito}"
}