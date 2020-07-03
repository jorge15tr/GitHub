import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class GitH1 {

    // VARIABLES GLOBALES
    static String[][] usuario = new String[5][2];
    static int[] id = new int[5];
    static int n,c=0;
    // ---------------- FUNCIONES ------------------------
    static void f1(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Restablecer Contraseña  ");
        System.out.println(" Indique el usuario para modificar datos ");
        n = sc.nextInt();
        System.out.println(" Usuario: "+ usuario[n] );
    }

    static void f2(){
        System.out.println(" Indice Academico        ");
    }

    static void f3()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Agregar Usuario #"+(c+1)+"\n ID: ");
        usuario[c][0]=reader.readLine();
        System.out.println(" Contraseña:");
        usuario[c][1]=reader.readLine();

        System.out.println(" ID : "+usuario[c][0]);
        System.out.println(" Contraseña: "+usuario[c][1]);
        c=c+1;
        f5();
    }

    static void f4(){
        System.out.println(" Lista de Estudiantes  ");
        for (int i=0; i<5; i++){
            System.out.println("["+(i+1)+"]"+usuario[i][0]); } // for i
        f5();
    }
    static void f5(){
        System.out.println("       - Enter para Seguir - ");
        new java.util.Scanner(System.in).nextLine();}

    public static void main(String[] args)throws IOException  {
// ------------------------ MENU PRINCIPAL -----------------------
        Scanner sc = new Scanner(System.in);
        int resp;
        do {

            System.out.println("   ··** Menu Principal **··  ");
            System.out.println("            PRESS            ");
            System.out.println(" [1] Restablecer Contraseña  ");
            System.out.println(" [2] Indice Academico        ");
            System.out.println(" [3] Agregar Usuario         ");
            System.out.println(" [4] Lista de Estudiantes \n ");
            System.out.println(" [5] SALIR                   ");

            resp = sc.nextInt();

            switch (resp) {
                case 1: f1();break;
                case 2: f2();break;
                case 3: if (c<5) {f3();}
                else System.out.println("Limite de Usuarios alcanzado");
                    break;
                case 4: f4();break; }
        } while (resp != 5);

    } //main
} //class funciones

