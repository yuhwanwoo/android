package multi.android.material_design_pro2.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import multi.android.material_design_pro2.R;

public class CircleImageRecycleTest extends AppCompatActivity {

    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_image_recycle_test);

        list=findViewById(R.id.list);

        /*List<CircleItem> recycler_circle_data=new ArrayList<CircleItem>();
        CircleItem item=new CircleItem(R.drawable.gong);
        recycler_circle_data.add(item);
        CircleItem item1=new CircleItem(R.drawable.jang);
        recycler_circle_data.add(item1);
        CircleItem item2=new CircleItem(R.drawable.jung);
        recycler_circle_data.add(item2);
        CircleItem item3=new CircleItem(R.drawable.lee);
        recycler_circle_data.add(item3);
        CircleItem item4=new CircleItem(R.drawable.so);
        recycler_circle_data.add(item4);*/ //나는 이렇게 했어

        List<CircleItem> recycler_circle_data=new ArrayList<CircleItem>();
        CircleItem[] item =new CircleItem[5];
        item[0]=new CircleItem(R.drawable.gong);
        item[1]=new CircleItem(R.drawable.jang);
        item[2]=new CircleItem(R.drawable.jung);
        item[3]=new CircleItem(R.drawable.lee);
        item[4]=new CircleItem(R.drawable.so);

        for(int i=0;i<item.length;i++){
            recycler_circle_data.add(item[i]);
        }

        RecyclerCircleAdapter adapter=new RecyclerCircleAdapter(this,R.layout.circle_item,recycler_circle_data);

        LinearLayoutManager manager=new LinearLayoutManager(getApplicationContext());
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        /*GridLayoutManager manager=new GridLayoutManager(getApplicationContext(),2);
        list.setHasFixedSize(true);*/
        list.setLayoutManager(manager);

        list.setAdapter(adapter);
    }


}
