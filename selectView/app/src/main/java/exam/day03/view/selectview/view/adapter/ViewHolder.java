package exam.day03.view.selectview.view.adapter;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;

import exam.day03.view.selectview.R;

public class ViewHolder {
    ImageView myImg;
    TextView nameView;
    TextView dateView;
    TextView comView;
    CheckBox chkView;

    public ViewHolder(View parentView) {
        this.myImg = parentView.findViewById(R.id.img);
        this.nameView = parentView.findViewById(R.id.name);
        this.dateView = parentView.findViewById(R.id.date);
        this.comView = parentView.findViewById(R.id.resultinfo);
        this.chkView=parentView.findViewById(R.id.exam_chk);
    }
}
