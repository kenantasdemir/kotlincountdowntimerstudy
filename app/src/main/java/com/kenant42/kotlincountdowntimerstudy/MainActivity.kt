package com.kenant42.kotlincountdowntimerstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.kenant42.kotlincountdowntimerstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnStart.setOnClickListener{
            val counter = object:CountDownTimer(3000,1000){
                override fun onTick(millisUntilFinished: Long) {
                    binding.textView.text = "Remaining Time : ${millisUntilFinished/1000} second(s)"
                }

                override fun onFinish() {
                    binding.textView.text = "Finished "
                }
            }
            counter.start()
        }
    }
}