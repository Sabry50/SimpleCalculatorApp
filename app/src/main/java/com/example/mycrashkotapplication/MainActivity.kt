package com.example.mycrashkotapplication

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mycrashkotapplication.databinding.ActivityMainBinding
import com.example.mycrashkotapplication.ui.theme.MyCrashKotApplicationTheme

class MainActivity : ComponentActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.textView.setOnClickListener{this}
        binding.textNumberTwo.setOnClickListener{this}
        binding.textView4.setOnClickListener{this}
        binding.buttonAdd.setOnClickListener{this}
        binding.buttonMulti.setOnClickListener{this}
        binding.buttonSubtract.setOnClickListener{this}

    }

     fun  onClick(v: View){

         var a = binding.textView.text.toString().toDouble()
         var b = binding.textNumberTwo.text.toString().toDouble()
         var result = 0

         when(v?.id) {
             R.id.button_add -> {
                 result = (a + b).toInt()
             }
             R.id.button_subtract -> {
                 result = (a - b).toInt()
             }
             R.id.button_multi -> {
                 result = (a * b).toInt()
             }
         }

         binding.textView4.text = "Result is $result"
     }

}