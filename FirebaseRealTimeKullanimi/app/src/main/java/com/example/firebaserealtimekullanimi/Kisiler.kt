package com.example.firebaserealtimekullanimi

import com.google.firebase.database.IgnoreExtraProperties


@IgnoreExtraProperties //Firebase erişim sağlıyor güncelleme değişiklik yapmayı sağlıyor.
data class Kisiler(var kisiAd:String? = "",var kisiYas:Int? = 0) {


}