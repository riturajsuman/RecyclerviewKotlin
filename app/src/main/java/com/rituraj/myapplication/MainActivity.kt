package com.rituraj.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rituraj.myapplication.adapter.CustomAdapter
import com.rituraj.myapplication.model.User

class MainActivity : AppCompatActivity() {

    private var TAG: String = MainActivity::class.java.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.contactDetail)

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val ser = User("Rituraj suman", "123456")
        val ser1 = User("Rituraj", "9019758277")
        val ser2 = User("Rituraj suman", "82695037")
        val value: ArrayList<User> = ArrayList()
        value.add(ser)
        value.add(ser1)
        value.add(ser2)
        value.add(ser)

        val adapter = CustomAdapter(value)

        recyclerView.adapter = adapter


    }
}
