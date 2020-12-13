package mx.asgardroid.dagger.repository

import mx.asgardroid.dagger.data.UserLocalDataSource
import mx.asgardroid.dagger.data.UserRemoteDataSource

class UserRepository(var userLocalDataSource: UserLocalDataSource,
                     var userRemoteDataSource: UserRemoteDataSource) {

    fun getDataLocal(): String {
        return userLocalDataSource.getData()
    }

    fun getDataRemote(): String {
        return userRemoteDataSource.getData()
    }

}