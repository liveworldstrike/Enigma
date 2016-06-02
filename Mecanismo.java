
/**
 * Abstract class Mecanismo - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Mecanismo
{
    // numero que nos pasan 
    private int numero;
    /**
     * Constructor for objects of class MecanismoMultiplicaconPrimo
     */
    public Mecanismo(int numero)
    {
        this.numero = numero;
    }

    /**
     * nos devuelve el numero orinal 
     */
    public int getNumero(){
        return numero;
    }
    
    public abstract int getNumeroEncriptado(int numero);
    
    
    public abstract int getNumeroDesencriptado(int numero);
    
}
