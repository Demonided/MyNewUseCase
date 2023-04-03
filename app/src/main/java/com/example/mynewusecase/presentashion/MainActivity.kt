package com.example.mynewusecase.presentashion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mynewusecase.data.repository.UserRepositoryImpl
import com.example.mynewusecase.data.storage.sharedprefs.SharedPrefUserStorage
import com.example.mynewusecase.databinding.ActivityMainBinding
import com.example.mynewusecase.domain.models.SaveUserNameParam
import com.example.mynewusecase.domain.models.UserName
import com.example.mynewusecase.domain.usecase.GetUserNameUseCase
import com.example.mynewusecase.domain.usecase.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val userRepository by lazy(LazyThreadSafetyMode.NONE) {
        UserRepositoryImpl(userStorage = SharedPrefUserStorage(context = applicationContext))
    }
    private val getUserNameUseCase by lazy(LazyThreadSafetyMode.NONE) {
        GetUserNameUseCase(userRepository = userRepository)
    }
    private val saveUserNameUseCase by lazy(LazyThreadSafetyMode.NONE) {
        SaveUserNameUseCase(userRepository = userRepository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bSaveUserName.setOnClickListener {
            val text = binding.edTextSaveUserName.text.toString()
            val params = SaveUserNameParam(name = text)
            val result: Boolean = saveUserNameUseCase.execute(param = params)
            binding.edTextGetUserName.text = "Save result = $result"
        }

        binding.bGetUserName.setOnClickListener {
            val userName: UserName = getUserNameUseCase.executive()
            binding.edTextGetUserName.text = "${userName.firstName} ${userName.lastName}"
        }
    }
}