package com.example.loan.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView  listView =(ListView)findViewById(R.id.listview);
        final List<Tree> treeList=new ArrayList<>();
        treeList.add(new Tree(01,"Tom","A",true));
        treeList.add(new Tree(02,"Jenny","B",true));
        treeList.add(new Tree(03,"Alic","C",false));
        treeList.add(new Tree(04,"Main","D",true));
        treeList.add(new Tree(05,"Lee","E",false));
        treeList.add(new Tree(06,"Bae","G",true));
        treeList.add(new Tree(07,"Hea","H",false));
        treeList.add(new Tree(9,"Hoo","K",true));
        //true thi checkbox chọn.
        //Èo, Checkbox nằm ở đâu? View holder hay main?, holder a
        //Vạy sao lại bắt ở main? A đã nói rồi, tất cả các view của listview phải set ở viewholder
        //set lại a xem. nhung ma nó hiển thị lên ma a,
        //E xem này
        for (int i=0;i<treeList.size();i++)
        {
            listView.setItemChecked(i,treeList.get(i).isPrcess());
        }


        //khoi tao Adapter
        ListViewAdapter listViewAdapter=new ListViewAdapter(this,treeList);
        listView.setAdapter(listViewAdapter);

    }
}
