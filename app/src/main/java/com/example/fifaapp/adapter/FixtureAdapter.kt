package com.example.fifaapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fifaapp.R
import com.example.fifaapp.model.FixtureData

class FixtureAdapter(val context: Context,val list:List<FixtureData>) : RecyclerView.Adapter<FixtureAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.list_fixture,parent,false)
        return FixtureAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = list.get(position)
        holder.textViewHome.text = data.homeName
        holder.textViewAway.text = data.awayName
        holder.textViewTime.text = data.date
        holder.textViewMatch.text = data.homeName +" vs "+data.awayName

        Glide.with(context).load("https://countryflagsapi.com/png/"+data.homeName.lowercase()).into(holder.imageViewHome)
        Glide.with(context).load("https://countryflagsapi.com/png/"+data.awayName.lowercase()).into(holder.imageViewAway)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textViewHome: TextView = itemView.findViewById(R.id.textViewHome)
        var textViewAway: TextView = itemView.findViewById(R.id.textViewAway)
        var textViewTime: TextView = itemView.findViewById(R.id.textViewTime)
        var textViewMatch: TextView = itemView.findViewById(R.id.textViewMatch)

        var imageViewHome: ImageView = itemView.findViewById(R.id.imageViewHome)
        var imageViewAway: ImageView = itemView.findViewById(R.id.imageViewAway)

    }
}