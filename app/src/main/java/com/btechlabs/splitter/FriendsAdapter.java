package com.btechlabs.splitter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bhaumik on 02-07-2017.
 */

class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.MyViewHolder> {

    private Context mContext;
    private List<FriendBean> friendList;

    public FriendsAdapter(Context mContext, List<FriendBean> friendList) {
        this.mContext = mContext;
        this.friendList = friendList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.friend_list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        FriendBean friend = friendList.get(position);
        holder.title.setText(friend.getName());
        holder.amount.setText(friend.getAmount() + " Rs");
        holder.thumbnail.setImageResource(friend.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return friendList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView title, amount;
        public ImageView thumbnail;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            amount = (TextView) itemView.findViewById(R.id.amount);
            thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);
        }
    }
}
