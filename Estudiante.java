public class Estudiante {

    private String nomEstu;

    private int edad;

    private int numEstudiante;

    public Estudiante(String nomEstu, int edad, int numEstudiante) {
        this.nomEstu = nomEstu;
        this.edad = edad;
        this.numEstudiante = numEstudiante;
    }

    public void mostrarInfo() {
        System.out.println("Nombre " + nomEstu + ", edad " + edad + " # estudiante " + numEstudiante);
    }

}