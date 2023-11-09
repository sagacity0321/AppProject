package com.example.appproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appproject.R
import com.example.appproject.datas.RecoData

class RecoRVAdapter(
    val recoList: ArrayList<RecoData>
) : RecyclerView.Adapter<RecoRVAdapter.ViewHolder>(
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecoRVAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.reco_list_main_rv, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(recoList[position])
    }

    override fun getItemCount(): Int {
        return recoList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindItems(reco: RecoData){

            val itemTitle = itemView.findViewById<TextView>(R.id.rv_place_name)
            val itemDescription = itemView.findViewById<TextView>(R.id.rv_place_description)
            val itemImg = itemView.findViewById<ImageView>(R.id.img_reco)
            itemTitle.text = reco.name
            itemDescription.text = reco.description

            Glide.with(itemView.context).load(reco.imgURL).into(itemImg)
        }
    }

}

