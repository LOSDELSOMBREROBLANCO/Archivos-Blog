package animales;

public class main {
    public static void main(String[] args) {
         
        Oviparos ov1= new Rana ("Rana de cristal",14,"anura","salta",
                 "Centrolenidae",33.2,"bosques de �merica Central y Sur","peque�os insectos",1);
        Oviparos ov2= new Rana ("Rana Venenosa",13,"anura","salta","Dendrobatidae",5.5,
                "bosques h�medos o selvas tropicales","insectos,peque�os invertebrados y termitas",2);
        Oviparos ov3= new Rana ("Rana arb�rea",15,"anura","salta","Hyla arborea",10,
                "vegetal h�meda, lagos o estanques","lagartos,peque�os mam�feros,gusanos",3);
        Oviparos ov4= new Pajaro ("Loro",50,"aves","vuela","Psittacoidea",
                33,"regiones tropicales o c�lidas","verduras y frutas","plumas",1);
        Oviparos ov5= new Pajaro ("P�jaro Carpintero",50,"aves","vuela","Picidae",17,
                "zonas boscosas con formaciones de arboles grandes y medianos.","insectos,gusanos y larvas","plumas",2);
        Oviparos ov6 = new Pajaro ("P�jaro Dodo",12,"aves","no voladora","Raphus cucullatus",1,
                " Habitaba en las islas Mauricio, situadas en el oc�ano �ndico","�rbol tambalacoque","plumas",3);
        Oviparos ov7 = new Pinguino ("Pinguino Pap�a",20,"aves","ave no voladora","Pygoscelis papua",95.2,
                "pen�nsula ant�rtica m�s cercanas al norte y al sur","peces, krill, crust�ceos y camarones.",1);
        Oviparos ov8 = new Pinguino ("Ping�ino de barbijo",15,"aves","ave no voladora","Pygoscelis antarcticus",76,
                "pen�nsula ant�rtica","peces, krill y peque�os crust�ceos",2);
        Oviparos ov9 = new Pinguino ("Ping�ino de adelia",18,"aves","no voladoras","Pygoscelis adeliae",70,
                "continente Ant�rtico y en varias de las peque�as islas costeras circundantes.","camarones,"
                        +"peces plata, calamares, crust�ceos y otras peque�os organismos acu�ticos.",3);
        Oviparos ov10= new Serpiente ("Cobra real",22,"Serpentes","arrastrarse","Ophiophagus hannah",2.5,
                "zonas tropicales y des�rticas del sur de Asia y �frica.","otras serpientes,lagartos, "
                        + "huevos y peque�os mam�feros.",1);
        Oviparos ov11 = new Serpiente ("Mamba negra",11,"serpentes","arrastrarse","Dendroaspis polylepis",2.5,
                "matorrales, termiteros, madrigueras abandonadas, grietas rocosas y huecos","peque�os mam�feros, "
                        + "p�jaros, lagartos y murci�lagos.",2);
        Oviparos ov12 = new Serpiente ("Terciopelo",20,"serpentes","arrastrarse","Bothrops asper",1.95,
                "asentamientos, pueblos o ciudades, en bosques tropicales h�medos,en bosques perennes",
                "peque�os lagartos,ratas, zarig�eyas.",3);
        
        ov1.Contenido();
        ov2.Contenido();
        ov3.Contenido();
        ov4.Contenido();
        ov5.Contenido();
        ov6.Contenido();
        ov7.Contenido();
        ov8.Contenido();
        ov9.Contenido();
        ov10.Contenido();
        ov11.Contenido();
        ov12.Contenido(); 
    }
}
