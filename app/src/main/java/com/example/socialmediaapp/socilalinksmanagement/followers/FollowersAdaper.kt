package com.example.socialmediaapp.socilalinksmanagement.followers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.socialmediaapp.R
import java.util.*

class FollowersAdaper(private val followersList: ArrayList<String>) : RecyclerView.Adapter<FollowersAdaper.MyViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): FollowersAdaper.MyViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.social_media_management_row, viewGroup, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(myViewHolder: FollowersAdaper.MyViewHolder, listPosition: Int) {
        val profilePicImageView = myViewHolder.profilePicImageView
        val unfollowImageView = myViewHolder.unfollowImageView
        val friendUsername = myViewHolder.friendUsername

        profilePicImageView.setImageResource(R.drawable.poeple)
        unfollowImageView.setImageResource(R.drawable.ic_thumb_up_black_24dp)
        friendUsername.text = "Tsenelo"
    }

    override fun getItemCount(): Int {
        return followersList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var profilePicImageView: ImageView = itemView.findViewById(R.id.friendImageView)
        internal var unfollowImageView: ImageView = itemView.findViewById(R.id.action_image)
        internal var friendUsername: TextView = itemView.findViewById(R.id.usernameTextView)

    }
}
