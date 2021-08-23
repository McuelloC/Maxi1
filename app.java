import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

/**
 * app
 */
public class app {

    public static void main(String[] args) {

     
        final String usuario_correcto = "administrador";
        final String pass_correcta = "administrador.1234";

     Scanner cliente = new Scanner (System.in);
     System.out.println("Bienvenido a Online Banking, porfavor Ingrese las credenciales solicitadas:  ");
     double aleatorio = (Math.random()*1000000);
     int aleatoriosincoma = (int) aleatorio;
     String token = String.valueOf(aleatoriosincoma);
     while (token.length()<6) {
         token+="0";  }
         System.out.println("Clave Token Generada Automatinamente: "+token);

    System.out.println(" Ingrese Nombre de Usuario: ");
    String usuario_ingresado = cliente.nextLine();
    System.out.println(" Ingrese Contraseña");
    String pass_usuario = cliente.nextLine();
   while (usuario_correcto!=usuario_ingresado && pass_correcta != pass_usuario){
       System.out.println("Error de credenciales.. Desea Intenarlo Nuevamente? (S/N)");
       
   }
    
    
      {
         
     } 
         
     }

         
     }

}
    
}