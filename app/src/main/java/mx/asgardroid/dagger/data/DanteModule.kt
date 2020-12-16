package mx.asgardroid.dagger.data

import dagger.Module
import dagger.Provides
import mx.asgardroid.dagger.models.Air
import mx.asgardroid.dagger.models.Dante
import mx.asgardroid.dagger.models.Fire
import javax.inject.Singleton

@Module
class DanteModule {
    @Singleton
    @Provides
    fun getFire() = Fire("Katton")

    @Singleton
    @Provides
    fun getAir() = Air("Futton")

    @Singleton
    @Provides
    fun getDante(air: Air, fire: Fire) = Dante(air, fire)
}