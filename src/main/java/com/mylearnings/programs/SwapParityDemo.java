package com.mylearnings.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SwapParityDemo {

    public static void main(String[] args) {
        String num = "7596801";
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i= 0 ;i < num.length() ; i ++){
            if(num.charAt(i)%2 == 0 && (i+1 < num.length() && num.charAt(i+1)% 2==0)){
                char temp = num.charAt(i);
                char temp1 = num.charAt(i+1);
                System.out.println(num.substring(0,i)+""+temp1+""+temp+num.substring(i+2));
                numbers.add(Integer.parseInt(num.substring(0,i)+""+temp1+""+temp+num.substring(i+2)));
            }else
            if(num.charAt(i)%2 == 1 && (i+1 < num.length() && num.charAt(i+1)% 2==1)){
                char temp = num.charAt(i);
                char temp1 = num.charAt(i+1);
                System.out.println(num.substring(0,i)+""+temp1+""+temp+num.substring(i+2));
                numbers.add(Integer.parseInt(num.substring(0,i)+""+temp1+""+temp+num.substring(i+2)));
            }
        }

        Collections.sort(numbers);
        System.out.println("Biggest Number is : "+numbers.get(numbers.size()-1));
    }
}
