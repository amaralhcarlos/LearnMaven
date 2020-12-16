package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Aprendendo a usar o Maven CORRETAMENTE!" );
        
        Product myProduct = new Product("Nintendo Switch", 2999.0);
        
        System.out.println(myProduct);
    }
}
