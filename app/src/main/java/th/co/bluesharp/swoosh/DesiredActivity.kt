package th.co.bluesharp.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_desired.*

class DesiredActivity : BaseActivity() {

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desired)
    }

    fun leagueClicked(view: View) {
        if (selectedLeague != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "You need to select a league", Toast.LENGTH_SHORT).show()
        }

    }

    fun onMenClicked(view: View) {
        womenBtn.isChecked = false
        coedBtn.isChecked = false
        selectedLeague = "men"
    }

    fun onWomenClicked(view: View) {
        menBtn.isChecked = false
        coedBtn.isChecked = false
        selectedLeague = "women"
    }

    fun onCoedClicked(view: View) {
        menBtn.isChecked = false
        womenBtn.isChecked = false
        selectedLeague = "coed"
    }
}
