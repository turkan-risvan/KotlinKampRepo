package com.example.cocukeglence.view.adapter

import com.example.cocukeglence.IcerikDetay
import com.example.cocukeglence.Kategoriler
import java.io.Serializable

data class Icerikler(
    var icerik_id:Int,
    var icerik_ad:String,
    var içerik_isim:String,
    var icerik_resim:String,
    var kategoriler: Kategoriler,
    var icerikDetay: IcerikDetay
): Serializable {

}
