package com.example.dell.wow;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by dell on 2015/5/8.
 */
public class DetailActivity extends ActionBarActivity {

    private ImageView mImgBckGrd;
    private TextView mInfo;
    private TextView mAddress;
    private ImageView mMap;
    private ListView mComments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mImgBckGrd =(ImageView)findViewById(R.id.imageView);
        mInfo = (TextView)findViewById(R.id.textView);
        mAddress = (TextView)findViewById(R.id.textView2);
        mMap = (ImageView)findViewById(R.id.imageView2);
        mComments = (ListView)findViewById(R.id.listView);

        mImgBckGrd.setImageResource(1);
    }




}
