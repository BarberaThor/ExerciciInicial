package exerciciinicial;

/**
 * Tiene que tener un titular y saldo. Además, cuenta con los metodos, ingressa y abona, que incrementen y decrementen el saldo respectivament.
 * NOTA: Debemos tener en cuenta el saldo a la hora de hacer un abono. Si intentamos sacar una cantidad superior al saldo el metodo lanzará una excepción de tipo illegal acces
 * @author jbarb
 */
public class CuentaCorriente {
    
    private String titular;
    private double saldo;        
    
 public CuentaCorriente(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
}
 
 public String getTitular() {
        return titular;
    }
 
 public double getSaldo() {
        return saldo;
    }
 
 public void setSaldo(double saldo) {
     this.saldo = saldo;
}

 
public void ingressar(double quantitat){
    double total;
    
    total = getSaldo();
    total = total + quantitat;
    setSaldo(total);

}
 
public void retirar (double quantitat) throws Exception{
    double total = 0;
    double temp;
    
    temp = getSaldo();
 
    if(temp < quantitat){
        throw new Exception("Saldo insuficient");

    } else{
        total = temp;
        setSaldo(total);
    }  
}
}
    
