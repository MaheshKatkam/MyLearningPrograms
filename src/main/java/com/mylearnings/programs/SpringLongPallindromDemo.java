package com.mylearnings.programs;

public class SpringLongPallindromDemo {

    public static void main(String[] args) {
        String str ="bcacbkvabbabbaxyyyyyyyyyyyyyyyyyyyxdfd";
        String resultPalindromString = "";
        for(int i = 0 ; i <= str.length(); i++){
            for (int j=i+1 ; j<=str.length();j++){
                String p = str.substring(i,j);
                StringBuffer r = new StringBuffer(p).reverse();
                if(p.equals(r.toString())){
                    if(resultPalindromString.length() < r.length()){
                        resultPalindromString = r.toString();
                        System.out.println("PalindromString : "+ resultPalindromString);
                    }
                }
               // System.out.print(p + " ");
            }
        }

        System.out.println();
        System.out.println(resultPalindromString);
    }


}
