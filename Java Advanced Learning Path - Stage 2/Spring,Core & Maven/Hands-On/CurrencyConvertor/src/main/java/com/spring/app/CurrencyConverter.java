package com.spring.app;

import java.util.Map;

public class CurrencyConverter {
    public Map<String, String> mObj;

    public int getTotalCurrencyValue(String value) {
        int number = Integer.parseInt(value.split("[a-zA-Z]")[0]);
        String[] data = value.split("[0-9]");
        String key = data[data.length - 1].toUpperCase();

        if (mObj.containsKey(key)) {
            return number * Integer.parseInt(mObj.get(key));
        } else {
            return 0;
        }
    }

    public Map<String, String> getmObj() {
        return mObj;
    }

    public void setmObj(Map<String, String> mObj) {
        this.mObj = mObj;
    }
}
