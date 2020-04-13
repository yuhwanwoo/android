package multi.android.supportt_lib.fragment.exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import multi.android.supportt_lib.R;

public class FragmentMain extends AppCompatActivity {
    view1 view1 = new view1();
    view2 view2 = new view2();
    view3 view3 = new view3();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_pager_main);

        Button btnFirst = findViewById(R.id.button);
        Button btnSecond = findViewById(R.id.button2);
        Button btnThird = findViewById(R.id.button3);

        btnFirst.setOnClickListener(new View.OnClickListener() {
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
        });

    }

    public void setFragment(String name) {
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
    }
}
