package com.example.mynewusecase.domain.usecase

import com.example.mynewusecase.domain.models.UserName
import com.example.mynewusecase.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun executive(): UserName {
        return userRepository.getName()
    }
}