package mx.asgardroid.dagger

import android.app.Application

class MyApplication: Application() {
    // Reference to the application graph that is used across the whole app
    val appComponent = DaggerApplicationGraph.create()
}
