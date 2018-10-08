package th.co.bluesharp.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import th.co.bluesharp.swoosh.Model.Player
import th.co.bluesharp.swoosh.R
import th.co.bluesharp.swoosh.Utils.EXTRA_PLAYER

class SkillActivity : AppCompatActivity() {

    var league = ""
    var skill = ""
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        Toast.makeText(this, player.league, Toast.LENGTH_SHORT).show()

    }

    fun beginnerClicked(view: View) {
        ballerBtn.isChecked = false
        player.skill = "Beginner"
    }

    fun ballerClicked(view: View) {
        beginnerBtn.isChecked = false
        player.skill = "Baller"
    }

    fun finishClicked(view: View) {
        val finishIntent = Intent(this, FinishActivity::class.java)
        finishIntent.putExtra(EXTRA_PLAYER, player)
//        finishIntent.putExtra(EXTRA_SKILL, skill)

        startActivity(finishIntent)
    }
}
