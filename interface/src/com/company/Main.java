package com.company;

public class Main {

    public static void main(String[] args) {


        fish fish = new fish();
        fish.flee();
        fish.hunt();


    }

    public static class fish implements prey, predator {


        @Override
        public void flee() {
            System.out.println("the fish is fleeing");
        }

        @Override
        public void hunt() {
            System.out.println("the fish is hunting");

        }
    }
    interface prey {
        void flee();
    }

    interface predator {
        void hunt();

    }
}
