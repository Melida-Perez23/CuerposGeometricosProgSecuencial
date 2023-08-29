import java.util.Scanner;

public class App {
    public static void main(String[] args) 
     Scanner lector = new Scanner(System.in);
      
        double  area,volumen;
        
        System.out.print("ingrese el radio de la esfera: ");
        radio = lector.nextDouble();
        
    
        area = -4*Math.pi*(radio 2);

        volumen = -4*Math.pi*(radio 3) /3
       
        System.out.println("Area : " + area + " unidades cuadradas.");
        System.out.println("volumen : " + volumen+ " unidades cuadradas.");
    
        
        lector.close();
    }
}
}
