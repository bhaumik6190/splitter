package com.btechlabs.splitter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FriendsFragment extends Fragment {

    private RecyclerView recyclerView;
    private FriendsAdapter friendsAdapter;
    private ArrayList<FriendBean> friendList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_friends, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        friendList = new ArrayList<>();

        friendList.add(new FriendBean("Bhaumik",200,R.drawable.pic1));
        friendList.add(new FriendBean("Hardik",200,R.drawable.pic2));
        friendList.add(new FriendBean("Nirav",200,R.drawable.pic3));
        friendList.add(new FriendBean("Pankaj",200,R.drawable.pic4));
        friendList.add(new FriendBean("Bhaumik",200,R.drawable.pic5));
        friendList.add(new FriendBean("Hardik",200,R.drawable.pic6));
        friendList.add(new FriendBean("Nirav",200,R.drawable.pic7));
        friendList.add(new FriendBean("Pankaj",200,R.drawable.pic8));
        friendList.add(new FriendBean("Bhaumik",200,R.drawable.pic9));
        friendList.add(new FriendBean("Hardik",200,R.drawable.pic10));
        friendList.add(new FriendBean("Nirav",200,R.drawable.pic1));
        friendList.add(new FriendBean("Pankaj",200,R.drawable.pic2));
        friendList.add(new FriendBean("Bhaumik",200,R.drawable.pic3));
        friendList.add(new FriendBean("Hardik",200,R.drawable.pic4));
        friendList.add(new FriendBean("Nirav",200,R.drawable.pic5));
        friendList.add(new FriendBean("Pankaj",200,R.drawable.pic6));


        friendsAdapter = new FriendsAdapter(view.getContext(), friendList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(friendsAdapter);
        return view;
    }

}
