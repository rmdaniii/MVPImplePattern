package com.tantawii.mvpimplepattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tantawii.mvpimplepattern.contracts.MainContract
import com.tantawii.mvpimplepattern.databinding.ActivityMainBinding
import com.tantawii.mvpimplepattern.ui.MainPresenter

class MainActivity : AppCompatActivity(), MainContract.MainView{

    private lateinit var  binding: ActivityMainBinding
    private lateinit var  presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initPresenter()
    }

    private fun initPresenter() {
        presenter = MainPresenter(this)

        binding.btnLogin.setOnClickListener {
            presenter.onLogin(
                binding.usernameEdittext.text.toString(),
                binding.passwordEdittext.text.toString()
            )
        }
    }

    override fun onSuccess(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}