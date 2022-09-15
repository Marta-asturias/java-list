package com.javalist;



/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String[] arrayString = new String[] {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
    

        for (int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
            
        };
        System.out.println(arrayString.length);


        System.out.println(arrayString[2]);
    }
}
