import com.infoshare.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*EqualsTest test = new EqualsTest();*/
/*
        test.show();

        EqualsTest builder = new EqualsTest();

        test.builder();*/

        /*test.fillTable(5);*/

        /*test.fillMap();*/

        /*int [] tablica = {1,2,3,4,5,6,7,8,9,10};

        try{
            System.out.println(tablica[15]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("wyjatek");
        }

        test.fillMap();*/

        /*Cat myCat = new Cat();
        Dog myDog = new Dog();
        Animal myAnimal = new Animal();
        myAnimal.eat();
        myCat.eat();
        myDog.eat();
        */
        DotScanner value = new DotScanner();

        String dowolnyTekst;

         /*value.setCounter();
        value.setDenominator();*/

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("podaj licznik: ");
        value.setCounter(scanner.nextInt());
        System.out.println("podaj mianownik: ");
        value.setDenominator(scanner.nextInt());

        value.value();*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst do azalizy: ");
        dowolnyTekst = (scanner.nextLine());
        System.out.println(dowolnyTekst);

        String[] dowolnyTekstArray = dowolnyTekst.split("\\.");
        for (int i = 0 ; i < dowolnyTekstArray.length; i++){
                    }
        System.out.println(dowolnyTekstArray.length-1);

    }
}
