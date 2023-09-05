import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.a4haftaodev.R

class RehberActivity : AppCompatActivity() {
    private lateinit var adEditText: EditText
    private lateinit var telefonEditText: EditText
    private lateinit var kaydetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rehber)

        adEditText = findViewById(R.id.adEditText)
        telefonEditText = findViewById(R.id.telefonEditText)
        kaydetButton = findViewById(R.id.kaydetButton)

        kaydetButton.setOnClickListener { kaydetButtonClick() }
    }

    private fun kaydetButtonClick() {
        val ad = adEditText.text.toString()
        val telefon = telefonEditText.text.toString()

        if (ad.isEmpty() || telefon.isEmpty()) {
            Toast.makeText(this, "Boş alanları doldurun", Toast.LENGTH_SHORT).show()
            return
        }

        // Numara kaydetme işlemleri burada yapılabilir.

        val intent = Intent(this, SonrakiSayfaActivity::class.java)
        intent.putExtra("mesaj", "Numara başarılı bir şekilde kaydedildi")
        startActivity(intent)
    }
}
