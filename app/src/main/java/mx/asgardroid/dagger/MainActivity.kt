package mx.asgardroid.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import mx.asgardroid.dagger.viewmodel.LoginViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProvider(this).get(LoginViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     /*
     Codigo Ahorrado
     val repository = UserRepository(
            UserLocalDataSource(),
            UserRemoteDataSource()
        )
        viewModel.setRepository(repository)*/

        viewModel.getUserLocal()
        viewModel.getUserRemote()
    }
}