package com.example.emb_ver01.activitys;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.emb_ver01.R;

public class ImageGridAdapter extends BaseAdapter {
	
	private Context mContext;
	
	private Integer[] mThumbIds = {
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,
			R.drawable.ic_launcher,
	
	};
	
	public ImageGridAdapter(Context c){
		mContext = c;
	}
	


	public int getCount() {
		// TODO Auto-generated method stub
		return mThumbIds.length;
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView imageView;
		if(convertView == null){
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(85,85));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(8,8,8,8);
		}else{
			imageView = (ImageView)convertView;
		}
		imageView.setImageResource(mThumbIds[position]);
		return imageView;
	}
	
	

}