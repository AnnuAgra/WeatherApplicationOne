package com.example.chinmoy.weatherapplicationone;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {


    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_menu,container,false);
        // Inflate the layout for this fragment

        GridView gridView = (GridView)rootView.findViewById(R.id.gridview);
        gridView.setAdapter(new MyAdapter(getActivity()));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub

                switch(position)
                {
                    case 0:
                        Intent new0Activity = new Intent(getActivity(),MainActivity.class);
                        startActivity(new0Activity);
                        break;
                    case 1:
                        Intent new1Activity = new Intent(getActivity(),MainActivity.class);
                        startActivity(new1Activity);
                        break;

                    case 2:
                        Intent new2Activity = new Intent(getActivity(),MainActivity.class);
                        startActivity(new2Activity);
                        break;
                    default:
                        Toast.makeText(getActivity(), "Wrong Input", Toast.LENGTH_LONG).show();
                }

            }
        });
        return rootView;
    }

}
