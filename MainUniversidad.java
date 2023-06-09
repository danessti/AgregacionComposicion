public class MainUniversidad {

    public static void main(String[] args) {

        Universidad universidad =  new Universidad("Universidad XYZ");

        Estudiante estudiante1 = new Estudiante("Light", 19, 1);
        Estudiante estudiante2 = new Estudiante("Lia", 20, 2);

        universidad.agregarEstudiante(estudiante1);
        universidad.agregarEstudiante(estudiante2);

        System.out.println("Nombre de la Universidad: " + universidad.getNombre());

        for (int i = 0; i < universidad.getContador(); i++) {
            System.out.println("Estudiante " + (i+1) + ": ");
            universidad.getEstudiantes()[i].mostrarInfo();
        }

    }

}