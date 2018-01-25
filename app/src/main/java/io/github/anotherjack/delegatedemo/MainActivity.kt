package io.github.anotherjack.delegatedemo

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var asd by Weak {
        this
    }

    companion object {
        var act by Weak<Activity>()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        jump.setOnClickListener {
            val i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }

        check.setOnClickListener {
            Toast.makeText(this, "act是否为null -> ${act == null}", Toast.LENGTH_SHORT).show()
        }
    }
}
