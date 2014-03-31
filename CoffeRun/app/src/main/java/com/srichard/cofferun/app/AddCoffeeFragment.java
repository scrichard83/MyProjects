package com.srichard.cofferun.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AddCoffeeFragment extends Fragment {



   /*         * The fragment argument representing the section number for this
            * fragment.
    */
    private static final String ARG_SECTION_NUMBER = "section_number";

   /*         * Returns a new instance of this fragment for the given section
    * number.
    */


    public static AddCoffeeFragment newInstance(int sectionNumber) {
        AddCoffeeFragment fragment = new AddCoffeeFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;


    }

    public AddCoffeeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        new setNumberPickers();

        View rootView;
        rootView = inflater.inflate(R.layout.add_coffee_fragment, container, false);




        return rootView;
    }
}

