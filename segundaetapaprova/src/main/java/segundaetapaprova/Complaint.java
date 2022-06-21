package segundaetapaprova.segundaetapaprova;

public class Complaint {
    private String nomeSolicitante, descricaoQueixa,ruaSolicitante
            ,compSolicitante,bairroSolicitante,cidadeSolicitante
            ,ufSolicitante, emailSolicitante,cepSolicitante,
            telefoneSolicitante, diaIncomodo, mesIncomodo,
           anoIncomodo;

    public Complaint(String nomeSolicitante, String descricaoQueixa, 
            String ruaSolicitante, String compSolicitante, 
            String bairroSolicitante, String cidadeSolicitante, 
            String ufSolicitante, String emailSolicitante, 
            String cepSolicitante, String telefoneSolicitante, 
            String diaIncomodo, String mesIncomodo, String anoIncomodo) {
        this.nomeSolicitante = nomeSolicitante;
        this.descricaoQueixa = descricaoQueixa;
        this.ruaSolicitante = ruaSolicitante;
        this.compSolicitante = compSolicitante;
        this.bairroSolicitante = bairroSolicitante;
        this.cidadeSolicitante = cidadeSolicitante;
        this.ufSolicitante = ufSolicitante;
        this.emailSolicitante = emailSolicitante;
        this.cepSolicitante = cepSolicitante;
        this.telefoneSolicitante = telefoneSolicitante;
        this.diaIncomodo = diaIncomodo;
        this.mesIncomodo = mesIncomodo;
        this.anoIncomodo = anoIncomodo;
        }

    

    void regComplaint(String nomeSolicitante, String descricaoQueixa, 
            String ruaSolicitante, String compSolicitante, String bairroSolicitante, 
            String cidadeSolicitante, String ufSolicitante, String emailSolicitante, 
            String cepSolicitante, String telefoneSolicitante,String diaIncomodo, 
            String mesIncomodo, String anoIncomodo){
        this.nomeSolicitante = nomeSolicitante;
        this.descricaoQueixa = descricaoQueixa;
        this.ruaSolicitante = ruaSolicitante;
        this.compSolicitante = compSolicitante;
        this.bairroSolicitante = bairroSolicitante;
        this.cidadeSolicitante = cidadeSolicitante;
        this.ufSolicitante = ufSolicitante;
        this.emailSolicitante = emailSolicitante;
        this.cepSolicitante = cepSolicitante;
        this.telefoneSolicitante = telefoneSolicitante;
        this.diaIncomodo = diaIncomodo;
        this.mesIncomodo = mesIncomodo;
        this.anoIncomodo = anoIncomodo;
        
    }
    
    String consultComplaint(){
        return toString();
        
    }
    
    
    
    
  
    
    public String getNomeSolicitante() {
        return nomeSolicitante;
    }

    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }

    public String getDescricaoQueixa() {
        return descricaoQueixa;
    }

    public void setDescricaoQueixa(String descricaoQueixa) {
        this.descricaoQueixa = descricaoQueixa;
    }

    public String getRuaSolicitante() {
        return ruaSolicitante;
    }

    public void setRuaSolicitante(String ruaSolicitante) {
        this.ruaSolicitante = ruaSolicitante;
    }

    public String getCompSolicitante() {
        return compSolicitante;
    }

    public void setCompSolicitante(String compSolicitante) {
        this.compSolicitante = compSolicitante;
    }

    public String getBairroSolicitante() {
        return bairroSolicitante;
    }

    public void setBairroSolicitante(String bairroSolicitante) {
        this.bairroSolicitante = bairroSolicitante;
    }

    public String getCidadeSolicitante() {
        return cidadeSolicitante;
    }

    public void setCidadeSolicitante(String cidadeSolicitante) {
        this.cidadeSolicitante = cidadeSolicitante;
    }

    public String getUfSolicitante() {
        return ufSolicitante;
    }

    public void setUfSolicitante(String ufSolicitante) {
        this.ufSolicitante = ufSolicitante;
    }

    public String getEmailSolicitante() {
        return emailSolicitante;
    }

    public void setEmailSolicitante(String emailSolicitante) {
        this.emailSolicitante = emailSolicitante;
    }

    public String getCepSolicitante() {
        return cepSolicitante;
    }

    public void setCepSolicitante(String cepSolicitante) {
        this.cepSolicitante = cepSolicitante;
    }

    public String getTelefoneSolicitante() {
        return telefoneSolicitante;
    }

    public void setTelefoneSolicitante(String telefoneSolicitante) {
        this.telefoneSolicitante = telefoneSolicitante;
    }
    @Override
    public String toString() {
        return "Complaint{" + "nomeSolicitante=" + nomeSolicitante + ", descricaoQueixa=" + descricaoQueixa + ", ruaSolicitante=" + ruaSolicitante + ", compSolicitante=" + compSolicitante + ", bairroSolicitante=" + bairroSolicitante + ", cidadeSolicitante=" + cidadeSolicitante + ", ufSolicitante=" + ufSolicitante + ", emailSolicitante=" + emailSolicitante + ", cepSolicitante=" + cepSolicitante + ", telefoneSolicitante=" + telefoneSolicitante + ", diaIncomodo=" + diaIncomodo + ", mesIncomodo=" + mesIncomodo + ", anoIncomodo=" + anoIncomodo + '}';
    }
}
