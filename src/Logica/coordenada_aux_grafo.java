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
public class coordenada_aux_grafo {
    //Atributos
    private int x, y;
    char letter;
    //Constructor
    public coordenada_aux_grafo(int x, int y, char letter){
        this.x = x;
        this.y = y;
        this.letter = letter;
    }
    //Métodos
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public char getLetter(){
        return(letter);
    }
    
}
