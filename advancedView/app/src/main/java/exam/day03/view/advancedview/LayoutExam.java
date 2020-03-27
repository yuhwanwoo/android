package exam.day03.view.advancedview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//이벤트를 발생시킬 소스객체가 있는 액티비티에서 이벤트를 처리하는 작업도 같이 할 수 있도록 구현
//1. 이벤트에 반응하는(미리 정해져 있다.) 클래스를 상속받는다.
//2. 메소드를 오버라이딩한다.
//  ex) 버튼을 클릭할때
//      실행할 리스너 => View.OnClickListener의 onClick메소드가 호출

public class LayoutExam extends AppCompatActivity implements View.OnClickListener {

    ImageView firstView;
    ImageView secondView;
    Button btnfirst;
    Button btnsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_exam);
        //layout에 디자인한 ImageView와 Button 객체를 받아오기
        firstView=findViewById(R.id.firstImg);
        secondView=findViewById(R.id.secondImg);
        btnfirst=findViewById(R.id.btnUp);
        btnsecond=findViewById(R.id.btnDown);
        //setOnClickListener()라는 메소드를 이용해서 이벤트소스에 이벤트가 발생했을 때
        //처리할 기능이 구현된 리스너 객체가 어떤것인지 등록
       btnfirst.setOnClickListener(this);
        btnsecond.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d("myevent","이벤트가 발생되었습니다. - 이벤트 처리합니다.");
        if(v.getId()==R.id.btnUp){
            imageUp();
        }else if(v.getId()==R.id.btnDown){
            imageDown();
        }
    }

    public void imageDown(){
        //ImageView에 이미지리소스를 추가
        secondView.setImageResource(R.drawable.beach);
        firstView.setImageResource(0); //이미지 없애기
        //setImageResource메소드를 이용해서 이미지를 변경했다고 하더라도
        //화면이 갱신이 자동으로 되지 않기 때문에 변경되지 않는다.
        //애니메이션을 적용하는 경우는 바로바로 반영이 되어야 하므로
        //화면을 갱신해야 한다.
        secondView.invalidate();
        firstView.invalidate();
    }

    public void imageUp(){
        //ImageView에 이미지리소스를 추가
        firstView.setImageResource(R.drawable.beach);
        secondView.setImageResource(0);
        //setImageResource메소드를 이용해서 이미지를 변경했다고 하더라도
        //화면이 갱신이 자동으로 되지 않기 때문에 변경되지 않는다.
        //애니메이션을 적용하는 경우는 바로바로 반영이 되어야 하므로
        //화면을 갱신해야 한다.
        secondView.invalidate();
        firstView.invalidate();
    }
}
