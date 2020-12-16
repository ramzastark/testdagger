package mx.asgardroid.dagger.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import mx.asgardroid.dagger.ApplicationGraph
import mx.asgardroid.dagger.DaggerApplicationGraph
import mx.asgardroid.dagger.repository.UserRepository

class LoginViewModel : ViewModel()  {
    val applicationGraph: ApplicationGraph = DaggerApplicationGraph.create()
    private var repository: UserRepository

    init {
        repository = applicationGraph.repository()
    }

    fun getUserLocal() {
       val data = repository.getDataLocal()
        Log.d("Repository", "Data Local " + data)
    }

    fun getUserRemote() {
       val data = repository.getDataRemote()
        Log.d("Repository", "Data Remote " + data)
    }


}