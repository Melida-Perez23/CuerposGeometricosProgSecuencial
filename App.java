import java.util.Scanner;

public class cilindro {
    public static void main(String[] args) }
    Scanner lector = new Scanner(System.in);
       
        
        double alt, areaLat,areaTot,volumen;
       double areaBase; 
        
     
        System.out.print(" ingrese Altura: ");
        alt = lector.nextDouble();
        System.out.print("ingrese el radio: ");
        radio  = lector.nextDouble();
      
        
        areaLateral = 2* Math.pi* radio* alt;
        areabase = Math.pi* Math.pow(radio 2)
        areaTotal = areaLateral + 2 * areaBase;
        volumen = areaBase * altura;
     
        System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
        System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cubicas.");
        lector.close();
    }
}
    }
}
