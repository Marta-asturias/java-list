package com.javalist;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Listas listas = new Listas();
        System.out.println(listas.getDays());;
    }
}
