package org.example;

import org.example.Entity.Dancer;
import org.example.Entity.Programmer;
import org.example.Entity.Singer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("----------------------------------------");

        Programmer programmer = new Programmer("Syimyk","Middle","Google");
        programmer.GetCoding();
        programmer.getLearn();
        programmer.getEat();
        programmer.getWalk();
        System.out.println(programmer);


        System.out.println("----------------------------------------");

        Singer singer = new Singer("Meerim","Singer","Perfect");
        singer.getEat();
        singer.getLearn();
        singer.getWalk();
        singer.getPlayGuitar();
        singer.getSinging();
        System.out.println(singer);


        System.out.println("----------------------------------------");

        Dancer dancer = new Dancer("Kanykey","Key pop","BTS");
        System.out.println(dancer);
        dancer.getLearn();
        dancer.getWalk();
        dancer.getEat();
        dancer.getDancing();

        System.out.println("----------------------------------------");
    }
}
