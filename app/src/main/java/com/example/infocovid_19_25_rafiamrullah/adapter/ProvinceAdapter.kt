package com.example.infocovid_19_25_rafiamrullah.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.infocovid_19_25_rafiamrullah.R
import com.example.infocovid_19_25_rafiamrullah.model.ProvinceResponse
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_province.view.*
import kotlinx.android.synthetic.main.item_province.view.tvPositive
import kotlinx.android.synthetic.main.item_province.view.tvRecover
import kotlinx.android.synthetic.main.item_province.view.tvDeath

class ProvinceAdapter(private var list: ArrayList<ProvinceResponse>): RecyclerView.Adapter<ProvinceAdapter.ProvinceViewHolder>(){
    inner class ProvinceViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(province: ProvinceResponse){
            with(itemView){
                tvName.text = province.attributes.province
                tvPositive.text = province.attributes.positive.toString()
                tvRecover.text = province.attributes.recover.toString()
                tvDeath.text = province.attributes.death.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProvinceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_province, parent, false)
        return ProvinceViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProvinceViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
    }
