package com.example.mynewusecase.domain.usecase

import com.example.mynewusecase.domain.models.SaveUserNameParam
import com.example.mynewusecase.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository : UserRepository) {

    fun execute(param: SaveUserNameParam) : Boolean {

        val oldUserName = userRepository.getName()

        if (oldUserName.firstName == param.name){
            return true
        }

        val result: Boolean = userRepository.saveName(saveParam = param)
        return result
    }
}