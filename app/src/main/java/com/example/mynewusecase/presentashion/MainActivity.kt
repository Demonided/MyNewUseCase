package com.example.mynewusecase.presentashion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mynewusecase.data.repository.UserRepositoryImpl
import com.example.mynewusecase.data.storage.sharedprefs.SharedPrefUserStorage
import com.example.mynewusecase.databinding.ActivityMainBinding
import com.example.mynewusecase.domain.models.SaveUserNameParam
import com.example.mynewusecase.domain.models.UserName
import com.example.mynewusecase.domain.usecase.GetUserNameUseCase
import com.example.mynewusecase.domain.usecase.SaveUserNameUseCase
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private val vm by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.e("MyLog", "Activity created")

        vm.resultLive.observe(this, Observer {
            binding.edTextGetUserName.text = it
        })

        binding.bSaveUserName.setOnClickListener {
            val text = binding.edTextSaveUserName.text.toString()
            vm.save(text)
        }

        binding.bGetUserName.setOnClickListener {
            vm.load()
        }
    }
}