import java.util.ArrayList;

/**
 * Write a description of class MecanismoOffset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoOffset extends Mecanismo
{

    /**
     * Constructor for objects of class MecanismoOffset
     */
    public MecanismoOffset(int clave)
    {
        super(clave);
    }

    /**
     * metodo que devuelve el numero encriptado
     */
    public int getNumeroEncriptado(int numero1)
    {
        int numencriptado = -1;
        if (getNumero()>=1 && getNumero() <=9){
            String numero = "";
            ArrayList<Integer> digitos = new ArrayList<>();
            while(numero1>0){
                digitos.add(numero1 % 10);
                numero1/=10;
            }

            for(int cont = digitos.size()-2;cont >= 0;cont--)
            {
                int digito = digitos.get(cont) + getNumero();
                if(digito>=10)
                {
                    digito = digito % 10;
                }
                numero = (numero + digito);
            }
            numero = digitos.get(digitos.size()-1) + numero;
            numencriptado = Integer.parseInt(numero);
      
        }
        else{
            System.out.println("numero no compatible introducca un valor valido");
        }
        return numencriptado;
    }

    /**
     * metodo que devuelve el numero desencriptado
     */
    public int getNumeroDesencriptado(int numero1)
    {
        String numero = "";
        int numdesencriptado = -1;
        ArrayList<Integer> digitos = new ArrayList<>();
        while(numero1>0){
            digitos.add(numero1 % 10);
            numero1/=10;
        }

        for(int cont = digitos.size()-2;cont >= 0;cont--)
        {
            int digito = digitos.get(cont) - getNumero();
            if(digito < 0)
            {
                digito = digito + 10;
            }
            numero = (numero + digito);
        }
        numero = digitos.get(digitos.size()-1) + numero;
        numdesencriptado = Integer.parseInt(numero);

        return numdesencriptado;
    }

}
