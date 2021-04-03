/**
 * Manejo de Matrices y Grafos Simples (Interfaces Gráficas en Java - Plugin Netbeans)
 * 
 * GraphSoft - Proyecto con fines educativos y académicos
 * 
 * By: Volkmar Carrillo, Carlos Avila, Michell Prieto
 * Estructuras Computacionales Discretas
 * Facultad de Ingenierías y Arquitectura
 * Universidad de Pamplona - Colombia
 * Cuarto Semestre de Ingeniería de Sistemas
 * 2020
 */
package Logica;

import java.util.Scanner;
import javax.swing.JTextField;
/**
//Libreria Auxiliar oara los casos de prueba de la clase
import java.util.Scanner;
**/
public class definicion_grafo {
    //Atributos
    private int[][] x;
    private int n;
    //Constructor
    public definicion_grafo(int n) {
        this.n = n;
        x = new int[this.n][this.n];
    }
    //Métodos
    public int [][] getDatos(){
        return(x);
    }
   
    private void reestablecer() {
        x = new int[n][n];
    }

    public boolean cargarMatriz3(JTextField[][] matriz) {
        int arista;
        boolean p, q, r, valida;

        valida = true;

        for (int i = 0; i < x.length; i++) {
            for (int j = i; j < x.length; j++) {  //j = i+1 NO incluye la diagonal
                arista = Integer.parseInt(matriz[i][j].getText());
                p = i == j;
                q = arista == 0;
                r = arista == 2;
                if (p) {
                    if (q || r) {
                        x[i][j] = arista;
                        x[j][i] = arista;

                    } else {
                        //System.out.println("DATO NO VÁLIDO: Sin lazo digite 0, Con lazo digite 2");
                        //j--;
                        valida = false;
                        reestablecer();
                        break;
                    }
                } else {
                    x[i][j] = arista;
                    x[j][i] = arista;
                }
            }
            if (valida == false) {
                break;
            }
        }
        //System.out.println("");
        return valida;
    }

    public String mostrarMatriz() {
        char filas = 65;
        char columnas = 65;
        String res = "";
        res += "***  MATRIZ DE ADYACENCIA ***\n";
        res += ("\t");
        for (int k = 65; k < (n + 65); k++) {
            res += (columnas + "\t"); // muestra en las columnas los caracteres desde A = 65
            columnas++;
        }
        res += ("\n");
        for (int i = 0; i < n; i++) {
            res += (filas + "\t");  //  muestra en las filas los caracteres desde A = 65
            for (int j = 0; j < n; j++) {
                res += (x[i][j] + "\t");  // muestra por filas la matriz
            }
            res += ("\n");
            filas++;
        }
        return(res);
    }
      
    public String mostrarVertices(){
        char v=65;
        String res = "";
        for (int k = 65; k<(n+65); k++){
            if (k==65){
                res += "V = { ";
            }
            if (k>=65 && k<(n+64)){
                res += v +", ";
            }
            if (k==(n+64)){
                res += v+" }";
            }
            v++;
       }
        return(res);
    }
    public String mostrarAristas(){
        boolean p;
        String res = "E = { ";
        for (int i = 0; i<n; i++){
            for (int j = i; j<n; j++){ // "int j = i" triangular superior incluye la diagonal
                for (int k=0; k<x[i][j];k++){ // aristas múltiples
                    p = i == j;
                    if (p){
                        res += (char)(65+i)+""+(char)(65+j)+" ";
                        k++; // 1 lazo se incrementa a 2 para no repetirlo
                    }else res += (char)(65+i)+""+(char)(65+j)+" ";
                }
            }
        }
        res += "}";
        return(res);
    }
    
    //Método 1  
    public boolean EsSimple (){
        for(int i=0; i< x.length; i++){
            for(int j=0; j< x.length; j++){
                if(i == j){
                    if(x[i][j] != 0){
                        return(false);
                    }
                }else{
                    if(x[i][j] > 1){
                        return(false);
                    }
                }
            }
        }
        return(true);
    }
    
