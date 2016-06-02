
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{
    /**
     * Metodo que devuelve el numero encriptado
     */
    public int encripta(Mecanismo mecanismo, int numero)
    {
        int result = -1;
        if(numero>10){
            result = mecanismo.getNumeroEncriptado(numero);
        }
        return result;
    }

    /**
     * Metodo que desencripta el numero encriptado
     */
    public int desencripta(Mecanismo mecanismo, int numero)
    {
        int result = mecanismo.getNumeroDesencriptado(numero);
        if(result <= 10){
            result = -1;
        }
        return result;
    }
}
