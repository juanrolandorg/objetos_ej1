
public class Telefono {

    // introduzco los atributos para la clase teléfono
    private String marca;
    private String modelo;
    private int bateria;

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = 100;
    }

    public void mostrarInformacion() {
        System.out.printf("Marca %s\n", this.marca);
        System.out.printf("Modelo %s\n", this.modelo);
        System.out.printf("Batería %d%%\n", this.bateria);
    }

    
}
