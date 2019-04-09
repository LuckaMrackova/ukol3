package com.example.ukol3;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class OurAdapter extends ArrayAdapter {

    private final ArrayList<Films> films;
    private final Activity activity;

    public OurAdapter(Activity activity, ArrayList<Films> films) {
super(activity, R.layout.item_list, films);
this.activity=activity;
this.films=films;
    }

public View getView (int position, View view, ViewGroup parent){
    LayoutInflater inflater=activity.getLayoutInflater();
    View rowView=inflater.inflate(R.layout.item_list, null,true);

    TextView name=rowView.findViewById(R.id.name);
    TextView description=rowView.findViewById(R.id.description);
    ImageView image=rowView.findViewById(R.id.image);
    TextView type=rowView.findViewById(R.id.type);
    TextView rating=rowView.findViewById(R.id.rating);

name.setText(films.get(position).name);
description.setText(films.get(position).description);
type.setText(films.get(position).type);
rating.setText(films.get(position).rating);
image.setImageResource(films.get(position).image);
return rowView;
}
}
