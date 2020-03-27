package exam.day02.view.layout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//액티비티가 실행될때 TextView의 문자열을 변경
public class SecondActivity extends AppCompatActivity {
    //Random
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);           //ㅇ
        TextView tv = findViewById(R.id.second_txtView);    //ㅇ     이거 두개 순서 중요해
        tv.setText("안녕~~~~~");
    }
}
