import java.util.ArrayList;
import java.util.Scanner;

public class GestorTareas {
    private ArrayList<Tarea> tareas = new ArrayList<>();
    private int contadorId = 1;

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(contadorId++, descripcion));
        System.out.println("Tarea añadida correctamente.");
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            for (Tarea t : tareas) {
                System.out.println(t);
            }
        }
    }

    public void marcarTareaComoCompletada(int id) {
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                t.marcarComoCompletada();
                System.out.println("Tarea marcada como completada.");
                return;
            }
        }
        System.out.println("Tarea no encontrada.");
    }

    public void eliminarTarea(int id) {
        tareas.removeIf(t -> t.getId() == id);
        System.out.println("Tarea eliminada (si existía).");
    }

    public void actualizarTarea(int id, String nuevaDescripcion) {
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                t.setDescripcion(nuevaDescripcion);
                System.out.println("Tarea actualizada.");
                return;
            }
        }
        System.out.println("Tarea no encontrada.");
    }
}
