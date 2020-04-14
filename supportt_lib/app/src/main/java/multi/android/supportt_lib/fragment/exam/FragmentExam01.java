package multi.android.supportt_lib.fragment.exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import multi.android.supportt_lib.R;

public class FragmentExam01 extends AppCompatActivity {
    ViewFragment1 viewFragment1 = new ViewFragment1();
    ViewFragment2 viewFragment2 = new ViewFragment2();
    ViewFragment3 viewFragment3 = new ViewFragment3();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_pager_main);

        /*Button btnFirst = findViewById(R.id.button);
        Button btnSecond = findViewById(R.id.button2);
        Button btnThird = findViewById(R.id.button3);
*/
       /* btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFragment("first");
            }
        });
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFragment("second");
            }
        });
        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFragment("third");
            }
        });*/

    }

    //강사님 풀이

    public void btn_click(View view){
        setFragment(view.getTag().toString());
    }

    public void setFragment(String idx){
        Log.d("fragment",idx);
        FragmentManager fragmentManager =getSupportFragmentManager();
        //프레그먼트의 변화를 관리하는 객체
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        switch (idx){
            case "0":
                transaction.replace(R.id.container,viewFragment1);
                break;
            case "1":
                transaction.replace(R.id.container,viewFragment2);
                break;
            case "2":
                transaction.replace(R.id.container,viewFragment3);
                break;
        }
        transaction.commit();
    }





    //내풀이
    /*public void setFragment(String name) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        switch (name) {
            case "first":
                //지정한 fragment로 특정영역을 교체하는 작업
                transaction.replace(R.id.fragment, view1);
                break;
            case "second":
                //지정한 fragment로 특정영역을 교체하는 작업
                transaction.replace(R.id.fragment, view2);
                break;
            case "third":
                //지정한 fragment로 특정영역을 교체하는 작업
                transaction.replace(R.id.fragment, view3);
                break;
        }
        transaction.commit();
    }*/
}
