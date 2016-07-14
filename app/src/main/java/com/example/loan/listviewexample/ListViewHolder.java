package com.example.loan.listviewexample;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by LOAN on 7/13/2016.
 */
public class ListViewHolder {
    TextView mId;
    TextView mName;
    TextView mSub;
    CheckBox mProcess; //Xử lý là xử lý thằng này nà e
    Context mContext;
    public ListViewHolder(View view, Context context)
    {
        //get id
        mId=(TextView) view.findViewById(R.id.textViewID);
        mName=(TextView) view.findViewById(R.id.textViewName);
        mSub=(TextView) view.findViewById(R.id.textViewSub);
        mProcess=(CheckBox) view.findViewById(R.id.checkboxProcess);
        mContext=context;
        //gọi sự kiện
        mId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"ID là: "+mId.getText(),Toast.LENGTH_LONG).show();
                Toast.makeText(mContext,"Name là: "+mName.getText(),Toast.LENGTH_LONG).show();
                Toast.makeText(mContext,"Sub là: "+mSub.getText(),Toast.LENGTH_LONG).show();

            }
        });
    }
    public  void setData(Tree tree)
    {
        mId.setText(tree.getId()+"");
        mName.setText(tree.getName());
        mSub.setText(tree.getSub());
        //Tree là 1 đối tượng, tức là nếu thuộ tính trong tree đúng thì nó check
        if(tree.isPrcess())
        mProcess.setChecked(true);
        //Xong
        //E chạy đi. dc r anh. hihi
        //E chưa hiểu view holder lắm
    }


}
