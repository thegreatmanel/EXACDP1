package examenfinalparte1;
/**
 * esta clase si recibe un numero el atributo resultado almacenar� el doble, si recibe dos n�meros la suma
 * , y si no recibe n�meros devolver� -1
 * @author juchafernandez
 */
public class Sumas {
    private int resultado;
    public int getResultado(){
    return resultado;}
public Sumas(int numero1, int numero2) {resultado=sumar(numero1,numero2);}
    public Sumas(int num) {
        resultado=sumar(num,num);}
    public Sumas() { resultado=-1;
   }
    /**
     * Devuelve la suma de los n�meros recibidos
     * @param numero1 un n�mero entero
     * @param numero2 un n�mero entero
     * @return 
     */
    public int sumar(int numero1, int numero2) {
      return numero1 + numero2;}}
