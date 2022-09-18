package com.faridaziz.sqlite1.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.faridaziz.sqlite1.R

class Adapter(private val context: Activity, private val tanggal: ArrayList<String>, private val nomial: ArrayList<String>, private val keterangan: ArrayList<String>)
    : ArrayAdapter<String>(context, R.layout.list_row, tanggal){

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_row, null, true)

        val tv_tanggal = rowView.findViewById(R.id.list_tanggal) as TextView
        val tv_nomial = rowView.findViewById(R.id.list_nominal) as TextView
        val tv_keterangan = rowView.findViewById(R.id.list_keterangan) as TextView

        tv_tanggal.text = tanggal[position]
        tv_nomial.text = nomial[position]
        tv_keterangan.text = keterangan[position].toString()

        return rowView
    }
}