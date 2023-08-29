public class piramide {
    public static void main(String[] args) 
    Scanner lector = new Scanner(System.in);
       
        int Lados;
        double  altura, apotema,volumen;
         
    
        System.out.print("ingrese los lados: ");
        Lados = lector.nextInt();
        System.out.print("Altura: ");
        altura = lector.nextDouble();
     
        
        areaBase = Math.pow(lados,2)
        apotema = Lados / (2 * Math.tan((alfa)/2));
        volumen = areaBase * altura;
        altura =(volumen*3)/areaBase; 
     
        System.out.println("area base de la piramide " areaBase +"+ " unidades cuadradas.");
        System.out.println("altura e piramide:" altura + " unidades cuadradas.");
        System.out.println("Volumen: " + volumen + " unidades cubicas.");
        lector.close();
    }
}
}
