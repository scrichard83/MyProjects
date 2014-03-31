package com.srichard.cofferun.app;

import android.app.Activity;
import android.widget.NumberPicker;

public class setNumberPickers extends Activity {



  void nPicker(NumberPicker sugarSelect) {
        sugarSelect = (NumberPicker) findViewById(R.id.numberpicker);
        NumberPicker creamSelect = (NumberPicker) findViewById(R.id.numberpicker2);


        if (sugarSelect != null && creamSelect != null){
        sugarSelect.setMaxValue(6);
        sugarSelect.setMinValue(0);
        sugarSelect.setWrapSelectorWheel(true);

        creamSelect.setMaxValue(6);
        creamSelect.setMinValue(0);
        creamSelect.setWrapSelectorWheel(true);
        }
    }
}

