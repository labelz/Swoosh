package th.co.bluesharp.swoosh

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        startBtn.setOnClickListener {
            val leagueIntent = Intent(this, DesiredActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
