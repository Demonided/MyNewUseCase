package com.example.mynewusecase.domain.usecase

import com.example.mynewusecase.domain.models.UserName

class GetUserNameUseCase {

    fun executive(): UserName {
        return UserName(firstName = "Maks", lastName = "Shostak")
    }
}