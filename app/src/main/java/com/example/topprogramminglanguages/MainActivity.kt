package com.example.topprogramminglanguages

import Language
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages = listOf(
            Language(1, "Python", "Known for its simplicity and wide range of applications, including web development, data analysis, AI, and automation.", R.drawable.python_logo),
            Language(2, "Java", "Popular in enterprise environments for developing complex, scalable applications and Android development.", R.drawable.java_logo),
            Language(3, "JavaScript", "Key language for web development, especially with frameworks like React, Angular, and Vue.js.", R.drawable.javascript_logo),
            Language(4, "C#", "Main language for the Microsoft ecosystem, widely used for desktop, web, and mobile applications.", R.drawable.csharp_logo),
            Language(5, "C++", "Often used for developing high-performance applications like game engines and operating systems.", R.drawable.cpp_logo),
            Language(6, "Go", "Gaining popularity for its efficiency and simplicity, often used for network applications and microservices.", R.drawable.go_logo),
            Language(7, "SQL", "Main language for managing and querying databases.", R.drawable.sql_logo),
            Language(8, "PHP", "Popular for server-side web development, especially among beginners.", R.drawable.php_logo),
            Language(9, "Swift", "Preferred language for developing iOS and macOS applications.", R.drawable.swift_logo),
            Language(10, "C", "Known for its performance, used in system software and embedded systems.", R.drawable.c_logo)
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = LanguageAdapter(languages)
    }
}