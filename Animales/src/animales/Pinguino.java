package animales;

public class Pinguino extends Oviparos {
    
    private int tiposPinguinos;
   
    
    public Pinguino (String nombre, int edad, String especie, String tipoMovimiento,
            String _nombreCientifico, double _tama�o, String _habitat, String _alimento,int _tiposPinguinos){
        super (nombre, edad, especie, tipoMovimiento, _nombreCientifico,_tama�o, _habitat, _alimento);
        tiposPinguinos = _tiposPinguinos;
        
    }
    public int gettiposPinguinos (){
        return tiposPinguinos;
    }
    
    public boolean caminar (){
        if (tiposPinguinos==1){
            print ("Pinguino Pap�a");
        }
        else if (tiposPinguinos==2){
            print ("Ping�ino de barbijo");
        }
        else {
            print ("Ping�ino de adelia");
        }
        return false;
    }
    public void contenido (){
        if (caminar()){
            print("\nNombre:\t"+nombre + "\nNombre Cientifico:\t" + nombreCientifico +
                "\nEdad:\t" + edad + "\nHabitat\t:" + habitat+"\nTipo de especie:\t" +
                    gettiposPinguinos() + "\nAlimentaci�n:\t" + alimento); 
        }
    } 
}