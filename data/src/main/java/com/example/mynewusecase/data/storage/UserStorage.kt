package com.example.mynewusecase.data.storage

import com.example.mynewusecase.data.storage.models.User

interface UserStorage {

    fun save (user: User): Boolean

    fun get(): User
}