/**
 * jetpack libraries
 */
object Jetpack {

    // room database
    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomExt = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

    // data store
    const val dataStore = "androidx.datastore:datastore-preferences:${Versions.dataStore}"

    // lifecycle
    const val lifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"

    // work manager (kotlin + coroutine)
    const val workManger = "androidx.work:work-runtime-ktx:${Versions.workManager}"

    // navigation
    const val navigation = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    // transition
    const val transition = "androidx.transition:transition-ktx:${Versions.transition}"

    // paging
    const val paging = "androidx.paging:paging-runtime-ktx:${Versions.paging}"
}
