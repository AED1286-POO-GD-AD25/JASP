//Cuadrilatero.java
//clase que implementa un cuadrilatero como clase base de la jerarquia de herencia
public abstract class Cuadrilatero {
    //Atributos de la clase
    private Punto pSD;
    private Punto pSI;                       
    private Punto pID;
    private Punto pII;
    //Constructor de la clase
    public Cuadrilatero(Punto pSD, Punto pSI, Punto pID, Punto pII) {
        Set pSD(pSD);
        Set pSI(pSI);
        Set pID(pID);
        Set pII(pII);
    }
    //Metodos de acceso (set/get)
    public void setPSD(Punto pSD) {
        this.pSD = pSD;             
    }
    public void setPSI(Punto pSI) {
        this.pSI = pSI;                 
    }
    public void setPID(Punto pID) {
        this.pID = pID;                 
    }
    public void setPII(Punto pII) {
        this.pII = pII;                 
    }
    public Punto getPSD() {
        return pSD;                 
    }
    public Punto getPSI() {
        return pSI;                
    }                       

    public Punto getPID() {
        return pID;                 
    }
    public Punto getPII() {
        return pII;                 
    }
    // Metodos abstractos para calcular el perimetro y el area
    public abstract double perimetro();
    public abstract area ();