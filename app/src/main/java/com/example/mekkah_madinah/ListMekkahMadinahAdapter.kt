package com.example.mekkah_madinah

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
class ListMekkahMadinahAdapter(private val listMekkahMadinah: ArrayList<MekkahMadinah>) : RecyclerView.Adapter<ListMekkahMadinahAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_mekkah_madinah, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listMekkahMadinah.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val mekkahmadinah = listMekkahMadinah[position]

        Glide.with(holder.itemView.context)
            .load(mekkahmadinah.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = mekkahmadinah.name
        holder.tvLokasi.text = mekkahmadinah.lokasi
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClick(listMekkahMadinah[holder.adapterPosition])
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
        var tvLokasi : TextView = itemView.findViewById(R.id.tv_item_lokasi)
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)

    }
    interface OnItemClickCallback{
        fun onItemClick(data: MekkahMadinah)
    }
}
