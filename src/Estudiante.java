public class Estudiante extends Persona {

    private int DNI;
    private float Notafinal;


    public Estudiante(String nombre, String apellido, int edad, int DNI, float notafinal) {
        super(nombre, apellido,edad);
        this.DNI = DNI;
        this.Notafinal = notafinal;
    }

    public void mostrardatos(){
        System.out.println("\nNombre; "+getNombre()+"\npellido: "+getApellido()+"\nEdad: "+getEdad()+"\nDNI:"+DNI+"\nNotafinal:"+Notafinal);
    }
}

