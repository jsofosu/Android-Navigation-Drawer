package com.github.drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.drawer.databinding.ActivityDashBoardBinding

class DashBoardActivity : DrawerBaseActivity() {

    private lateinit var binding: ActivityDashBoardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}