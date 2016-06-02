
/**
 * Write a description of class MecanismoMultiplicaconPrimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoMultiplicacionPrimo extends Mecanismo
{
    /**
     * Constructor for objects of class MecanismoMultiplicaconPrimo
     */
    public MecanismoMultiplicacionPrimo(int numeroPrimo)
    {
        super(numeroPrimo);
    }

    /**
     * metodo de encriptado 1
     * 
     */
    public int getNumeroEncriptado(int numeroEncriptar)
    {        
        return getNumero() * numeroEncriptar;
    }
    
    /**
     * metodo de encriptado 1
     * 
     */
    public int getNumeroDesencriptado(int numeroEncriptar)
    {       
           return numeroEncriptar /getNumero();
        }
        
    }

