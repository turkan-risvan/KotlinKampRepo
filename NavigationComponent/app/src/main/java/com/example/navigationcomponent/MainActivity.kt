
/*
Navigation Component
Eragmentler arası (sayfalar arası) geçileri daha pratik yapmamıza olanank tanır
Activity üzerinde istediğimiz şekilde fragment geçişleri yapabiliriz
Geçişlerde veri transfleri yapabiliriz
 */

package com.example.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle




/* Navigation Component
Fragmentlar arası (sayfalar arası) geçişleri daha pratik yapmamıza olanak tanır.
Activity üzerinde istediğimiz şekilde fragment geçişleri yapabiliriz
Geçişlerde veri transferlerini yapabiliriz
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
