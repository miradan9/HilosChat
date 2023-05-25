package HilosChat;
//VALERIA DANAE AGUAYO MIRANDA
import Ejecucion_Hilos.EscrituraLenta;

import java.util.Scanner;

public class Chat {
    public static void conversacion(String dialogo, int velocidad){
        char[] caracteres= dialogo.toCharArray();
        for (int i = 0; i < caracteres.length; i++){
            System.out.print(caracteres[i]);
            try{
                Thread.sleep(velocidad);
            }
            catch (Exception e){
                System.out.println(e);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Conversacion {
    public static void main(String[] args) {
        System.out.println("Presta atención a la siguiente conversación y responde las preguntas.");
        System.out.println("CONVERSACIÓN:");
        String megm1 = "-megm: Hi, there!";
        String kathyo1 = "-kathyo: Hi, Meg!";
        String megm2 = "-megm: What are you doing?";
        String kathyo2 = "-kathyo: I'm sitting on my bed with my laptop. I'm doing my homework";
        String megm3 = "-megm: What are you working on?";
        String kathyo3 = "-kathyo: I'm writting an essay for Spanish class. :) Where are you?";
        String megm4 = "-megm: I'm in a cafe with my friend Carmen. I'm having coffee, and she´s talking on the phone outside" +
                ". How is your family?";
        String kathyo4 = "-kathyo: They're all fine! My father's watching a baseball game with his friends. My mother is out shopping.";
        String megm5 = "-megm: Where's your brother?";
        String kathyo5 = "-kathyo: John's playing soccer in the park. Oh, wait.My phone is ringing. My mother's calling me.I have to go!";
        String megm6 = "-megm:Ok!Bye!";

        EscrituraLenta.escribir(megm1, 50);
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EscrituraLenta.escribir(kathyo1, 50);
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        EscrituraLenta.escribir(megm2, 50);
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EscrituraLenta.escribir(kathyo2, 50);
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EscrituraLenta.escribir(megm3, 50);
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EscrituraLenta.escribir(kathyo3, 50);
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EscrituraLenta.escribir(megm4, 50);
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EscrituraLenta.escribir(kathyo4, 50);
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EscrituraLenta.escribir(megm5, 50);
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EscrituraLenta.escribir(kathyo5, 50);
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EscrituraLenta.escribir(megm6, 50);
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    Scanner scanner = new Scanner(System.in);
                System.out.println("PREGUNTAS: ");
                System.out.println("Las preguntas escribelas en minúsculas");

        //Pregunta 1
        String pregunta1 = "1: ___________ is writing an essay";
        EscrituraLenta.escribir(pregunta1, 50);
        System.out.print("\nRespuesta: ");
        String respuesta1 = scanner.nextLine();
            while (!respuesta1.equalsIgnoreCase("kathyo")) {
                System.out.println("Respuesta incorrecta.Inténtalo de nuevo.");
                EscrituraLenta.escribir(pregunta1, 50);
                System.out.print("\nRespuesta: ");
                respuesta1 = scanner.nextLine();
            }
        System.out.println("Respuesta correcta. ");


        //Pregunta 2

        String pregunta2 = "2: ___________ is having coffee";
        EscrituraLenta.escribir(pregunta2, 50);
        System.out.print("\nRespuesta: ");
        String respuesta2 = scanner.nextLine();
        while (!respuesta2.equalsIgnoreCase("megm")) {
            System.out.println("Respuesta incorrecta.Inténtalo de nuevo.");
            EscrituraLenta.escribir(pregunta2, 50);
            System.out.print("\nRespuesta: ");
            respuesta2 = scanner.nextLine();
        }
        System.out.println("Respuesta correcta");

        //Pregunta 3

        String pregunta3 = "3: ___________ is talking on the phone";
        EscrituraLenta.escribir(pregunta3, 50);
        System.out.print("\nRespuesta: ");
        String respuesta3 = scanner.nextLine();
        while (!respuesta3.equalsIgnoreCase("carmen")) {
            System.out.println("Respuesta incorrecta.Inténtalo de nuevo.");
            EscrituraLenta.escribir(pregunta3, 50);
            System.out.print("\nRespuesta: ");
            respuesta3 = scanner.nextLine();
        }
        System.out.println("Respuesta correcta");

        //Pregunta 4
        String pregunta4 = "4: ___________ is watching a baseball game";
        EscrituraLenta.escribir(pregunta4, 50);
        System.out.print("\nRespuesta: ");
        String respuesta4 = scanner.nextLine();
        while (!respuesta4.equalsIgnoreCase("father's kathyo")) {
            System.out.println("Respuesta incorrecta.Inténtalo de nuevo.");
            EscrituraLenta.escribir(pregunta4, 50);
            System.out.print("\nRespuesta: ");
            respuesta4 = scanner.nextLine();
        }
        System.out.println("Respuesta correcta");

        //Pregunta 5
        String pregunta5 = "5: ___________ is shopping";
        EscrituraLenta.escribir(pregunta5, 50);
        System.out.print("\nRespuesta: ");
        String respuesta5 = scanner.nextLine();
        while (!respuesta5.equalsIgnoreCase("mother's kathyo")) {
            System.out.println("Respuesta incorrecta.Inténtalo de nuevo.");
            EscrituraLenta.escribir(pregunta5, 50);
            System.out.print("\nRespuesta: ");
            respuesta5 = scanner.nextLine();
        }
        System.out.println("Respuesta correcta");

        //Pregunta 6
        String pregunta6 = "6: ___________ is playing soccer";
        EscrituraLenta.escribir(pregunta6, 50);
        System.out.print("\nRespuesta: ");
        String respuesta6 = scanner.nextLine();
        while (!respuesta6.equalsIgnoreCase("john")) {
            System.out.println("Respuesta incorrecta.Inténtalo de nuevo.");
            EscrituraLenta.escribir(pregunta6, 50);
            System.out.print("\nRespuesta: ");
            respuesta6 = scanner.nextLine();
        }
        System.out.println("Respuesta correcta");
    }
}

