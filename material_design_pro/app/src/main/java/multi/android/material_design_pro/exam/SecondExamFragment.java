package multi.android.material_design_pro.exam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import multi.android.material_design_pro.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondExamFragment extends Fragment {

    public SecondExamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.view2,container,false  );
    }
}
