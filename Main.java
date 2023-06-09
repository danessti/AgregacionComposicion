public class Main {

    public static void main(String[] args) {

        Casa caza = new Casa();

        Habitacion habit1 = new Habitacion(2, 5);
        Habitacion habit2 = new Habitacion(1, 2.5);

        caza.agregarHabitacion(habit1);
        caza.agregarHabitacion(habit2);

        caza.mostrarInfoCasa();

        caza.destruCasa();

        caza.mostrarInfoCasa();

    }

}