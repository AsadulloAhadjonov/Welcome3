package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.core.graphics.alpha
import com.example.viewpager2.Adapter.Adapter
import com.example.viewpager2.Utils.Mydata
import com.example.viewpager2.databinding.ActivityMainBinding
import com.example.viewpager2.databinding.Item2Binding
import com.example.viewpager2.databinding.ItemTochkaBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Mydata.addUser()

        adapter = Adapter(Mydata.list)
        binding.viewPager.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)

        tablayout()
    }

    private fun tablayout() {
        val count = binding.tabLayout.tabCount
        for (i in 0..count){
            val item = ItemTochkaBinding.inflate(layoutInflater)
            val tab = binding.tabLayout.getTabAt(i)
            tab?.customView = item.root
            tab?.view?.findViewById<LinearLayout>(R.id.tab_indicator)?.alpha = 0.1f
        }

        binding.btnSkip.setOnClickListener {
            val lastPageIndex = adapter.count - 1
            binding.viewPager.setCurrentItem(lastPageIndex, true)
        }

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.view?.findViewById<LinearLayout>(R.id.tab_indicator)?.alpha = 1f
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                tab?.view?.findViewById<LinearLayout>(R.id.tab_indicator)?.alpha = 0.1f
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }
}