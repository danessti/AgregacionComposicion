public class Universidad {

    private String nombre;

    private int contador;

    private final int CAPACIDAD_ESTUDIANTES = 100;

    private Estudiante estudiantes[];

    public Universidad(String nombre) {
        this.nombre = nombre;
        estudiantes =  new Estudiante[CAPACIDAD_ESTUDIANTES];
        contador = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getContador() {
        return contador;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {

        if (contador < CAPACIDAD_ESTUDIANTES) {
            estudiantes[contador] =  estudiante;
            contador++;
        } else {
            System.out.println("Se excedio el cupo de estudiantes");
        }

    }

}