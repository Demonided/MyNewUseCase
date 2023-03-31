package com.example.mynewusecase.data.storage

interface UserStorage {

    fun save (user: User): Boolean

    fun get(): User
}