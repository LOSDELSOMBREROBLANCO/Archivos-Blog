package animales;

public class main {
    public static void main(String[] args) {
         
        Oviparos ov1= new Rana ("Rana de cristal",14,"anura","salta",
                 "Centrolenidae",33.2,"bosques de Ámerica Central y Sur","pequeños insectos",1);
        Oviparos ov2= new Rana ("Rana Venenosa",13,"anura","salta","Dendrobatidae",5.5,
                "bosques húmedos o selvas tropicales","insectos,pequeños invertebrados y termitas",2);
        Oviparos ov3= new Rana ("Rana arbórea",15,"anura","salta","Hyla arborea",10,
                "vegetal húmeda, lagos o estanques","lagartos,pequeños mamíferos,gusanos",3);
        Oviparos ov4= new Pajaro ("Loro",50,"aves","vuela","Psittacoidea",
                33,"regiones tropicales o cálidas","verduras y frutas","plumas",1);
        Oviparos ov5= new Pajaro ("Pájaro Carpintero",50,"aves","vuela","Picidae",17,
                "zonas boscosas con formaciones de arboles grandes y medianos.","insectos,gusanos y larvas","plumas",2);
        Oviparos ov6 = new Pajaro ("Pájaro Dodo",12,"aves","no voladora","Raphus cucullatus",1,
                " Habitaba en las islas Mauricio, situadas en el océano Índico","árbol tambalacoque","plumas",3);
        Oviparos ov7 = new Pinguino ("Pinguino Papúa",20,"aves","ave no voladora","Pygoscelis papua",95.2,
                "península antártica más cercanas al norte y al sur","peces, krill, crustáceos y camarones.",1);
        Oviparos ov8 = new Pinguino ("Pingüino de barbijo",15,"aves","ave no voladora","Pygoscelis antarcticus",76,
                "península antártica","peces, krill y pequeños crustáceos",2);
        Oviparos ov9 = new Pinguino ("Pingüino de adelia",18,"aves","no voladoras","Pygoscelis adeliae",70,
                "continente Antártico y en varias de las pequeñas islas costeras circundantes.","camarones,"
                        +"peces plata, calamares, crustáceos y otras pequeños organismos acuáticos.",3);
        Oviparos ov10= new Serpiente ("Cobra real",22,"Serpentes","arrastrarse","Ophiophagus hannah",2.5,
                "zonas tropicales y desérticas del sur de Asia y África.","otras serpientes,lagartos, "
                        + "huevos y pequeños mamíferos.",1);
        Oviparos ov11 = new Serpiente ("Mamba negra",11,"serpentes","arrastrarse","Dendroaspis polylepis",2.5,
                "matorrales, termiteros, madrigueras abandonadas, grietas rocosas y huecos","pequeños mamíferos, "
                        + "pájaros, lagartos y murciélagos.",2);
        Oviparos ov12 = new Serpiente ("Terciopelo",20,"serpentes","arrastrarse","Bothrops asper",1.95,
                "asentamientos, pueblos o ciudades, en bosques tropicales húmedos,en bosques perennes",
                "pequeños lagartos,ratas, zarigüeyas.",3);
        
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
