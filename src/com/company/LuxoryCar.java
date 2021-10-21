package com.company;

public class LuxoryCar extends Car
{
    private String acType;
    @Override
    public void assemble()
    {
        System.out.println("Luxory car assembled");

    }
    @Override
    public void roadTest()
    {
        System.out.println("Luxry car Tested");
    }
    @Override
    public void deliver()
    {
        System.out.println("Luxory car Delivered");
    }

}
