package com.example.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.viewbindingkotlin.databinding.ActivityMainBinding
import javax.net.ssl.SSLSessionBindingEvent

class MainActivity : AppCompatActivity() {


    private lateinit var binding:ActivityMainBinding
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         binding.textView2.text = "Test" //textView'i değiştirmek için bu şekilde text diyerek değiştiriyoruz
         binding.editText.setText("EditText Test") // editText'i değiştirmek içinde setText şeklinde yazarak değiştiriyoruz.


    }
}