//Tiempo.java
//Clase que implementa la clase tiempo
public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;
    //metodo tostring
    public String toString() {
        String resultado=String.format("%02d:%02d:%02d", horas, minutos, segundos);
        return resultado;
    }       
     }  