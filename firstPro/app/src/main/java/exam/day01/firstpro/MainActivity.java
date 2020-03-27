package exam.day01.firstpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void confirmMethod(View v){
        Toast.makeText(this,"확인버튼이 눌러졌습니다.",Toast.LENGTH_LONG).show();
    }

    public void cancelMethod(View v){
        Toast.makeText(this,"취소버튼이 눌러졌습니다.",Toast.LENGTH_SHORT).show();
    }

    public void deleteMethod(View v){
        Toast.makeText(this,"삭제버튼이 눌러졌습니다.",Toast.LENGTH_SHORT).show();
    }
}
