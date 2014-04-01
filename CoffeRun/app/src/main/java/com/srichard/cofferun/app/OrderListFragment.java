package com.srichard.cofferun.app;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by Shaun on 2014-03-30.
 */
public class OrderListFragment extends ListFragment {
    String[] list_items;

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static OrderListFragment newInstance(int sectionNumber) {
        OrderListFragment fragment = new OrderListFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public OrderListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.order_list_fragment, container, false);
     /*   list_items = getResources().getStringArray(R.array.list_array);
        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list_items));*/
        return rootView;

    }
}