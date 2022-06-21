package segundaetapaprova.segundaetapaprova;
public class AnimalComplaint  extends Complaint{
    String nomeAnimal, 
           qtdeAnimal;
    
    
    void regComplaint(String nomeAnimal,String qtdeAnimal){
    this.nomeAnimal = nomeAnimal;
    this.qtdeAnimal = qtdeAnimal;
    }
    
    String consultComplaint(String nomeAnimal, String qtdeAnimal){
        if(this.nomeAnimal.equals(nomeAnimal) && this.qtdeAnimal.equals(qtdeAnimal)){
        return toString();
    }
        return "Inválido";
}
    
    
        
    }
