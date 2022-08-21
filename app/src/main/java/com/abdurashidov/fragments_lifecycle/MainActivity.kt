package com.abdurashidov.fragments_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val blankFragment=BlankFragment()
        val manager=supportFragmentManager
        manager.beginTransaction().add(R.id.my_container,blankFragment).commit()


    }
}