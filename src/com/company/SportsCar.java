package com.company;

public class SportsCar extends Car
{
    private String power;

    @Override
    public void assemble()
    {
        System.out.println("Sports car assembled");
    }
    @Override
    public void roadTest()
    {
        System.out.println("Sports car Tested");
    }
    @Override
    public void deliver()
    {
        System.out.println("Sports car Delivered");
    }
}
