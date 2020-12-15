package mx.asgardroid.dagger.data

import javax.inject.Inject

class UserLocalDataSource @Inject constructor() {
    fun getData() = "UserLocalData"
}