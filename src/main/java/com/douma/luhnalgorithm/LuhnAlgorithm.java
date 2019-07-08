package com.douma.luhnalgorithm;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.List;

public class LuhnAlgorithm
{
    public boolean valid(String code) throws Exception
    {
        if(!NumberUtils.isCreatable(code)) {
           throw InvalidNumberException.forNumber(code);
        }

        String reversed = new StringBuilder(code).reverse().toString();
        int index = 1;
        List<Integer> resultArray = new ArrayList<Integer>();

        for (int i = 0; i < reversed.length(); i++) {
            char charAtIndex = reversed.charAt(i);
            int singular = Integer.parseInt(String.valueOf(charAtIndex));
            int value = singular;
            if(index % 2 == 0) {
                value = singular * 2;
                if(value > 9) {
                    value = value - 9;
                }
            }
            resultArray.add(value);
            index++;
        }
        return resultArray.stream().reduce(0, Integer::sum) % 10 == 0;
    }
}
