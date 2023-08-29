import java.util.Scanner;

public class cono{
    public static void main(String[] args);
    Scanner lector = new Scanner(System.in);
        
        double altura, areaLateral,areaTotal,volumen;
    
       
        System.out.print("ingrese el radio: ");
        radio = lector.nextDouble();
        System.out.print("Altura: ");
        altura = lector.nextDouble();
        
        
        perimetroBase = cantidadLados * longitudLados;
        areaLateral = Math.pi*radio * generatriz;
        double generatriz = Math.sqrt(Math.pow(radio 2));
        areaBase = Math.pi*Math.pow(radio 2) + (Math.pow(altura 2));
        areaTotal = areaLateral +  areaBase;
        volumen = (1.0/3.0)math.pi * math.pow(radio 2);    

         System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");        
         System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cubicas.");
        System.out.println("area base: " + areaBase + " unidades cubicas.");
        lector.close();
    }
}
    }
}
