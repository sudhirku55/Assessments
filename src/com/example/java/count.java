package com.example.java;

public class count {

    public static int count(String s, char c)
    {
        int res = 0;

        for (int i=0; i<s.length(); i++)
        {
            // checking character in string
            if (s.charAt(i) == c)
                res++;
        }
        return res;
    }

    // Driver method
    public static void main(String args[])
    {
        String str= "Ammonia";
        char c = 'm';
        System.out.println(count(str, c));


    }
}
