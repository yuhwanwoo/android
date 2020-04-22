package multi.android.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class AsyncTaskExam01 extends AppCompatActivity {

    Button btn1;
    Button btn2;
    TextView textView;
    ProgressBar progressBar;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_async_task_exam01);
        textView=findViewById(R.id.viewnum);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        imageView=findViewById(R.id.dimg);



        AsynTaskExamm asynTaskExamm=new AsynTaskExamm();
        asynTaskExamm.execute(1);

    }

    class AsynTaskExamm extends AsyncTask<Integer,Integer,Integer>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Integer doInBackground(Integer... integers) {
            int cnt=0;
            int num=integers[0];

            for(int i=0;i<50;i++){
                cnt=+i;
                num=num+i;

                publishProgress(num);
            }

            return cnt;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            int num=values[0];
            if(num%2==0){
                imageView.setImageResource(R.drawable.d1);
            }else{
                imageView.setImageResource(R.drawable.d2);
            }
        }

        @Override
        protected void onCancelled(Integer integer) {
            super.onCancelled(integer);
        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);

        }
    }
}
