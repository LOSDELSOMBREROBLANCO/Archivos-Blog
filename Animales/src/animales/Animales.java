package animales;

public class Animales {

    protected String nombre;
    protected int edad;
    public String especie;
    protected String tipoMovimiento;
    
    public Animales (String nombre, int edad, String especie, String tipoMovimiento){
       this.nombre = nombre;
       this.edad = edad;
       this.especie = especie;
       this.tipoMovimiento = tipoMovimiento;   
    }
    public void setEdad(int _edad){
        edad=_edad;
    }
    public int getEdad (){
        return edad;
    }
    public String getEspecie(){
        return especie;
    }
    public String tipoMovimiento(){
        return tipoMovimiento;
    }
    public static void print (String texto){
        System.out.println(texto);
    }
}
