import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número del 1 al 5: ");
        int numero = scanner.nextInt();
        
        String diaSemana;
        switch (numero) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            default:
                diaSemana = "Número no válido";
                break;
        }
        
        System.out.println("El día de la semana correspondiente al número " + numero + " es: " + diaSemana);
    }
}
