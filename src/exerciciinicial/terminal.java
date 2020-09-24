package exerciciinicial;

import java.util.Scanner;
/**
 *
 * @author jbarb
 */
public class terminal {
    
    private static CuentaCorriente cuentacorriente;
    
    public static void main(String[] args) {

        String stringTitular;
        int opcio;
        String opcio2;
        int q;
        int fi = 0;
        
        cuentacorriente = new CuentaCorriente("jan", 100);
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Introdueixi el titular del seu compte corrent:");
        
        stringTitular = in.nextLine();
        
        System.out.println("El seu numero de Compte és " + stringTitular);
        
        do{
        System.out.println("Quina acció vol realitzar? Recordi que el seu saldo es de " + cuentacorriente.getSaldo());
        System.out.println("(1)Ingressar");
        System.out.println("(2)Retirar");
        
        opcio = in.nextInt();
        
        if(opcio == 1)
        {
            System.out.println("Introdueixi la quantitat a ingressar:");
            q = in.nextInt();
            
            cuentacorriente.ingressar(q);
            
        } else if(opcio == 2)
        {
            System.out.println("Introdueixi la quantitat a retirar:");
            q = in.nextInt();
            
            cuentacorriente.retirar(q);
            
        } 
        
        System.out.println("El seu saldo és de " + cuentacorriente.getSaldo() + ". Vol realitzar més accions?(Y/N)");
        
            in.nextLine();
            opcio2 = in.nextLine();
        
            if(opcio2.equals('Y'))
            {fi=0;}
            else if(opcio2.equals('N'))
            {fi=1;}
        }while(fi == 0); 
  
    }     
    
}
