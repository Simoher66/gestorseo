import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Actualizar tarea");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Descripción de la tarea: ");
                    String desc = sc.nextLine();
                    gestor.agregarTarea(desc);
                    break;
                case 2:
                    gestor.mostrarTareas();
                    break;
                case 3:
                    System.out.print("ID de la tarea a completar: ");
                    int idCompletar = sc.nextInt();
                    gestor.marcarTareaComoCompletada(idCompletar);
                    break;
                case 4:
                    System.out.print("ID de la tarea a eliminar: ");
                    int idEliminar = sc.nextInt();
                    gestor.eliminarTarea(idEliminar);
                    break;
                case 5:
                    System.out.print("ID de la tarea a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nueva descripción: ");
                    String nuevaDesc = sc.nextLine();
                    gestor.actualizarTarea(idActualizar, nuevaDesc);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    }
}
