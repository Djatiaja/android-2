package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        val button_increase:Button = binding.increase
        val button_decrease:Button = binding.decrease
        val button_toasting:Button = binding.toasting

        button_decrease.setOnClickListener(){
            var value = binding.value.text.toString().toInt()
            if(value > 0){
                value--
                binding.value.text = value.toString()
            }
        }

        button_increase.setOnClickListener()
        {
            var value = binding.value.text.toString().toInt()
            value++
            binding.value.text = value.toString()
        }

        button_toasting.setOnClickListener(){
            Toast.makeText(this, "value = " + binding.value.text , Toast.LENGTH_SHORT).show()
        }




    }
}