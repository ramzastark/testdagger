package mx.asgardroid.dagger.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import mx.asgardroid.dagger.repository.UserRepository

class LoginViewModel : ViewModel()  {


    private lateinit var repository: UserRepository

    fun setRepository(repository: UserRepository) {
        this.repository = repository
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