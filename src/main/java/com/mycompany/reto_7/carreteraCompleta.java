package com.mycompany.reto_7;

import java.util.List;

public class carreteraCompleta extends metodosTramos {
    List<tramoGenerico> carretera;

    public double longitudTotal(){
        double sumaDouble=0; 
        for(tramoGenerico e : carretera){
            sumaDouble+=e.longitud();
        }
        return sumaDouble;
    }

    public double areaTotal(){
    double sumaDouble=0; 
        for(tramoGenerico e : carretera){
            sumaDouble+=e.area();
        }
        return sumaDouble;
    }

   public double volumenTotal(){
   double sumaDouble=0; 
        for(tramoGenerico e : carretera){
            sumaDouble+=e.volumen();
        }
        return sumaDouble;
    }

   public double volumenAsfalto(){
   double volumenA=1;
   for(tramoGenerico e: carretera){
       if(e.esAsfaltada()==true){
           volumenA+=e.volumen();
       }
   }
   return volumenA;
}

  public double volumenSinAsfalto(){
  double volumenS=1;
  for(tramoGenerico e: carretera){
       if(e.esAsfaltada()==false){
           volumenS+=e.volumen();
       }
   }
  return volumenS;
}
    public boolean tramosConectados(String coordenada1, String coordenada2){
      if(coordenada1.equalsIgnoreCase(coordenada2)){
          return true;
      }
      return false;
    }

}
