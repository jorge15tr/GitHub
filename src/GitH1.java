/*                        Integrantes
Jorge Torres  |  Jose Sanchez  |  Daniel Barton  |  Arturo Naranjo
 8-960-2114   |   8-960-1339   |    8-961-138    |    8-947-1487
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class GitH1 {

    // VARIABLES GLOBALES
    static String[][] usuario = new String[5][2];
//                                [5 usuarios] [1 ID + 1 contraseña]
    static float [][]   notas = new float[5][6] ;
//                                [5 usuarios] [5 notas + 1 promedio]
    static float acum, promedio;
    static int n=0,c=0, j=0, sel;
    static String nu;

    // ---------------- METODOS ------------------------
    static void blanco() {
            for(int i=0;i<5;i++)
            usuario[i][0]="";}
// METODO 1 --------------------------------------------------------------------
    static void f1() throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.println(" Restablecer Contraseña  ");

        System.out.println(" Indique contraseña actual para modificar datos ");
        nu = sc.nextLine();
        System.out.println(" Contraseña: "+ nu );
        for(c=0;c<5;c++) {
            for(n=0;n<2;n++) {

                if(usuario[c][n] .equals(' ')) {
                    System.out.println(" No hay usuarios registrados");}
                if(usuario[c][n].equals(nu)) {
                    System.out.println(" Indique contraseña nueva para usuario: "+ usuario[c][n-1]);
                    usuario[c][n] = sc.nextLine();
                    System.out.println(" Contraseña actualizada"); }
                                }
                            }
        f5(); }
// METODO 2 --------------------------------------------------------------------
    static void f2() throws IOException{
        System.out.println(" Indice Academico        ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Introduzca el numero que corresponde a su usuario:");
        for (int i=0; i<5; i++){
            System.out.println("["+(i+1)+"] "+usuario[i][0]);
        }
        System.out.println("Su seleccion: ");
//++++++++++++++++++++++++++++++++++++++++++
        do {
            sel = Integer.parseInt(reader.readLine());
            switch (sel) {
                case 1, 2, 3, 4, 5:
                    System.out.println(" Sus notas son:");
                    for (int j = 0; j < 5; j++) {
                        System.out.println(" Nota #" + (j + 1) + ": " + notas[(sel - 1)][j]);
                    } //impresion de notas

                    promedio = notas[(sel - 1)][5] / 5;
                    System.out.println("El promedio del usuario es de: " + promedio); //impresion de promedio
                    break;
                default:
                    System.out.println("Introdujo un dato erroneo o un numero fuera del rango (1-5)");
                    System.out.println("Vuelva a Seleccionar el Usuario");
                    break;
            }
        }while(sel<1 || sel>5); //repetira hasta que coloque bien el dato
        f5();
    }

// METODO 3 --------------------------------------------------------------------
    static void f3()throws IOException {
        if (c<5) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Agregar Usuario #" + (c + 1) + "\n ID: ");
        usuario[c][0] = reader.readLine();
        System.out.println(" Contraseña:");
        usuario[c][1] = reader.readLine();

        System.out.println("Introduzca sus notas: ");
        for (int i = j; i == j; i++) {
            for (int j = 0; j < 5; j++) {
                notas[i][j] = Float.parseFloat(reader.readLine()); //Usuario introduce sus notas
                if (notas[i][j] > 5.0 || notas[i][j] < 0) {
                    System.out.println("Su numero es mayor a 5 o menor a 0, introduzca uno dentro del rango");
                    j = j - 1;
                } else {
                    acum = notas[i][j] + acum;
                }
            }
            notas[i][5] = acum; //Se introduce el acumulativo en la casilla 6 del vector
            acum = 0; //Se reinicia el acum para usarlo en el proximo ejemplo

            System.out.println("        ID : " + usuario[c][0]);
            System.out.println(" Contraseña: " + usuario[c][1]);
            for (int j = 0; j < 5; j++) {
            System.out.println(" Nota #"+(j+1)+": "+notas[i][j]); }
            // Se aumentan los contadores para los siguientes usuarios y evitar repeticiones
            c = c + 1; //Cont de Usuario
            j = j + 1; //Cont de Notas
            i = i + 1; //Cont de Usuario (en float)
            f5();
        } //funcion que agrega estudiantes
        } //si hay menos de 5 estudiantes seguira agregando
        else System.out.println("Limite de Usuarios alcanzado");
    }
// METODO 4 --------------------------------------------------------------------
    static void f4(){
        System.out.println(" Lista de Estudiantes  ");
        for (int i=0; i<5; i++){
            System.out.println("["+(i+1)+"] "+usuario[i][0]); } // for i
        f5();
    }

// METODO 5 ------------------- PAUSE ------------------------------------------
    static void f5(){
        System.out.println("       - Enter para Seguir - ");
        new java.util.Scanner(System.in).nextLine();}

    // ------------------------ MENU PRINCIPAL -----------------------
    public static void main(String[] args)throws IOException  {
        Scanner sc = new Scanner(System.in);
        int resp;
        blanco(); // blanquea los usuarios
        do {

            System.out.println("   ··** Menu Principal **··  ");
            System.out.println("            PRESS            ");
            System.out.println(" [1] Restablecer Contraseña  ");
            System.out.println(" [2] Indice Academico        ");
            System.out.println(" [3] Agregar Usuario         ");
            System.out.println(" [4] Lista de Estudiantes \n ");
            System.out.println(" [5] SALIR                   ");

            resp = sc.nextInt(); //escanea la respuesta

            switch (resp) {
                case 1: f1();break;
                case 2: f2();break;
                case 3: f3();break;
                case 4: f4();break; }
              } while (resp != 5); // mientras no presiones 5, se repetira el menu principal

    } //main
} //class GitH1