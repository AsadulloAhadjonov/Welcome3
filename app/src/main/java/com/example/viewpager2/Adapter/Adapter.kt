package com.example.viewpager2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.viewpager2.Data.User
import com.example.viewpager2.databinding.Item1Binding

class Adapter(val list: List<User>):PagerAdapter() {
    override fun getCount(): Int = list.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var item = Item1Binding.inflate(LayoutInflater.from(container.context), container, false)

        item.imgView.setImageResource(list[position].img)
        item.txtName.text = list[position].name
        item.txtAbout.text = list[position].about

        container.addView(item.root)
        return item.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view =`object` as View
        container.removeView(view)
    }
}