package th.co.bluesharp.swoosh.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_finish.*
import th.co.bluesharp.swoosh.R
import th.co.bluesharp.swoosh.Utils.EXTRA_LEAGUE
import th.co.bluesharp.swoosh.Utils.EXTRA_SKILL

class FinishActivity : AppCompatActivity() {

    var skill = ""
    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)
        showTextLoad.text = "Looking for a ${league} ${skill} league near you..."

    }
}
