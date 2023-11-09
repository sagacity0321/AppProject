package com.example.appproject.datas

import java.io.Serializable

class RecoData(
    val name: String,
    val description: String,
    val imgURL: String
) {
    companion object{
        fun getList(): List<RecoData> {
            val recoList = ArrayList<RecoData>()
            recoList.clear()
            recoList.add(RecoData("서울", "서울특별시. 한국의 수도", "https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/one.jpg"))
            recoList.add(RecoData("부산", "부산광역시. 한국 최대의 항구도시", "https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/two.jpg"))
            recoList.add(RecoData("대구", "대구광역시. 그냥 대구", "https://raw.githubusercontent.com/AndroidCodility/StaggeredRecyclerView/master/images/three.jpg"))
            return recoList
        }
    }
}