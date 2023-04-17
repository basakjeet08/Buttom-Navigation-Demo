package `in`.iot.lab.bottomnavigationwithbuttons

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.HomeActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}