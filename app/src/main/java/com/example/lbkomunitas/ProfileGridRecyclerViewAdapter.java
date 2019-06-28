package com.example.lbkomunitas;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
 
import com.quicktapgame.instagramlike.R;
 
public class ProfileGridRecyclerViewAdapter extends RecyclerView.Adapter<ProfileGridRecyclerViewAdapter.PostViewHolder>{
 
private Context mContext;
    private int[] mPlaceList;
 
    public ProfileGridRecyclerViewAdapter(Context mContext, int[] mPlaceList) {
this.mContext = mContext;
        this.mPlaceList = mPlaceList;
}
 
@Override
public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_grid_recyclerview_item,
parent, false);
        return new PostViewHolder(view);
}
 
@Override
public void onBindViewHolder(final PostViewHolder holder, int position) {
        holder.mPlace.setImageResource(mPlaceList[position]);
}
 
@Override
public int getItemCount() {
return mPlaceList.length;
}
 
 
class PostViewHolder extends RecyclerView.ViewHolder{
 
        ImageView mPlace;
 
        public PostViewHolder(View itemView) {
super(itemView);
mPlace = itemView.findViewById(R.id.field_grid_item_pic);
}
    }
 
 
 
}