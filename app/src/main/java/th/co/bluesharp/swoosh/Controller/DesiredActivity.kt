package th.co.bluesharp.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_desired.*
import th.co.bluesharp.swoosh.Model.Player
import th.co.bluesharp.swoosh.R
import th.co.bluesharp.swoosh.Utils.EXTRA_PLAYER

class DesiredActivity : BaseActivity() {

    var selectedLeague = ""
    var player = Player("", "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desired)
    }

    fun leagueClicked(view: View) {
        if (player.league != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "You need to select a league", Toast.LENGTH_SHORT).show()
        }

    }

    fun onMenClicked(view: View) {
        womenBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = "men"
    }

    fun onWomenClicked(view: View) {
        menBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = "women"
    }

    fun onCoedClicked(view: View) {
        menBtn.isChecked = false
        womenBtn.isChecked = false
        player.league = "coed"
    }
}