    //Método 2
    public String mostrarLazos(){
        char letra = 65;
        int cont = 0;
        String res = "Lazos = ";
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if( i == j){
                    if(x[i][j] == 2){
                        res += (char)(letra+i) +""+ (char)(letra+i) + " ";
                        cont++;
                    }
                }
            }
        }
        return("Total de lazos: "+cont+"\n"+res);
    }
    
    //Método 3
    public String mostrarAristasMultiples(){
        int cont = 0;
        char letra = 65;
        String aux = "", res = "Hay aristas múltiples en = ";
        for (int i = 0; i < x.length; i++) {
            for (int j = i +1 ; j < x.length; j++) {
                if(x[i][j] > 1){
                    aux += "En " + (char)(letra+i) +""+ (char)(letra+j) + " con "+ x[i][j] + " Aristas\n";
                    cont++;
                }
            }
        }
        res+= cont + " arista(s)\n" + aux;
        return(res);
    }
    
    //Método 4
    public int[] gradosVertices (){
        int grados[] = new int[n];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {                
                grados[i] += x[i][j];
            }
        }
        return grados;
    }
    
    //Aux Método 5
    private int sumaGrados(int []grados){
        int cont = 0;
        for (int i = 0; i < grados.length; i++) {
            cont += grados[i];
        }
        return(cont);
    }
    
    //Método 5
    public String teorema1 (){
        int []grados = gradosVertices();
        int cont = 0;
        String res;
        for (int i = 0; i < x.length; i++) {
            for (int j = i; j < x.length; j++) {
                if(i == j){
                    if( x[i][j] == 2){
                        cont++;
                    }
                }else{
                    cont += x[i][j];
                }
            }
        }
        int suma = sumaGrados(grados);
        if( suma == (2 * cont)){
            res = " grados = " + suma + " aristas = " + cont + "\nCumple el Teorema 1";
        }else{
            res = "No Cumple el Teorema 1";
        }
        return(res);
    }
    
    public String op1(){
        String res;
        res = mostrarMatriz() + "\n";
        res += mostrarVertices() + "\n";
        res += mostrarAristas() + "\n";
        return(res);
    }
    
    public String op2(){
        String res;
        res = mostrarMatriz() + "\n";
        if (EsSimple()) {
            res += "\n*** Es Grafo Simple ***\n\n";
        } else {
            res += "\n*** Es Multigrafo ***\n\n";
            res += mostrarLazos() + "\n";
            res += mostrarAristasMultiples() + "\n\n";
        }
        return(res);
    }
    
    public String op3(){
        String res;
        res = mostrarMatriz() + "\n";
        char letra = 65;
        int []grados = gradosVertices();
        for (int i = 0; i < grados.length; i++) {
            res += "grd("+ (letra++) +") = "+ grados[i]+"\t";
        }
        return(res);
    }
    public String op4() {
        String res;
        res = mostrarMatriz() + "\n";
        res += teorema1();
        return (res);
    }
    
//
//    
//                //CASOS DE PRUEBA DE LA CLASE
//    static public int menu (){
//        Scanner teclado = new Scanner(System.in);
//        int op;
//        System.out.println("***** MENU *****");
//        System.out.println("[1] Cargar nuevo grafo");
//        System.out.println("[2] Definir el grafo");
//        System.out.println("[3] Calcular el grado de cada vértice");
//        System.out.println("[4] Verificar teorema: SumaGrados = 2x#Aristas");
//        System.out.print("Escoja una de las opciones ... ");
//        op = teclado.nextInt();
//        System.out.println("");
//        return op;
//    }
//    
//    public void cargar(){
//        x[0][0] = 2;
//        x[0][1] = 1;
//        x[0][2] = 0;
//        x[1][0] = 1;
//        x[1][1] = 0;
//        x[1][2] = 1;
//        x[2][0] = 0;
//        x[2][1] = 1;
//        x[2][2] = 0;
//    }
//    
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        definicion_grafo G = new definicion_grafo(3);
//        int opcion, volver;
//        do {
//        opcion = menu();
//        switch (opcion) {
//            case 1:{
//                System.out.println("[1] Nuevo grafo");
//                G.cargar();
//                System.out.println("El grafo se ha cargado automáticamente con valores predefinidos en código...");
//                break;
//            }
//            case 2:{
//                System.out.println("[1] Definir el grafo");
//                System.out.println(G.mostrarMatriz());
//                G.mostrarVertices();
//                G.mostrarAristas();
//                 //con métodos definir si es simple sino mostrar lazos y aristas múltiples
//                if(G.EsSimple()){
//                    System.out.println("*** Es Simple ***");
//                }else{
//                    System.out.println("*** Es Multigrafo ***");
//                    System.out.println(G.mostrarLazos());
//                    System.out.println(G.mostrarAristasMultiples());
//                }
//                break;
//            }
//            case 3:{
//                System.out.println("[2] Calcular el grado de cada vértice");
//                char letra = 65;
//                int []grados = G.gradosVertices();
//                String res = "";
//                for (int i = 0; i < grados.length; i++) {
//                    res += "grd("+ (letra++) +") = "+ grados[i]+"\t";
//                }
//                System.out.println(res);
//                 //mostrar los grados de cada uno de los vértices SumaGrados = 2x#Aristas
//                break;
//            }
//            case 4:{
//                System.out.println("[3] Verificar teorema");
//                System.out.println(G.teorema1());
//                break;
//            }
//            default:
//            System.out.println("ERRROR EN LA OPCION INGRESADA");
//        }
//        System.out.println("[1] volver al menú [0] Terminar");
//        volver = teclado.nextInt();
//        }while (volver==1);
//    }
}
