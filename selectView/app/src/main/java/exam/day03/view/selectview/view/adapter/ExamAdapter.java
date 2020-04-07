package exam.day03.view.selectview.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;

public class ExamAdapter extends ArrayAdapter<ActorItem> {
    private Context context;
    private int resId;
    private ArrayList<ActorItem> actorlist;

    HashMap<Integer,SaveUserState> saveData=new HashMap<Integer, SaveUserState>();
    public ExamAdapter(Context context,int resId,ArrayList<ActorItem> actorlist){
        super(context, resId, actorlist);
        this.context = context;
        this.resId = resId;
        this.actorlist=actorlist;
    }

    @Override
    public int getCount() {
        return actorlist.size();
    }


    @Override
    public ActorItem getItem(int position) {
        return actorlist.get(position);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder holder=null;
        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(resId, null);

            holder=new ViewHolder(convertView);

            convertView.setTag(holder);

        }else{

            holder=(ViewHolder) convertView.getTag();

        }
        ActorItem actorItem=actorlist.get(position);
        if(actorItem!=null){
            ImageView imageView = holder.myImg;
            TextView nameView = holder.nameView;
            TextView dateView=holder.dateView;
            TextView comView=holder.comView;
            final CheckBox chkView=holder.chkView;

            imageView.setImageResource(actorItem.myImg);
            nameView.setText(actorItem.name);
            dateView.setText(actorItem.date);
            comView.setText(actorItem.com);
            chkView.setChecked(actorItem.chk);
            SaveUserState state=saveData.get(position);

            chkView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    if(!hasFocus){

                        String data=chkView.getText().toString();
                        SaveUserState objstate=new SaveUserState();
                        objstate.data=data;
                        saveData.put(position,objstate);
                    }
                }
            });



        }

        return convertView;
    }
}
