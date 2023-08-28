import java.util.*;

public class Main{

    public static void main(String[] args){

        Promoter admin = new Promoter("Domenico", "Giannone", "M", "14/10/1997", "domi19@libero.it", 1);
        int scelta;
        String nome,nome2,cognome,sesso,dataNascita,email, codice;
        Scanner Scanner = new Scanner(System.in);
        boolean loop = true;

        while(loop){

            System.out.println("Cosa vuoi fare?" );
            System.out.println("1 - INSERISCI UN CLIENTE, 2 - VALIDA/SPENDI BUONO 3 - STAMPA I CONTATI CHE HANNO USATO IL BUONO 4 - STAMPA TOTALE 5 - STAMPA TUTTO  6- ESCI");
            
            scelta = Scanner.nextInt();

            switch(scelta){
                case 1:
                    System.out.println("inserisci il nome");
                    nome = Scanner.next();
                    System.out.println("inserisci il cognome");
                    cognome = Scanner.next();
                    System.out.println("inserisci il sesso");
                    sesso = Scanner.next();
                    System.out.println("inserisci il data nascita");
                    dataNascita = Scanner.next();
                    System.out.println("inserisci il email");
                    email = Scanner.next();
                    admin.inserisciCliente(nome,cognome,sesso,dataNascita,email);
                break;
                case 2:
                    System.out.println("Buogniorno, sei il cliente?");
                    nome2 = Scanner.next();
                   
                    admin.validaSpendiBuono(nome2);
                break; 

                case 3:
                    admin.stampaUtentiBuono();
                    break;
                case 5:
                    admin.stampaClienti();
                break;

                case 6: 
                    loop = false;
                    break;
            }
    
    }

}
}