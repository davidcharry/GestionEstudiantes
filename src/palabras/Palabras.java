/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras;

import java.util.Scanner;

/**
 *
 * @author mono-
 */
public class Palabras {


    private static Scanner sc = new Scanner(System.in);
    private static Estudiante estudiante1 = new Estudiante(1, "Daniel");
    private static Estudiante estudiante2 = new Estudiante(1, "Daniel");
    private static Estudiante estudiante3 = new Estudiante(1, "Daniel");

    public static void main(String[] args) {
        boolean contraseñaValida;
        do {
            contraseñaValida = contraseña();
            if (contraseñaValida) {
                menu();
            } else {
                System.out.println("Contraseña Incorrecta");
            }
        } while (!contraseñaValida);   
    }

    private static boolean contraseña() {
        System.out.print("Ingrese la contraseña: ");
        String contraseniaIngresada = sc.nextLine();
        return contraseniaIngresada.equals("ABCD123789");
    }

    private static void menu() {

        String menu = "Menu de opciones";
        menu += "\n1) Consultar estudiante por codgio";
        menu += "\n2) Consultar el nombre de un estudiante";
        menu += "\n3) Modificar nombre estudiante";
        menu += "\n4) Salir";
        System.out.println(menu);
        int opcion = Integer.parseInt(sc.nextLine());
        switch (opcion) {
            case 1: {
                System.out.println(consultarEstudiante());
                break;
            }
            case 2: {
                System.out.println(consultarNombre());
                break;
            }
            case 3: {
                System.out.println(modificarEstudiante());
                break;
            }
            case 4 : {
                System.out.println("Gracias");
                System.exit(0);
                break;
        }
            default: {
                System.out.println("Opcion incorrecta");
            }
            menu();
        }
    }

    private static String consultarEstudiante() {
        System.out.println("Ingrese el codigo del estudiante: ");
        int codigoIngresado = Integer.parseInt(sc.nextLine());
        if (estudiante1.getCodigo() == codigoIngresado) {
            return estudiante1.toString();
        } else if (estudiante2.getCodigo() == codigoIngresado) {
            return estudiante2.toString();
        } else if (estudiante3.getCodigo() == codigoIngresado) {
            return estudiante3.toString();
        } else {
            return "Estudiante no encontrado";
        }
    }

    private static String consultarNombre() {
        System.out.println("Ingrese el codigo del estudiante: ");
        int codigoIngresado = Integer.parseInt(sc.nextLine());
        if (estudiante1.getCodigo() == codigoIngresado) {
            return estudiante1.getNombre();
        } else if (estudiante2.getCodigo() == codigoIngresado) {
            return estudiante2.getNombre();
        } else if (estudiante3.getCodigo() == codigoIngresado) {
            return estudiante3.getNombre();
        } else {
            return "Estudiante no encontrado";
        }
    }

    private static String modificarEstudiante() {
        System.out.println("Ingrese el codigo del estudiante: ");
        int codigoIngresado = Integer.parseInt(sc.nextLine());
        if (estudiante1.getCodigo() == codigoIngresado) {
            System.out.println("Ingrese el nuevo nombre: ");
            String nuevoNombre = sc.nextLine();
            estudiante1.setNombre(nuevoNombre);
            return "El nuevo nombre es" + estudiante1.toString();
        } else if (estudiante2.getCodigo() == codigoIngresado) {
            System.out.println("Ingrese el nuevo nombre: ");
            String nuevoNombre = sc.nextLine();
            estudiante2.setNombre(nuevoNombre);
            return "El nuevo nombre es" + estudiante2.toString();
        } else if (estudiante3.getCodigo() == codigoIngresado) {
            System.out.println("Ingrese el nuevo nombre: ");
            String nuevoNombre = sc.nextLine();
            estudiante3.setNombre(nuevoNombre);
            return "El nuevo nombre es" + estudiante3.toString();
        } else {
            return "Estudiante no encontrado";
        }
    }
}
