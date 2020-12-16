package mx.asgardroid.dagger

import dagger.Component
import mx.asgardroid.dagger.module.DanteModule
import mx.asgardroid.dagger.repository.UserRepository
import javax.inject.Singleton

@Singleton
@Component(modules = [DanteModule::class])
interface ApplicationGraph  {
    fun inject(mainActivity: MainActivity)

    fun repository(): UserRepository
}