package com.example.navigationcomponentornek2

import java.io.Serializable

//Veri transferi işlemi için Serizable eklememiz gerekir
data class Kisiler(var kisiNo:Int, var kisiAd:String):Serializable {
}