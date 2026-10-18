public class Main {
    public static void main(String args[]){
        Telefono iphone = new Telefono("iphone", "18ProMax");
        Telefono samsung = new Telefono("Samsung","A24");


        //resto del ejercicio:
        iphone.mostrarInformacion();
        System.out.println();
        samsung.mostrarInformacion();
        //uso el primer telefonio durante 15 min
        iphone.usar(15);
        //uso el segundo telefono 30 min
        samsung.usar(30);
        //cargo un 20 % del segundo
        samsung.cargar(20);
        //muestro la información de ambos de nuevo
        iphone.mostrarInformacion();
        System.out.println();
        samsung.mostrarInformacion();
    }
}
