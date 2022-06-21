package segundaetapaprova.segundaetapaprova;

public class FoodComplaint  extends Complaint{
    
    String nomeVitima,ruaVitima,bairroVitima;

    
    
    void regComplaint(String nomeVitima,String ruaVitima,String bairroVitima){
    this.nomeVitima = nomeVitima;
    this.ruaVitima = ruaVitima;
    this.bairroVitima = bairroVitima;
}
    
    String consultComplaint(String nomeVitima){
        
        if(this.nomeVitima.equals(nomeVitima)){
        return toString();
    }
     return "Inválido";   
    }

}
