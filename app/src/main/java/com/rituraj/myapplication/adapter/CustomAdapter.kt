package com.rituraj.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rituraj.myapplication.R
import com.rituraj.myapplication.model.User

class CustomAdapter(val UserList: ArrayList<User>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return UserList.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.contactName.text = UserList[position].Contact
        holder.firstName.text = UserList[position].userName
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstName: TextView = itemView.findViewById(R.id.firstName) as TextView
        val contactName: TextView = itemView.findViewById(R.id.contactName) as TextView
    }
}