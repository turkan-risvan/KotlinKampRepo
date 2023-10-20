package com.example.notuygulamas.odev1

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Notlar(var not_id:String? = null, val not_baslik:String? = null, val not_aciklama:String? = null,){

}