package multi.android.thread;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;

public class HandlerExam extends AppCompatActivity {

    TextView num;
    Handler handler;
    int progressval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_exam);
        num=findViewById(R.id.num);

        handler=new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                if(msg.what==1){
                    int val=msg.arg1;
                    num.setText(val+"");
                }
            }
        };
    }

    public void useMessageHandler(View view){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=100;i++){
                    //변경할 뷰의 정보나 Handler에게 전달한 데이터를
                    //Message객체로 생성한다.
                    Message msg=new Message();

                    //Handler에게 작업을 의뢰한 쓰레드를 구분하기 위한 코드
                    msg.what=1;
                    msg.arg1=i; //전달할 데이터
                    //Message객체를 전달하며 핸들러에게 작업을 의뢰
                    handler.sendMessage(msg);
                    SystemClock.sleep(100);//1초동안 쉬게 (1초동안 멈춰있는 효과)
                }
            }
        }).start();
    }
}
