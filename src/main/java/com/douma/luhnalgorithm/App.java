package com.douma.luhnalgorithm;

public class App 
{
    public static void main( String[] args )
    {
        LuhnAlgorithm luhnAlgorithm = new LuhnAlgorithm();
        if(luhnAlgorithm.valid(args[0])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
