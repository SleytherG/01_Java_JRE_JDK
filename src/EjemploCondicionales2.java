public class EjemploCondicionales2 {
 public static void main(String[] args) {
  int edad = 21;
  int cantidadPersonas = 2;
  boolean esPareja = cantidadPersonas > 1;
  boolean puedeEntrar = edad >= 18 && esPareja;
 
  if ( puedeEntrar ) {
   System.out.println("Usted es mayor de edad");
   System.out.println("Bienvenido");
  } else {
   System.out.println("Usted no esta permitido entrar");
  }
 }
}
