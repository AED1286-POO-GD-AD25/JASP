//Tiempo.java
//Implementación la clase tiempo
public class Tiempo {
    //Atributos
    private int horas;
    private int minutos;
    private int segundos;
    //Constructor por defecto
    public Tiempo()
    {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }
    //Constructor copia
    public Tiempo (Tiempo t)
    {
        this.horas=t.horas;
        this.minutos=t.minutos;
        this.segundos=t.segundos;
    }
    // Constructores
    public Tiempo(int horas, int minutos, int segundos) 
    {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }
    public Tiempo(int horas, int minutos) 
    {
        this(horas, minutos,0 );
    }
    public Tiempo(int segundos) 
    {
        this(0, 0, segundos);
    }
    //metodo set/get
    public void setHoras(int horas)    {
        if (horas >= 0 && horas < 24)
        {
            this.horas = horas;
        }
        else
        {
           horas = 0;
        }
    }
    public void setMinutos(int minutos)
    {
        if (minutos >= 0 && minutos < 60)
        {
            this.minutos = minutos;
        }
        else
        {
            this.minutos = 0;
           
        }
    }
    public void setSegundos(int segundos)
    {
        if (segundos >= 0 && segundos < 60)
        {
            this.segundos = segundos;
        }
        else
        {
            this.segundos = 0;
           
        }
    }
    public int getHoras()
    {
        return horas;
    }
    public int getMinutos()
    {
        return minutos;
    }
    public int getSegundos()
    {
        return segundos;
    }

    //metodo tostring
    public String toString() {
        String resultado=String.format("%02d:%02d:%02d", horas, minutos, segundos);
        return resultado;
    }       
     }  