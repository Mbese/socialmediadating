package com.example.socialmediaapp.socilalinksmanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.viewpager.widget.ViewPager
import com.example.socialmediaapp.R
import com.example.socialmediaapp.socilalinksmanagement.dates.OpenDatesFragment
import com.example.socialmediaapp.socilalinksmanagement.followers.FollowersFragment
import com.example.socialmediaapp.socilalinksmanagement.following.FollowingFragment
import com.example.socialmediaapp.socilalinksmanagement.friends.FriendsFragment
import com.google.android.material.tabs.TabLayout

class SocialLinksManagementActivity : AppCompatActivity() {

    private lateinit var pageAdapter: TabsPagerAdapter
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_links_management)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val tabLayout = findViewById<TabLayout>(R.id.icons_tablayout)

        pageAdapter = TabsPagerAdapter(supportFragmentManager)
        pageAdapter.addFragment(FriendsFragment(), "Friends")
        pageAdapter.addFragment(FollowersFragment(), "Followers")
        pageAdapter.addFragment(FollowingFragment(), "Following")
        pageAdapter.addFragment(OpenDatesFragment(), "Open Dates")

        viewPager = findViewById(R.id.pager)
        viewPager.adapter = pageAdapter
        viewPager.addOnPageChangeListener(object : ViewPager.SimpleOnPageChangeListener() {
        })

        tabLayout.tabMode = TabLayout.MODE_SCROLLABLE
        tabLayout.setupWithViewPager(viewPager)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}
