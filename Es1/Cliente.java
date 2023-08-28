public class Cliente extends Persona{

    private String CodiceSconto;
    private boolean usato;

    public Cliente(String nome,String cognome,String sesso,String dataNascita, String email, String CodiceSconto, boolean usato){
        super(nome,cognome,sesso,dataNascita,email);
        setCodiceSconto(CodiceSconto);
        setUsato(usato);
    }

    public void setCodiceSconto(String CodiceSconto){
        this.CodiceSconto = CodiceSconto;
    }

    public String getCodiceSconto(){
        return this.CodiceSconto;
    }

    public void setUsato(boolean usato){
        this.usato = usato;
    }

    public boolean getUsato(){
        return this.usato;
    }

    public String toString(){
        return " nome: " + getNome() + " cognome: " + getCognome() + " sesso: " + getSesso() + " Data: " + getDataNascita() + " Email: " + getEmail() + " Codice: " + getCodiceSconto() + " usato: " + getUsato();
    }
}