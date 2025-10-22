//Punto.java
//implementacion de un punto en un espacio bidimensional
public class Punto {
    //Atributos del la clase
    private int x;
    private int y;
    //Constructor de la clase
    public Punto(int x, int y) 
}
    // Metodos de acceso (set/get)
    public void setX(int x) {
        this.x = x;
}
public void setY(int y) {
        this.y = y;
}
public int getX() {
        return x;
}   
public int getY() {
        return y;
}   
//metodo para calcular la distancia entre dos puntos
public double distancia(Punto otro) {
    // se utiliza el teorema de pitagoras
    int dx = this.x - otro.x;
    int dy = this.y - otro.y;
    return Math.sqrt(deltax * deltax + deltay * deltay);
}
//metodo para representar el punto como una cadena de texto
@Override
public String toString() {
    return "(" + x + ", " + y + ")";
}
