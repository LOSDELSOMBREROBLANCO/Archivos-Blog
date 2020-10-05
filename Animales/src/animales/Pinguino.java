package animales;

public class Pinguino extends Oviparos {
    
    private int tiposPinguinos;
   
    
    public Pinguino (String nombre, int edad, String especie, String tipoMovimiento,
            String _nombreCientifico, double _tamaño, String _habitat, String _alimento,int _tiposPinguinos){
        super (nombre, edad, especie, tipoMovimiento, _nombreCientifico,_tamaño, _habitat, _alimento);
        tiposPinguinos = _tiposPinguinos;
        
    }
    public int gettiposPinguinos (){
        return tiposPinguinos;
    }
    
    public boolean caminar (){
        if (tiposPinguinos==1){
            print ("Pinguino Papúa");
        }
        else if (tiposPinguinos==2){
            print ("Pingüino de barbijo");
        }
        else {
            print ("Pingüino de adelia");
        }
        return false;
    }
    public void contenido (){
        if (caminar()){
            print("\nNombre:\t"+nombre + "\nNombre Cientifico:\t" + nombreCientifico +
                "\nEdad:\t" + edad + "\nHabitat\t:" + habitat+"\nTipo de especie:\t" +
                    gettiposPinguinos() + "\nAlimentación:\t" + alimento); 
        }
    } 
}