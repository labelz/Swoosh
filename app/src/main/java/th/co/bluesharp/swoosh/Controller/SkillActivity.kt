package th.co.bluesharp.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import th.co.bluesharp.swoosh.R
import th.co.bluesharp.swoosh.Utils.EXTRA_LEAGUE
import th.co.bluesharp.swoosh.Utils.EXTRA_SKILL

class SkillActivity : AppCompatActivity() {

    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        Toast.makeText(this, league, Toast.LENGTH_SHORT).show()

    }

    fun beginnerClicked(view: View) {
        ballerBtn.isChecked = false
        skill = "Beginner"
    }

    fun ballerClicked(view: View) {
        beginnerBtn.isChecked = false
        skill = "Baller"
    }

    fun finishClicked(view: View) {
        val finishIntent = Intent(this, FinishActivity::class.java)
        finishIntent.putExtra(EXTRA_LEAGUE, league)
        finishIntent.putExtra(EXTRA_SKILL, skill)
        startActivity(finishIntent)
    }
}
