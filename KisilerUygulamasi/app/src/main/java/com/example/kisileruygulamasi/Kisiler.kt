package com.example.kisileruygulamasi

import com.google.firebase.database.IgnoreExtraProperties


@IgnoreExtraProperties
data class Kisiler(var kisi_id:String? = null, var kisi_ad:String? = null, var kisi_tel:String? = null){

}
