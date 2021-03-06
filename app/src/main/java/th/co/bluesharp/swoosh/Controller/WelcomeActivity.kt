package th.co.bluesharp.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*
import th.co.bluesharp.swoosh.R

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        startBtn.setOnClickListener {
            val leagueIntent = Intent(this, DesiredActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
