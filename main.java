package Principal;
import java.util.List;

public class main {
    public static void main(String[] args) {
        var rationals = List.of(
                new Rational(1, 4),
                new Rational(1, 8),
                new Rational(3, 4),
                new Rational(7, 8));

        var unMedio = new Rational(1,2);
        var suma = Rational.ZERO;
        //imperativa
        for (Rational r : rationals){
            if (r.isLessThan(unMedio)){
                //System.out.println(r);
            }
        }
        //funcional
        //Obtener todos los números racionales que sean menores a 1/2
        System.out.println("Racionales menores a un medio:");
        rationals.stream().filter(r -> r.isLessThan(unMedio)).forEach(System.out::println);
        //Sumar todos los racionales
        suma = rationals.stream().reduce(Rational::plus).get();
        System.out.println("Suma de racionales: "+suma);
        //Obtener el número racional mayor
        System.out.println("Racional mayor: "+rationals.stream().reduce(Rational::getGreater).get());
        //Sumar todos numeradores y obtener los siguientes datos:
        //número de elementos, la suma de los numeradores, el numerador menor, el mayor y el promedio
        System.out.println("Suma numeradores: "+rationals.stream().mapToInt(r -> r.getNumerator()).sum());
        //numero de elementos
        System.out.println("Numero de elementos: "+rationals.stream().count());
        //numerador menor
        System.out.println("Numerador menor: "+rationals.stream().mapToInt(r -> r.getNumerator()).min().getAsInt());
        //Numerador mayor
        System.out.println("Numerador mayor: "+rationals.stream().mapToInt(r -> r.getNumerator()).max().getAsInt());
        //Promedio
        System.out.println("Promedio: "+rationals.stream().mapToInt(r -> r.getNumerator()).average().getAsDouble());
    }
}
