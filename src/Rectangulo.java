//Rectangulo.java
//clase para implementar un rectangulo
public class Rectangulo{
    //Atributos
    private double ancho;
    private double alto;

    //constructor
    public Rectangulo(double ancho, double alto)   {
        setAncho(ancho);
        setAlto(alto);      
}
public Rectangulo()  {
        this(1.0, 1.0);      
}   
//Métodos get/set
public void setAncho(double ancho) {
    if (ancho >= 0.0)
        this.ancho = ancho;
    else
        this.ancho = 1.0;
}
  public void setAlto(double alto) {
    if (alto >= 0.0)
        this.alto = alto;
    else
        this.alto = 1.0;
} 
public double getAncho() {
    return ancho;
}
public double getAlto() {
    return alto;
}
//Métodos de Instancia
public double getArea() {
    return ancho * alto;
}
public double getPerimetro() {
    return  (ancho + alto)*2.0;
}
//Sobrecarga Método toString
public String toString() {
    String resultado = String.format("Rectangulo: Ancho: %f, Alto: %f, Area: %f, Perimetro: %f", 
    ancho, alto, getArea(), getPerimetro());
    return resultado;
}
}