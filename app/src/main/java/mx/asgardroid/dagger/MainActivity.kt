package mx.asgardroid.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import dagger.internal.DaggerCollections
import mx.asgardroid.dagger.data.UserLocalDataSource
import mx.asgardroid.dagger.data.UserLocalDataSource_Factory.create
import mx.asgardroid.dagger.data.UserRemoteDataSource
import mx.asgardroid.dagger.repository.UserRepository
import mx.asgardroid.dagger.viewmodel.LoginViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProvider(this).get(LoginViewModel::class.java)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val applicationGraph: ApplicationGraph = DaggerApplicationGraph.create()

        val repository = UserRepository(
            UserLocalDataSource(),
            UserRemoteDataSource()
        )
        viewModel.setRepository(repository)

        viewModel.getUserLocal()
        viewModel.getUserRemote()
    }
}