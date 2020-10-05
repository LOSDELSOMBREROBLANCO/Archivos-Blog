package animales;

public class Pajaro extends Oviparos {
    
    private String tipoPiel;
    private int tiposPajaros;
    
    public Pajaro (String nombre, int edad, String especie, String tipoMovimiento,String _nombreCientifico, 
            double _tamaño, String _habitat, String _alimento, String _tipoPiel,int _tiposPajaros){
        super (nombre, edad, especie, tipoMovimiento,_nombreCientifico,_tamaño,_habitat,_alimento);
        tipoPiel= _tipoPiel;
        tiposPajaros= _tiposPajaros;
    }
    public String getTipoPiel (){
        return tipoPiel;
    }
    public boolean volar(){
        if (tiposPajaros==1){
        print("Loro");
        }
        else if (tiposPajaros==2){
           print ("Pájaro Carpintero");
        }
        else {
            print("Pájaro dodo");
        }
        return false;
    }
    public void contenido (){
        if (volar()){
            print("\nNombre:\t" + nombre + "\nNombre Cientifico:\t" + nombreCientifico + 
                "\nHabitat:\t" + habitat + "\nTipo de piel:\t" + getTipoPiel());
        }
    }
    
}

