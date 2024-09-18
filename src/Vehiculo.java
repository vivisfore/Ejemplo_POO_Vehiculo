public class Vehiculo {

    public int modelo;
    public String marca;
    public float cilindraje;
    public String placa;
    public String color;
    private String estado;
    public int velocidad;

    public Vehiculo(){ //Constructor Vacio
        this.estado="Detenido";
        this.velocidad=0;
    }

    public Vehiculo(String placa){
        this.placa=placa;
        this.estado="Detenido";
        this.velocidad=0;
    }

    public Vehiculo(int modelo, String marca, float cilindraje, String placa, String color, String estado, int velocidad) {
        this.modelo = modelo;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.placa = placa;
        this.color = color;
        this.estado = estado;
        this.velocidad = velocidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void arrancar(){
        if(this.estado.equals("Detenido")){
            System.out.println("Vehiculo en movimiento");
            this.estado="En movimiento";
            this.velocidad=10;
        }else{
            System.out.println("Vehiculo en marcha");
        }
    }

    public int acelerar(){

        if(this.estado.equals("En movimiento")){
            if(this.velocidad<150)
                this.velocidad+=10;
            else
                System.out.println("Sobrepasa la velocidad permitida");
        }else{
            System.out.println("El vehiculo esta Detenido.");
        }
       return this.velocidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo=" + modelo +
                ", marca='" + marca + '\'' +
                ", cilindraje=" + cilindraje +
                ", placa='" + placa + '\'' +
                ", color='" + color + '\'' +
                ", estado='" + estado + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
