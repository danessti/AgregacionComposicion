public class Habitacion {

    private int numHabi;
    private double tamanoHabi;

    public Habitacion(int numHabi, double tamanoHabi){
        this.numHabi = numHabi;
        this.tamanoHabi = tamanoHabi;
    }

    public int getNumHabi() {
        return numHabi;
    }

    public double getTamanoHabi() {
        return tamanoHabi;
    }

    public void mostrarInfoHabi() {
        System.out.println("Numero de habitacion " + numHabi +
                ", tamano de habitacion " + tamanoHabi + ".");
    }

}