package exam.day03.view.advancedview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FrameTest extends AppCompatActivity {

    TextView idinfo;
    TextView pwdinfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_test);

        idinfo=findViewById(R.id.idinput);
        pwdinfo=findViewById(R.id.idinput);
    }
}
