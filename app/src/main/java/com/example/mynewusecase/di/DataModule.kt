package com.example.mynewusecase.di

import com.example.mynewusecase.data.repository.UserRepositoryImpl
import com.example.mynewusecase.data.storage.UserStorage
import com.example.mynewusecase.data.storage.sharedprefs.SharedPrefUserStorage
import com.example.mynewusecase.domain.repository.UserRepository
import org.koin.dsl.module

val dataModule = module {

    single<UserStorage> {
        SharedPrefUserStorage(context = get())
    }

    single<UserRepository> {
        UserRepositoryImpl(userStorage = get())
    }
}