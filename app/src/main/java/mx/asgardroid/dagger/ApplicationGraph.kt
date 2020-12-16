package mx.asgardroid.dagger

import dagger.Component
import mx.asgardroid.dagger.data.DanteModule
import javax.inject.Singleton

@Singleton
@Component(modules = [DanteModule::class])
interface ApplicationGraph  {
    fun inject(mainActivity: MainActivity)
}