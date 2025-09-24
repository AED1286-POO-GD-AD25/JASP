//CuentaBancaria.java
//Clase que representa una cuenta bancaria

public class CuentaBancaria {
    //atributos
    private int numeroCuenta;
    private String titularCuenta;
    private double saldo;

    private static double tasaInteresAnual;

    //constructores
    public CuentaBancaria(int numeroCuenta, String titularCuenta, double saldocuenta) {
        setNumeroCuenta(numeroCuenta);
        setTitularCuenta(titularCuenta);
        setSaldo(saldocuenta);
}

    public CuentaBancaria() {
        this(0,"",0.0);
    }


    //metodos get/set
    public void setNumeroCuenta(int numeroCuenta) {
        if (numeroCuenta >= 0) {
            this.numeroCuenta = numeroCuenta;
        } else {
            this.numeroCuenta = 0;
        }
    }

    public void SetTitularCuenta(String titularCuenta) 
    {
        this.titularCuenta = titularCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

    public void setTasaInteresAnual(double tasaInteresAnual) 
    {
        if (tasaInteresAnual >= 0) {
           CuentaBancaria.tasaInteresAnual = tasaInteresAnual;
        else 
           CuentaBancaria.tasaInteresAnual = 0.0;
        }
    
        public int getNumeroCuenta() {
            return numeroCuenta;
        }  

        public String getTitularCuenta()
         {
            return titularCuenta;
        }
        
        public double getSaldoCuenta() 
        {
            return saldoCuenta;
        }

        public static double getTasaInteresAnual() 
        {
            return tasaInteresAnual;
        }

        //Metodos de instancia
        public double getTasaInteresMensual()
        {
            return tasaInteresAnual /12.0;
        }

        public double getTasaInteresMensual()

        {return saldoCuenta * getTasaInteresMensual() / 100.0;   
        }        

        public bolean retirarCuenta(double cantidad)
        {
            if (cantidad > 0 && cantidad <= saldoCuenta)
            {
                saldoCuenta -= cantidad;
                return true;
            }
            else{
                return false;
            }
        
            public boolean depositarCuenta(double cantidad)
            {
                if (cantidad > 0)
                {
                    saldoCuenta += cantidad;
                    return true;
                }
                else
                {
                    return false;
                }
            }
        {
            String resultado = String.format("Cuenta Bancaria %d\nTitular: %s\nSaldo: %.2f\nTasa de Interes Anual: %.2f%%\n",
            numeroCuenta, titularCuenta, saldoCuenta, tasaInteresAnual);
            return resultado;   
        }
