package com.cargaspuntuales;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by garciparedes on 24/3/15.
 */
public class ContainerFragment extends Fragment {


    public ContainerFragment(){
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment, container, false);

        return view;
    }
}
