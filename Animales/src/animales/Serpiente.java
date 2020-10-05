package animales;


public class Serpiente extends Oviparos {
    
    private int tiposSerpientes;
     
    public Serpiente (String nombre, int edad, String especie, String tipoMovimiento,
            String _nombreCientifico, double _tama�o, String _habitat, String _alimento, int _tiposSerpientes){
            super (nombre, edad, especie, tipoMovimiento, _nombreCientifico,_tama�o, _habitat, _alimento);
            tiposSerpientes = _tiposSerpientes;
    }
    public int gettiposSerpientes(){
        return tiposSerpientes;
    }
    public boolean arrastrarse (){
        if (tiposSerpientes==1){
            print("Cobra real");
        }
        else if (tiposSerpientes==2){
            print ("Mamba negra");
        }
        else {
            print ("Terciopelo");
        }
        return false;
    }
    public void contenido (){
        if (arrastrarse()){
            print ("\nNombre:\t"+nombre+"\nNombre Cient�fico:\t"+nombreCientifico+
                    "\nTama�o:\t"+tama�o+"\nTipoMovimiento:\t"+tipoMovimiento+"\nTipo de especie:\t"+gettiposSerpientes());
        }
        
    }
     
}
