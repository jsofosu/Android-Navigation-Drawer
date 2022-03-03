package com.github.drawer

import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

open class DrawerBaseActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    var drawerLayout: DrawerLayout? = null

    override fun setContentView(view: View?) {
        drawerLayout = layoutInflater.inflate(R.layout.activity_drawer_base, null) as DrawerLayout
        val container = drawerLayout!!.findViewById<FrameLayout>(R.id.activityContainer)
        container.addView(view)
        super.setContentView(drawerLayout)
        val toolbar: Toolbar = drawerLayout!!.findViewById(R.id.toolBar)
        setSupportActionBar(toolbar)
        val navigationView: NavigationView = drawerLayout!!.findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
        val toggle =
            ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawerLayout!!.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return false
    }

    protected fun allocateActivityTitle(titleString: String?) {
        if (supportActionBar != null) {
            supportActionBar!!.title = titleString
        }
    }
}