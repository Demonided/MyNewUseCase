package com.example.mynewusecase.domain.repository

import com.example.mynewusecase.domain.models.SaveUserNameParam
import com.example.mynewusecase.domain.models.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}