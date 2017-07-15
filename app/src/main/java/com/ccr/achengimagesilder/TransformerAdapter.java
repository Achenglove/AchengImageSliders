package com.ccr.achengimagesilder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ccr.achengimagesilderlibrary.SliderLayout;


/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-06-03 20:50
 * @Version: V1.0 <描述当前版本功能>
 */

public class TransformerAdapter extends BaseAdapter {
    private Context mContext;

    public TransformerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return SliderLayout.Transformer.values().length;
    }

    @Override
    public Object getItem(int position) {
        return SliderLayout.Transformer.values()[position].toString();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView t = (TextView) LayoutInflater.from(mContext).inflate(R.layout.item, null);
        t.setText(getItem(position).toString());
        return t;
    }
}
