package com.example.loan.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by LOAN on 7/13/2016.
 */
public class ListViewAdapter extends BaseAdapter{
    List<Tree> treeList;
    Context mContext;
    public ListViewAdapter(Context context, List<Tree> treeList)
    {
        super();
        mContext=context;
        this.treeList=treeList;
    }
    @Override
    public Object getItem(int position) {
        return treeList.get(position);
    }

    @Override
    public int getCount() {
        return treeList.size();
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        //goi Holder
        final ListViewHolder listViewHolder;
        if(convertView==null)//chua nhận view
        {
            view = LayoutInflater.from(mContext).inflate(R.layout.listview_item_layout,parent,false);
            listViewHolder=new ListViewHolder(view, mContext);
            //set tag để lần sau không rỗng thì dùng lại
            view.setTag(listViewHolder);
        }
        else
        {
            view=convertView;
            listViewHolder = (ListViewHolder)view.getTag();
        }
        if(listViewHolder!=null)
        {
            listViewHolder.setData(treeList.get(position));
        }
        return view;
    }
}
