package examenfinalparte1;
public class Sumas {
    private int resultado;
    public int getResultado(){
    return resultado;}
public Sumas(int numero1, int numero2) {resultado=sumar(numero1,numero2);}
    public Sumas(int num) {
        resultado=sumar(num,num);}
    public Sumas() { resultado=-1;
    }public int sumar(int numero1, int numero2) {
      return numero1 + numero2;}}
