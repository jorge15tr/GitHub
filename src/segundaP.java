package Prueba2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class segundaP {

    static double[] Nota1 = new double[5]; //Declaramos las 5 notas con 5 subnotas adentro//
    static double[] Nota2 = new double[5];
    static double[] Nota3 = new double[5];
    static double[] Nota4 = new double[5];
    static double[] Nota5 = new double[5];



    static String[] usurious1 = new String[5]; //declaramos el arreglo usuarios con un maximo de 5//

    static String[] contra = new String[5]; //declaramos el arreglo contraseña con un maximo de 5//

    public static void usuarios(String[] usuarios1, int o, String[] contra, int k) throws IOException { //Metodo para nombres de usuarios, contraseña y notas //
        Scanner sc = new Scanner(System.in);
        int i = 0;

        if (i < o) {
            System.out.println("Introduzca nombre de usuario");
            usuarios1[k] = sc.nextLine();
            System.out.println("Introduzca la contraseña que desea");
            contra[k] = sc.nextLine();
            System.out.println("Introduzca notas: ");
            System.out.println("Nota 1, del estudiante " +(k+1));
            Nota1[k] = sc.nextDouble();
            System.out.println("Nota 2, del estudiante " +(k+1));
            Nota2[k] = sc.nextDouble();
            System.out.println("Nota 3, del estudiante " +(k+1));
            Nota3[k] = sc.nextDouble();
            System.out.println("Nota 4, del estudiante " +(k+1) );
            Nota4[k] = sc.nextDouble();
            System.out.println("Nota 5, del estudiante "+(k+1) );
            Nota5[k] =sc.nextDouble();

        } else {
            System.out.println("Limite de usuarios alcanzado");
        }


    }//fin de usuarios


    public static void contra(String b) throws IOException//Metodo actualizar contraseña
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        String OP;
        String c = "1";
        int oc = 2;


        for (i = 0; i < 5; i++) {
            c = b;
            if (c.equals(contra[i])) {
                System.out.println("Contraseña Correcta");
                System.out.println("Introduzca la contraseña que desea");
                OP = br.readLine();
                contra[i] = OP;
                System.out.println("Contraseña guardada con exito");
                oc = 1;
                break;

            }

        }
        if (oc == 2) {
            System.out.println("Elemento no encontrado");
        }

    } //fin contra//



    public static void paramedic1(String b2) //Metodo calcular promedio
    {

        int i;
        String c = "1";
        int oc2 = 2;
        double promedio1=0, promedio2=0;


        for (i = 0; i < 5; i++) { //un for para recorrer cada espacio del arreglo//
            c = b2;
            if (c.equals(usurious1[i])) { //Si el contenido de C es igual al contenido de usuarios en la posicion i entonces se ejecutara lo de adentro//
                System.out.println("Usuario correcto");
                promedio2 = (Nota1[i] + Nota2[i] + Nota3[i] + Nota4[i] + Nota5[i]);  //sumamos todas las notas
                promedio1 = (promedio2 / 5); // calculamos el promedio
                System.out.println("Total de Notas: " + promedio2);
                System.out.println("Promedio Final:" + promedio1);
                oc2 = 1; // variable de control para anunciar si el usuario no fue encontrado//


            }

        }
        if (oc2 == 2) {
            System.out.println("Elemento no encontrado"); //si el usuario no esta en el arreglo saldra un mensaje de error/
        }

    } //fin de promedio//

    public static void imprimir(){ //metodo para imprimir los usuarios//
        System.out.println("LOS USUARIOS SON:");

        int i;
        for (i = 0; i < 5; i++) {
            System.out.println(usurious1[i]);

        }
    } //fin de imprimir

    static void inicializar(String[] usurious1)// metodo para llenar todos los arreglos con espacio en blank
    {
        for(int i=0;i<5;i++)
            usurious1[i]="";
    } //fin de inicializar//

    public static void main (String[]args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int salir = 0, OP, k = 0; // variables de control//

        String b,b2; //varuables de control//
        int o = 6; //variables de control//

        inicializar(usurious1); //inicializamos el arreglo//
        while (salir != 1) { //while para controlar la salida del menu//
            //Menu de Opciones
            System.out.println("---BIENVENIDO AL MENU PRINCILPAL---");
            System.out.println("1. Agregar Nuevo Usuario");
            System.out.println("2. Cambio de contrase�a");
            System.out.println("3. Notas del usuario");
            System.out.println("4. imprimir usuarios");
            System.out.println("5. Salir");
            System.out.println("Ingrese su opcion");
            OP = Integer.parseInt(reader.readLine());

            switch (OP) {
                case 1: {
                    o = o - 1;
                    usuarios(usurious1, o, contra, k); //llamamos a la funcion usuarios si elige opcion 1//
                    k = k + 1;
                    break;
                }


                case 2: {

                    System.out.println("ingrese contraseña"); //llamamos a la funcion contra si elige opcion 2//
                    b = reader.readLine();
                    contra(b);
                    break;
                }

                case 3: {
                    System.out.println("ingrese usuario"); //llamamos a la funcion paramedic1 si elige opcion 1//
                    b2= reader.readLine();
                    paramedic1(b2);
                    break;
                }
                case 4: {
                    imprimir();  //llamamos a la funcion imprimir si elige opcion 4//
                    break;
                }

                case 5: {
                    salir = 1; //salimos del programa//
                }
                break;
                default: {
                    System.out.println("Opcion no valida..."); //si no elige ninguna de las anteriores sale un mensaje de error//
                }
            }
        }

    }

}