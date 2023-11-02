package com.example.appproject.adapter

import android.content.Context
import android.widget.ArrayAdapter
import com.example.appproject.datas.RecoData

class RecoRVAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RecoData>
    ) : ArrayAdapter<RecoData>(
    mContext, resId, mList
    ) {

    }