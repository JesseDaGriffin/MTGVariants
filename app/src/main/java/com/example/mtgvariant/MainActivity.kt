package com.example.mtgvariant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun planechaseClicked(view: View) {
        val intent = Intent(this, PlanechaseActivity::class.java.apply {

        })
        startActivity(intent)
    }

    fun archenemyClicked(view: View) {
        val intent = Intent(this, ArchenemyActivity::class.java.apply {

        })
        startActivity(intent)
    }

    fun rulesClicked(view: View)  {
        val intent = Intent(this, RulesActivity::class.java.apply {

        })
        startActivity(intent)
    }
}
