package exam.day03.view.selectview;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CheckActivity extends AppCompatActivity {
    // 뷰의 주소값을 담을 참조변수
    TextView text1;
    CheckBox[] checkArr = new CheckBox[3];
    Switch myswitch ;
    Button showStatus;
    Button setCheckBtn;
    Button clearCheckBtn;
    Button reverseCheckStats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check);
        // 뷰의 주소 값을 가지고 온다. - 26버전부터는 캐스팅 클래스를 정의하지 않아도 된다.
        text1 = findViewById(R.id.checkTxt);
        checkArr[0] = findViewById(R.id.check1);
        checkArr[1] = findViewById(R.id.check2);
        checkArr[2] = findViewById(R.id.check3);
        showStatus = findViewById(R.id.btnCheck1);
        setCheckBtn = findViewById(R.id.btnCheck2);
        clearCheckBtn = findViewById(R.id.btnCheck3);
        reverseCheckStats = findViewById(R.id.btnCheck4);

        myswitch = findViewById(R.id.switch1);
        // 체크박스에 리스너를 설정한다.
        ChechBoxListener listener=new ChechBoxListener();
       for(int i=0;i<checkArr.length;i++){
           checkArr[i].setOnCheckedChangeListener(listener);
       }
        myswitch.setOnCheckedChangeListener(listener);
        showStatus.setOnClickListener(listener);
        setCheckBtn.setOnClickListener(listener);
        clearCheckBtn.setOnClickListener(listener);
        reverseCheckStats.setOnClickListener(listener);
    }
    //체크박스들의 상태를 출력하는 메소드
    public void getCheckStatus(){
        text1.setText("");
        for(int i=0;i<checkArr.length;i++){
            //isChecked()는 체크박스가 선택되어 있으면 true리턴
            if(checkArr[i].isChecked()){
                String tag=(String)checkArr[i].getTag();
                text1.append(tag+"번 체크박스가 체크가 설정됨\n");

            }

        }
    }
    //모든 체크박스의 상태를 체크 상태로 설정 - 매개변수를 이용해서 설정 및 해제
    public void setCheckVal(boolean chkVal){
        for(int i=0;i<checkArr.length;i++){
            checkArr[i].setChecked(chkVal);
        }
    }

    //체크박스가 선택되어 있으면 해제, 해제되어 있으면 선택
    public void toggle(){
        for(int i=0;i<checkArr.length;i++){
            checkArr[i].toggle();
        }
    }

    class ChechBoxListener implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnCheck1:
                    setCheckVal(true);
                    break;
                case R.id.btnCheck2:
                    getCheckStatus();
                    break;
                case R.id.btnCheck3:
                    setCheckVal(false);
                    break;
                case R.id.btnCheck4:
                    toggle();
                    break;
            }
        }
        //체크박스의 상태가 변경될 때 호출되는 메소드
        //체크박스와 스위치가 선택되면 Toast로 "xxx체크 박스 선택",
        //해제되면 "xxx체크 박스 해제"
        //스위치도 체크 해재에 따라 토스트 출력
        public void display(int index,TextView txtView,boolean checkState){
            if(checkState){
                txtView.setText(index+"번째 체크박스가 선택");
            }else{
                txtView.setText(index+"번째 체크박스가 해제");
            }

        }

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            if(buttonView instanceof CheckBox){
                //체크되면 TextView에 체크 메시지가 출력
                display(Integer.parseInt(buttonView.getTag()+""),text1,isChecked);
            }else{
                Log.d("check","switch");
                if(buttonView.getId()==R.id.switch1){
                    String msg="";
                    if(buttonView.isChecked()){
                        msg="활성";
                    }else{
                        msg="비활성";
                    }
                    Toast.makeText(CheckActivity.this,"활성",Toast.LENGTH_LONG).show();
                }
            }
            /*for(int i=0;i<checkArr.length;i++){
                if(checkArr[i].isChecked()){
                    Toast.makeText(CheckActivity.this,(i+1)+"번째 선택",Toast.LENGTH_SHORT).show();
                }else if (!checkArr[i].isChecked()) {
                    Toast.makeText(CheckActivity.this, (i + 1) + "번째 해제", Toast.LENGTH_SHORT).show();
                }
            }*/

        }
    }


}
