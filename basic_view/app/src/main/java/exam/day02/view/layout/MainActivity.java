package exam.day02.view.layout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_exam01);  //layout은 layout폴더 이름 그 다음은 xml파일 이름
    }
}
