public class Empleado {
    private String nombre;
    private int edad;

    public Empleado() {
    }

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar(){
        System.out.println("nombre: "+nombre+" edad:"+edad);
    }
}
