package animales;

public class Rana extends Oviparos{
    
    private int tiposRanas;
    
    public Rana (String nombre, int edad, String especie, String tipoMovimiento,String _nombreCientifico, 
            double _tama�o, String _habitat, String _alimento, int _tiposRanas){
        super (nombre, edad, especie, tipoMovimiento, _nombreCientifico,_tama�o, _habitat, _alimento);
        tiposRanas = _tiposRanas;
    }
    public int gettiposRanas (){
        return tiposRanas;
    }
    
    public boolean saltar (){
        if (tiposRanas==1){
            print("Rana de cristal");
        }
        else if (tiposRanas==2){
            print("Rana Venenosa");
        }
        else{
            print("Rana �rborea");
        }
        return false;
    }
    public void contenido (){
        if (saltar()){
            print("\nNombre:\t" + nombre+"\nNombre Cientifico:\t" + nombreCientifico+
                "\nHabitat:\t" + habitat+"\nTipo de especie:\t" + gettiposRanas() + "\nAlimentaci�n:\t"+alimento);  
        }
    }
}
