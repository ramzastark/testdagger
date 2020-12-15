package mx.asgardroid.dagger

import dagger.Component
import mx.asgardroid.dagger.repository.UserRepository

@Component
interface ApplicationGraph  {
    // The return type  of functions inside the component interface is
    // what can be provided from the container
    fun repository(): UserRepository
}