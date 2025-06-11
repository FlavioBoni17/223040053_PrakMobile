package id.ac.unpas.storyapp.data.remote

import retrofit2.http.Body
import retrofit2.http.POST
import id.ac.unpas.storyapp.data.remote.model.LoginRequest
import id.ac.unpas.storyapp.data.remote.model.LoginResponse

interface ApiService {
    @POST("login")
    suspend fun login(@Body loginRequest: LoginRequest): LoginResponse

    // Tambahkan endpoint lain di sini
}