package mx.asgardroid.dagger.data

import javax.inject.Inject

class UserRemoteDataSource @Inject constructor() {
    fun getData() = "UserRemoteData"
}