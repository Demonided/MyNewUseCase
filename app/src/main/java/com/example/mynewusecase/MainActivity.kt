package com.example.mynewusecase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mynewusecase.databinding.ActivityMainBinding
import com.example.mynewusecase.domain.usecase.GetUserNameUseCase
import com.example.mynewusecase.domain.usecase.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val getUserNameUseCase = GetUserNameUseCase()
    private val saveUserNameUseCase = SaveUserNameUseCase()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}