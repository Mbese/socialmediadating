package com.example.socialmediaapp.socilalinksmanagement.friends;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.socialmediaapp.R;

import java.util.ArrayList;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.MyViewHolder> {

    private ArrayList<String> friends;
    private Context context;

    public FriendsAdapter(Context context, ArrayList<String> friends){
        this.friends = friends;
    }

    @NonNull
    @Override
    public FriendsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.social_media_management_row, viewGroup, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsAdapter.MyViewHolder myViewHolder, int listPosition) {
        ImageView profilePicImageView = myViewHolder.profilePicImageView;
        ImageView unfriendImageView = myViewHolder.unfriendImageView;
        TextView friendUsername = myViewHolder.friendUsername;

        profilePicImageView.setImageResource(R.drawable.poeple);
        unfriendImageView.setImageResource(R.drawable.ic_person_black_24dp);
        friendUsername.setText("Tsenelo");
    }

    @Override
    public int getItemCount() {
        return friends.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView profilePicImageView;
        ImageView unfriendImageView;
        TextView friendUsername;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.profilePicImageView = itemView.findViewById(R.id.friendImageView);
            this.unfriendImageView = itemView.findViewById(R.id.action_image);
            this.friendUsername = itemView.findViewById(R.id.usernameTextView);
        }
    }
}
