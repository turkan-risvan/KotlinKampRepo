import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.a4haftaodev.R

class SonrakiSayfaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonraki_sayfa)

        val mesaj = intent.getStringExtra("mesaj")
        val mesajTextView: TextView = findViewById(R.id.mesajTextView)
        mesajTextView.text = mesaj
    }
}
