
public class Telefono {

    // introduzco los atributos para la clase teléfono
    private String marca;
    private String modelo;
    private int bateria;

    // consrtuctor:
    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = 100;
    }

    // metodos a añadir:
    // enseñar info
    public void mostrarInformacion() {
        System.out.printf("Marca %s\n", this.marca);
        System.out.printf("Modelo %s\n", this.modelo);
        System.out.printf("Batería %d%%\n", this.bateria);
    }

    // usar --> que pierda batería; solicito los minutos que se va a usar
    public void usar(int minutos) {
        for (int i = 0; i < minutos; i++) {
            this.bateria = bateria - 2;
        } // cierro el for
    }// cierro usar

    //crear el cargar; solicito e % de carga a sumar
    public void cargar(int carga){
        this.bateria = bateria + carga;
        System.out.println("Carga completada");


    }
}
