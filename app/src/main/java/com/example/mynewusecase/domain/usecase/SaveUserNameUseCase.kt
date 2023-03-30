package com.example.mynewusecase.domain.usecase

import com.example.mynewusecase.domain.models.SaveUserNameParam

class SaveUserNameUseCase {

    fun execute(param: SaveUserNameParam) : Boolean {
        if (param.name.isEmpty()) {
            return false
        } else {
            return true
        }
    }
}