package com.company;

public class cwh_35_ch_7_practice_set6 {
    static int average( int ...arr)
    {int sum =0,n=0;

         n=arr.length;

          for (int i:arr)
          {
              sum+=i;

          }
      
      return sum/n;
    }
    public static void main(String[] args) {
int p=average(1,50);
        System.out.println(p);
    }
}
