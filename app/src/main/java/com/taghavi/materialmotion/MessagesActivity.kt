package com.taghavi.materialmotion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.taghavi.materialmotion.databinding.ActivityMessagesBinding

class MessagesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMessagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessagesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}