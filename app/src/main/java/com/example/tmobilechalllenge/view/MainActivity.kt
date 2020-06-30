package com.example.tmobilechalllenge.view

import android.os.Bundle
import android.transition.Visibility
import android.view.View
import android.widget.ProgressBar
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tmobilechalllenge.R
import com.example.tmobilechalllenge.adapter.CardAdapter
import com.example.tmobilechalllenge.model.Card
import com.example.tmobilechalllenge.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var spinner: ProgressBar

    private val mainViewModel: MainViewModel by viewModels()

    var list = mutableListOf<Card>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.cards_list)
        spinner = findViewById(R.id.loading_spinner)

        mainViewModel.getHome().observe(this, Observer {cards ->
            list = cards.page.cards

            recyclerView.adapter = CardAdapter(list)
            recyclerView.layoutManager = LinearLayoutManager(this)

            spinner.visibility = View.GONE
            recyclerView.visibility = View.VISIBLE

        })


    }
}