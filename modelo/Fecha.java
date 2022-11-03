package modelo;

public class Fecha
{
    //----------------
    // Atributos
    //----------------
    private int dia;
    private int mes;
    private int anio;

    //----------------
    // Metodos
    //----------------

    //Metodos de acceso (setter y getter)
    public void setAnio(int anio) 
    {
        this.anio = anio;
    }

    public void setMes(int mes) 
    {
        this.mes = mes;
    }

    public void setDia(int dia) 
    {
        this.dia = dia;
    }

    public int getAnio() 
    {
        return anio;
    }

    public int getMes() 
    {
        return mes;
    }

    public int getDia() 
    {
        return dia;
    }

    //Metodo sobreescrito de la clase Object
    public String toString()
    {
        return dia + "/" + mes + "/" + anio;
    }
}