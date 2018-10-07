package th.co.bluesharp.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View

class DesiredActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desired)
    }

    fun leagueClicked(view: View) {
        val skillIntent = Intent(this, SkillActivity::class.java)
        startActivity(skillIntent)
    }
}
