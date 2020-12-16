package mx.asgardroid.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import mx.asgardroid.dagger.models.Dante
import mx.asgardroid.dagger.viewmodel.LoginViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProvider(this).get(LoginViewModel::class.java)
    }

    @Inject lateinit var dante: Dante

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getUserLocal()
        viewModel.getUserRemote()
        Log.d("Repository", "Data Style: ${dante.air.getStyle()} and ${dante.fire.getStyle()}")

    }
}