package animales;

public class Oviparos extends Animales{
    
    public String nombreCientifico;
    public double tamaño;
    public String habitat;
    public String alimento;
    
    public Oviparos (String nombre, int edad, String especie, String tipoMovimiento,String _nombreCientifico, double _tamaño, String _habitat, String _alimento){
        super (nombre, edad, especie, tipoMovimiento);
        nombreCientifico= _nombreCientifico;
        habitat=_habitat;
        alimento=_alimento;
    }
    public double getTamaño(){
        return tamaño;
    }
    public void setTamaño(double _tamaño){
        tamaño=_tamaño;
    }
    public String getNombreCientifico(){
        return nombreCientifico;
    }
    public void setAlimento (String _alimento){
        alimento = _alimento;
    }
    public void Contenido (){
        print("\nNombre: "+nombre+" "+
                "\nEdad: "+getEdad()+" "+" "
                + "\nNombre Cientifico: "+nombreCientifico+" "
                        +"\nHabitat: "+habitat+" "
                +"\nAlimento: "+alimento);   
    }
    
}
