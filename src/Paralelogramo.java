public clas paralelogramo extends cuadrilatero {
    // No hay atributos adicionales 

    // constructor que inicializa los puntos del paralelogramo
    public Paralelogramo(punto pSI, punto pSD, punto pII, punto pID) {
        super (pSI, pSD, pII, pID);
    }
    /// metodos abtsractos
    public abstract double base();
    public abstract double altura();
    // implementacion de los metodos abtractos heradados de cuadrilatero
    override
    public double perimetro() {
        return 2 * (base() + altura());     
}
    override
    public double area() {
        return base() * altura();     
}