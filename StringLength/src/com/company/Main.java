package com.company;

import java.util.*;
import java.io.*;



class Main{
    public static void main(String []argh)
    {



        Scanner input = new Scanner(System.in);
        int t=input.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                String dataType = input.next();
                System.out.println(dataType);
                System.out.println(dataType.length());
                if(dataType.length()<=8){
                    System.out.println(dataType+"can be fillter in ");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                if (dataType.length()<=16){
                    System.out.println(dataType+"can be fillter in ");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                if (dataType.length()<=32){
                    System.out.println(dataType+"can be fillter in ");
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(input.next()+" can't be fitted anywhere.");
            }

        }
    }
}



