package th.co.bluesharp.swoosh

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class SkillActivity : AppCompatActivity() {

    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        Toast.makeText(this, league, Toast.LENGTH_SHORT).show()

    }
}
