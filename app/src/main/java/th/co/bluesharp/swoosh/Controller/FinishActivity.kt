package th.co.bluesharp.swoosh.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_finish.*
import th.co.bluesharp.swoosh.Model.Player
import th.co.bluesharp.swoosh.R
import th.co.bluesharp.swoosh.Utils.EXTRA_PLAYER

class FinishActivity : AppCompatActivity() {

    var skill = ""
    var league = ""
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
//        skill = intent.getStringExtra(EXTRA_SKILL)
        showTextLoad.text = "Looking for a ${player.league} ${player.skill} league near you..."

    }
}
