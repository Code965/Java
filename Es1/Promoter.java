import java.security.SecureRandom;
import java.util.*;

public class Promoter extends Persona{

    ArrayList<Cliente> cassa = new ArrayList<Cliente>(); //mi aggiunge clienti alla cassa
    Scanner sc = new Scanner(System.in);

    private int cod_promoter;

    public Promoter(String nome,String cognome,String sesso,String dataNascita, String email, int cod_promoter){
        super(nome,cognome,sesso,dataNascita,email);
        setCodPromoter(cod_promoter);
    }

    public void setCodPromoter(int cod_promoter){
        this.cod_promoter = cod_promoter;
    }

    public int getCodPromoter(){
        return this.cod_promoter;
    }

    //METODI

    public String creaCodiceSconto(){
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = lower.toUpperCase();

        String numeri = "0123456789";
        String stringa = upper + lower + numeri;
        int lunghezzaRandom = 20;

        SecureRandom sr = new SecureRandom();
        StringBuilder sb = new StringBuilder(lunghezzaRandom);

        for (int i=0; i < lunghezzaRandom; i++){
            int randomInt = sr.nextInt(stringa.length());
            char randomChar = stringa.charAt(randomInt);
            sb.append(randomChar);
        }

        String h = sb.toString();
        return h;
    }

    public void inserisciCliente( String nome,String cognome,String sesso,String dataNascita, String email ){
        try{
            System.out.println("Ciao, hai diritto ad un buono sconto del 50%");
            String codice_sconto;
            codice_sconto = creaCodiceSconto();
            System.out.println(codice_sconto);
            Cliente prs1 = new Cliente(nome, cognome, sesso, dataNascita, email, codice_sconto, false);
            prs1.setUsato(true);
            cassa.add(prs1);

        }catch(Exception ext){
            ext.printStackTrace();
        }
    }

    public void stampaClienti(){
        for (Cliente cliente : cassa) {
                System.out.println(cliente.toString());
        }
    }

    public void validaSpendiBuono(String nome){
       
        for (Cliente cliente : cassa) {

             if(cliente.getNome().equals(nome)){

                if(cliente.getUsato() == true){
                    System.out.println("Sto applicando lo sconto");
                    cliente.setUsato(false);
                    cliente.setCodiceSconto(" ");
                    break;
                }
             }else{
                System.out.println("Utente non trovato");
                break;
             }
            
        }
    }

    public void stampaUtentiBuono(){
        for (Cliente cliente : cassa) {

            if(cliente.getUsato() == false){
                System.out.println(cliente.toString());
            }
            
        }
    }

}