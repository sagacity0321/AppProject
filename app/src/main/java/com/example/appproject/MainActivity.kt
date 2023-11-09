package com.example.appproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appproject.adapter.RecoRVAdapter
import com.example.appproject.databinding.ActivityMainBinding
import com.example.appproject.datas.RecoData

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        displayRV()
    }

    private fun displayRV(){
        val reco = ArrayList<RecoData>()
        reco.addAll(RecoData.getList())
        binding.rvRecommendList.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        binding.rvRecommendList.adapter = RecoRVAdapter(reco)
    }
}