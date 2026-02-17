import java.util.*;

public class Main {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Empleado> listaEmpleados = new ArrayList<>();
        int opcion;
        int Empleado = 2;

        do {
            System.out.println("\n===== SISTEMA DE EMPLEADOS =====");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Listar Empleado");
            System.out.println("3. Salarios");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();
        
        
         switch (opcion) {
            
            case 1 -> {
                System.out.print("Ingrese empleado: ");
                String empleado = scanner.nextLine();
                
                System.out.print("Ingrese salario: ");
                Double SalarioBase = scanner.nextDouble();
                
                System.out.print("Ingrese prioridad (MEDIOTIEMPO, TIEMPOCOMPLETO): ");
                String prioridad = scanner.nextLine();
                
                Empleado nueva = new Empleado(
                empleado,SalarioBase, prioridad,);
                
                listaEmpleados.add(nueva);
                Empleado++;
                
                System.out.println("Empleado registrado correctamente.");
            }
            
            case 2 -> {
                if (listaEmpleados.isEmpty()) {
                    System.out.println("No hay empleados registrados.");
                } else {
                    for (Empleado i : listaEmpleados) {
                        System.out.println(i);
                    }
                }
            }
            
            case 3 -> {
                System.out.print("Ingrese palabra clave: ");
                String palabra = scanner.nextLine().toLowerCase();
                
                boolean encontrada = false;
                
                for (Empleado i : listaEmpleados) {
                    if (i.getEmpleado().toLowerCase().contains(palabra)) {
                        System.out.println(i);
                        encontrada = true;
                    }
                }
                
                if (!encontrada) {
                    System.out.println("No se encontro al empleado.");
                }
            }
            
            case 0 -> System.out.println("Saliendo del sistema...");
                
            default -> System.out.println("Opción inválida.");
         } 
            {
             int opcion1 = 0;
             while (opcion1 != 0);

              scanner.close();
            }
         
        }
   }
}
