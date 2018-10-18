package com.example.sai.recyclerviewdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewholder>{
    private static final Object position = new Object();
    private String[] data;
    public ProgrammingAdapter(String[] data)
    {
       this.data = data;
    }
    @Override
    public ProgrammingViewholder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,viewGroup,false);
        return new ProgrammingViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewholder programmingViewholder, int i) {

    }

    public void onBindViewHolder(ProgrammingViewholder programmingViewholder) {
        String title = data(getItemViewType((Integer) position));
        programmingViewholder.txtTitle.setText(title);
    }

    private String data(int itemViewType) {
        return null;
    }


    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewholder extends RecyclerView.ViewHolder{
        ImageView imgImage;
        TextView txtTitle;
        public ProgrammingViewholder(View itemView) {
            super(itemView);
            imgImage = (ImageView)itemView.findViewById(R.id.imgImage);
            txtTitle = (TextView)itemView.findViewById(R.id.txtTitle);

        }
    }
}
