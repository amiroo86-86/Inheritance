package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Manager manager1 = new Manager();
manager1.setBonus(5000);
manager1.setName("amir");

        System.out.println("the bonus is : " + manager1.getBonus() + " " + "and the name " +
                "is : " + manager1.getName());


    }
}