package multi.android.supportt_lib.fragment.exam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import multi.android.supportt_lib.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViewFragment1 extends Fragment {

    public ViewFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.view1, container, false);
    }
}
