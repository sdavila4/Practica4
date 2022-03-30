package practica4;

import java.util.Scanner;
public class Practica4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mexicano persona = new Mexicano();
       // System.out.println("");
        System.out.println("Ingrese su primer nombre :");
        persona.asignarPn(scan.nextLine());

        System.out.println("Ingrese su segundo nombre:");
        persona.asignarSn(scan.nextLine());

        System.out.println("Ingrese su apellido paterno:");
        persona.asignarAp(scan.nextLine());

        System.out.println("Ingrese su segundo apellido:");
        persona.asignarAm(scan.nextLine());

        System.out.println("Ingrese su genero (Hombre/Mujer):");
        persona.asignarGen(scan.nextLine());

        System.out.println("Ingrese el estado en donde nació:");
        persona.asignarSt(scan.nextLine());

        System.out.println("\nIngrese su fecha de nacimiento.(Ej: 01/05/2001)\n");
        System.out.println("Día:");
        persona.asignarDia(scan.nextLine());
        System.out.println("Mes:");
        persona.asignarMes(scan.nextLine());
        System.out.println("Año:");
        persona.asignarAño(scan.nextLine());

        persona.metodoCurp(persona.getPn(),persona.getSn(),persona.getAp(),persona.getAm(),persona.getGen(),persona.getSt(),persona.getDia(),persona.getMes(),persona.getAño());
        persona.metodoRFC(persona.getPn(),persona.getSn(),persona.getAp(),persona.getAm(),persona.getGen(),persona.getSt(),persona.getDia(),persona.getMes(),persona.getAño());
        scan.close();
    }
}