package mx.asgardroid.dagger.repository

import mx.asgardroid.dagger.data.UserLocalDataSource
import mx.asgardroid.dagger.data.UserRemoteDataSource
import javax.inject.Inject

// @Inject lets Dagger know how to create instances of this object
class UserRepository @Inject constructor(
    private var userLocalDataSource: UserLocalDataSource,
    private var userRemoteDataSource: UserRemoteDataSource
) {

    fun getDataLocal(): String {
        return userLocalDataSource.getData()
    }

    fun getDataRemote(): String {
        return userRemoteDataSource.getData()
    }

}