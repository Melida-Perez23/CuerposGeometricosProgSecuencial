public class App {
    public static void main(String[] args)
public class App {
    public static void main(String[] args) 
     Scanner lector = new Scanner(System.in);
      
       double rMayor, rMenor, alt, generatriz, aLat, aTot, volumen;

        System.out.println("Ingrese el radio mayor : ");
        radioMayor = scanner.nextDouble();
        System.out.println("Ingrese el radio menor : ");
        radioMenor = scanner.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = scanner.nextDouble();

        generatriz = Math.sin(Math.pow(radioMayor, 2) + Math.pow(altura, 2));
        aLat = Math.PI * (radioMayor + radioMenor) * generatriz;

        double areaDeBase = Math.PI * Math.pow(radioMayor, 2);
        aTot = areaDeBase + areaLateral;
        volumen = (Math.PI * altura * (Math.pow(radioMayor, 2) + radioMayor * radioMenor + Math.pow(radioMenor, 2))) / 3;

        System.out.println("El Área Lateral: " + areaLateral);
        System.out.println("El Área Total : " + areaTotal);
        System.out.println("El Volumen : " + volumen);

}
    
    }
}
