package com.example.carmediauitestt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(private val carlist:ArrayList<Car>) : RecyclerView.Adapter<CarAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.single_row_layout,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CarAdapter.MyViewHolder, position: Int) {
        val currentItem = carlist[position]
        holder.heading1.text = currentItem.title1
      //  holder.heading2.text = currentItem.title2
        holder.subtitle.text = currentItem.subtitle
        holder.carimage.setImageResource(currentItem.carimg)
        holder.agingmedia.text = currentItem.agingmedia
        holder.stock.text = currentItem.stock
        holder.vin.text = currentItem.vin
        holder.statusimage.setImageResource(currentItem.statusimg)
        holder.status.text=currentItem.status
    }

    override fun getItemCount(): Int {
        return carlist.size
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var heading1 = itemView.findViewById<TextView>(R.id.tv_CarType)
       // var heading2 =  itemView.findViewById<TextView>(R.id.title2)
        var subtitle = itemView.findViewById<TextView>(R.id.tv_Edition)
        var carimage = itemView.findViewById<ImageView>(R.id.iv_carImg)
        var agingmedia = itemView.findViewById<TextView>(R.id.tv_agingMedia)
        var stock = itemView.findViewById<TextView>(R.id.tv_Stock)
        var vin = itemView.findViewById<TextView>(R.id.tv_Vin)
        var statusimage = itemView.findViewById<ImageView>(R.id.tv_statusImg)
        var status = itemView.findViewById<TextView>(R.id.tv_editStatus)
    }
}