package exam.day03.view.selectview.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import exam.day03.view.selectview.R;
import exam.day03.view.selectview.view.adapter.ActorItem;
import exam.day03.view.selectview.view.adapter.ExamAdapter;
import exam.day03.view.selectview.view.adapter.MyAdapter2;

public class SelectView_ExamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_exam_main);
        CheckBox chk;
        TextView info=findViewById(R.id.txtInfo_cust);
        ListView listview=findViewById(R.id.cust_listview);

        ActorItem actorItem;
        ArrayList<ActorItem> actorlist = new ArrayList<ActorItem>();
        actorItem = new ActorItem(R.drawable.ansoccer,"안정환","2020/04/06","멋져",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.chasoccer,"차범근","2020/04/06","아들~~",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.jjangkim,"김어준","2020/04/06","찐",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.kbr,"김범룡","2020/04/06","진짜가수",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.yeona,"김서연","2020/04/06","이뻐",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.kimdong,"이민호","2020/04/06","멋져",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.leemin,"이민호","2020/04/06","멋져",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.parksoccer,"박지성","2020/04/06","멋져",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.ansoccer,"안정환","2020/04/06","멋져",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.chasoccer,"차범근","2020/04/06","아들~~",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.jjangkim,"김어준","2020/04/06","찐",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.kbr,"김범룡","2020/04/06","진짜가수",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.yeona,"김서연","2020/04/06","이뻐",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.kimdong,"이민호","2020/04/06","멋져",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.leemin,"이민호","2020/04/06","멋져",false);
        actorlist.add(actorItem);
        actorItem = new ActorItem(R.drawable.parksoccer,"박지성","2020/04/06","멋져",false);
        actorlist.add(actorItem);

        ExamAdapter adpater = new ExamAdapter(this,R.layout.select_exam_row,actorlist);

        listview.setAdapter(adpater);
    }
}
