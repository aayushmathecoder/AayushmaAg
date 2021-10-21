package com.aayushma.aayushmaag

import android.app.Application
import android.util.Log
import com.aayushma.aayushmaag.characterlist.CharacterListUseCase
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class StarWarsApp: Application() {

    lateinit var listUseCase: CharacterListUseCase

    override fun onCreate() {
        super.onCreate()

        val logger = object : HttpLoggingInterceptor.Logger {
            override fun log(message: String?) {
                Log.d("Harssshhh", message.orEmpty())
            }
        }
        val httpLoggingInterceptor = HttpLoggingInterceptor(logger)
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val retrofit = Retrofit.Builder()
            .baseUrl("https://swapi.dev/api/")
            .client(OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        listUseCase = CharacterListUseCase(retrofit)
    }


}