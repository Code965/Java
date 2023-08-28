public class Persona{

    private String nome;
    private String cognome;
    private String sesso;
    private String dataNascita;
    private String email;


    public Persona(String nome,String cognome,String sesso,String dataNascita,String email){

        setNome(nome);
        setCognome(cognome);
        setEmail(email);
        setSesso(sesso);
        setDataNascita(dataNascita);
    }


    //METODI GET E SET

    public void setNome(String nome ){
        this.nome = nome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public void setSesso(String sesso){
        this.sesso = sesso;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setDataNascita(String data){
        this.dataNascita = data;
    }


    public String getNome(){
        return this.nome;
    }

    public String getCognome(){
        return this.cognome;
    }

    public String getSesso(){
        return this.sesso;
    }

    public String getEmail(){ 
        return this.email;
    }   

    public String getDataNascita(){
        return this.dataNascita;
    }




}