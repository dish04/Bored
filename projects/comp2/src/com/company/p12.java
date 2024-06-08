package com.company;

public class p12 {
    static void check(String str,char ch){
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                c++;
            }
        }
        System.out.println(ch+" repeated "+c+" of times.");
    }
    static void check(String s1){
        char[] a = new char[]{'a', 'e', 'i', 'o', 'u'};
        for(int i =0;i<a.length;i++){
            for (int j=0;j<s1.length();j++){
                if(a[i]==s1.charAt(j)){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
