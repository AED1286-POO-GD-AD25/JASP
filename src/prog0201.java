//Prog0201.java
public class prog0201
{
    public static void main(String[] args)
{
    //Crear un objeto clase tiempo
    Tiempo t1=new Tiempo();
    //Asignar valores a los atributos
    t1.setHoras(8);
    t1.setMinutos(36);
    t1.setSegundos(20);
    //Mostrar valores de los atributos
    System.out.println("Horas: " + t1.getHoras());
    System.out.println("Minutos: " + t1.getMinutos());
    System.out.println("Segundos: " + t1.getSegundos());
    //Mostrar el tiempo con el metodo toString
    System.out.println(t1.toString());
    Tiempo t2= new Tiempo();
    t2.setHoras(10);
    t2.setMinutos(15);
    t2.setSegundos(30);

    System.out.println(t1);
    System.out.println(t2);
    Tiempo t3= new Tiempo();
    t3.setHoras(0);
    t3.setMinutos(0);
    t3.setSegundos(0);

    Tiempo t4=new Tiempo (8,19,45);
    Tiempo t5=new Tiempo (8,19);
    Tiempo t6=new Tiempo (8);

    System.out.println(t4);
    System.out.println(t5);
    System.out.println(t6);
    Tiempo t7=t6;
    System.out.println(t7);
    
    t7.setMinutos(35);
    System.out.println(t6);
    System.out.println(t7);
    Tiempo t8 = new Tiempo(t7);
    System.out.println(t8);
    t8.setSegundos(50);
    System.out.println(t7);
    System.out.println(t8);
    System.out.println(t6);
}
}

