package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(){}

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        for (Horse horse : horses){
            horse.move();
        }
    }
    public void print(){
        for (Horse horse : horses){
            horse.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
    public Horse getWinner(){


      return Collections.max(getHorses(),
                (o1, o2) -> (int)o1.getDistance() - (int)o2.getDistance());
                }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }


    public static void main(String[] args) throws InterruptedException {
        Hippodrome hippodrome = new Hippodrome();

      hippodrome.horses = new ArrayList<>();

        Horse horse1 = new Horse("Konella", 3, 0);
        Horse horse2 = new Horse("Blestka", 3, 0);
        Horse horse3 = new Horse("Pirozhenka", 3, 0);

        hippodrome.horses.add(horse1);
        hippodrome.horses.add(horse2);
        hippodrome.horses.add(horse3);

        game = new Hippodrome(hippodrome.horses);

        game.run();
        game.printWinner();
    
    }
}
