package com.example.mynewusecase.di

import com.example.mynewusecase.domain.usecase.GetUserNameUseCase
import com.example.mynewusecase.domain.usecase.SaveUserNameUseCase
import org.koin.dsl.module

val domainModule = module {

    factory<GetUserNameUseCase> {
        GetUserNameUseCase(userRepository = get())
    }

    factory<SaveUserNameUseCase> {
        SaveUserNameUseCase(userRepository = get())
    }
}