package com.srichard.cofferun.app;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.Toast;

public class AddCoffeeFragment extends Fragment {
   /*         * The fragment argument representing the section number for this
            * fragment.
    */
    private static final String ARG_SECTION_NUMBER = "section_number";
    public String newDrink;
    private String[] listArray;

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
        View rootView;
        rootView = inflater.inflate(R.layout.add_coffee_fragment, container, false);

        return rootView;
    }

    public void onActivityCreated (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final NumberPicker sPicker = (NumberPicker) getView().findViewById(R.id.sugarpicker);
        sPicker.setMaxValue(6);
        sPicker.setMinValue(0);
        sPicker.setWrapSelectorWheel(true);

        final NumberPicker cPicker = (NumberPicker) getView().findViewById(R.id.creampicker);
        cPicker.setMaxValue(6);
        cPicker.setMinValue(0);
        cPicker.setWrapSelectorWheel(true);

        final Button addDrink = (Button) getView().findViewById(R.id.add_drink);

        addDrink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                newDrink = sPicker.getValue() + " sugar," + cPicker.getValue() + " cream";
                listArray = new String[15];

                Toast toast = Toast.makeText(getActivity(), newDrink, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0, 25);
                toast.show();

                for (int i = 0; i < listArray.length; i++) {

                    listArray[i] = newDrink;

                    final ArrayAdapter<String> myList = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listArray);
                    final ListView recentList = (ListView) getView().findViewById(R.id.list);
                    recentList.setAdapter(myList);


                }
            }
        });
    }
}

