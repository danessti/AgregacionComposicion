public class Casa {

    private final int CAPACIDAD_MAXIMA = 100;

    private int cantidadHabitaciones;

    private Habitacion[] habitaciones;

    public Casa() {
        habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        cantidadHabitaciones = 0;
    }

    public void destruCasa() {
        habitaciones = new Habitacion[CAPACIDAD_MAXIMA];
        cantidadHabitaciones = 0;
    }

    public void agregarHabitacion(Habitacion habitacion){

        if(cantidadHabitaciones < CAPACIDAD_MAXIMA){
            habitaciones[cantidadHabitaciones] = habitacion;
            cantidadHabitaciones++;
        } else{
            System.out.println("No es posible agregar más habitaciones. " + CAPACIDAD_MAXIMA +
                    "capacidad excedida.");
        }
    }

    public void mostrarInfoCasa() {

        if(cantidadHabitaciones == 0){
            System.out.println("\nCasa: \n" +
                    "Cantidad de habitaciones: " + cantidadHabitaciones +
                    ", capacidad maxima: " + CAPACIDAD_MAXIMA +
                    ", habitaciones: NO hay habitaciones.");
        }else{
            System.out.println("Casa: \n" + "Cantidad de habitaciones " + cantidadHabitaciones +
                    ", capacidad maxima " + CAPACIDAD_MAXIMA + ", habitaciones ");
            for (int i = 0; i < cantidadHabitaciones; i++) {
                habitaciones[i].mostrarInfoHabi();
            }
        }

    }

}