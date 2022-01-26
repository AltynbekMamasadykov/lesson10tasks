package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
//
//        String[] names = {"Aza","Ali","Adi"};
//        for (String name : names) {
//            System.out.println(name + " Jaksi korom");
//        }



         /*Напишите код, который будетзапрашивать слово из консоли.Создайте метод и передайте словокоторое
   получите из консоли в параметр метода.Метод должен превратить все буквы вслове на заглавные и убрать
   все лишниепробелы в слове.Если в слове содержится буква «А» тометод должен обрезать слово
   до букв «А»и вернуть его.Если слово не содержит букву «А»
   тодолжен вернуть сообщение что слово «Несодержит».
    */
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        System.out.println(word(myString));


    }

    /*Varargs колдонуп метод тузунуз.Методко канча аргумент берсениз ошонунсуммасын "кайтарсын".*/
    static int sum(int... var){
        int count=0;
        for (int i = 0; i < var.length; i++) {
            count++;
        }return count;
    }

    static String word(String str){
        String result = str.toUpperCase();
        result = result.trim();

        if(result.contains("A")) {
            int aPosition = result.indexOf('A');
            result = result.substring(0, aPosition);
            return result;
        }return "Несодержит";

    }



}
