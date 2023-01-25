public class Main {
    public static void main(String[] args)
    {
        System.out.println("suma de numeros: "+ suma(2,5,6));
        Coche toyota=new Coche(1);
        toyota.add_num_puertas(1);
        System.out.println("numero de puertas: "+toyota.numero_de_puertas);
    }
    public static int suma(int a, int b, int c)
    {
        return a+b+c;
    }
}