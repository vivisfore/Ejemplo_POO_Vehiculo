public class Main {
    public static void main(String[] args) {

        Vehiculo miCarro=new Vehiculo();
        System.out.println(miCarro.getEstado());
        miCarro.acelerar();
        Vehiculo tuCarro=new Vehiculo("ABC123");
        System.out.println(tuCarro.placa);
        System.out.println(tuCarro.getEstado());
        tuCarro.color="Negro";
        System.out.println(tuCarro.color);
        tuCarro.setEstado("En movimiento");
        System.out.println(tuCarro.getEstado());
        System.out.println(tuCarro);
        Vehiculo carro3=new Vehiculo(2022,"Nissan",1.8f,"XYZ098","Gris Plateado","Detenido",0);

     /*   System.out.println("Vehiculo1: "+miCarro.toString());
        System.out.println("Vehiculo2: "+tuCarro.toString());
        System.out.println("Vehiculo3: "+carro3.toString());*/
        carro3.arrancar();
        carro3.arrancar();
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());



    }
}