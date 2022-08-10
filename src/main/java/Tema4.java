public class Tema4 {


    public static void main(String[] args){
        int numeroIf = 0;

        if(numeroIf == 0){
            System.out.println("El valor es cero");
        } else if (numeroIf < 0) {
            System.out.println("El valor es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El valor es positivo");
        }

        int numeroWhile = 0;

        while(numeroWhile < 3){
            System.out.println(numeroWhile++);
        }

        do{
            System.out.println("Do-While ejecutado");
        }while(false);

        for(int numeroFor=0; numeroFor < 3; numeroFor++){
            System.out.println(numeroFor);
        }
        String estacion = "verano";

        switch (estacion){
            case "verano":
                System.out.println("Caluroso");
                break;
            case "otoño":
                System.out.println("Caida de hojas");
                break;
            case "invierno":
                System.out.println("Frio");
                break;
            case "primavera":
                System.out.println("Todo nace");
                break;
            default:
                System.out.println("El valor no es una estación");

        }



    }

}
