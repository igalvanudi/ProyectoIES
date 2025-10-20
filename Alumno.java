import java.util.*;
public class Alumno
{
    
    private int dni;
    private String nombre;
    private String apellido;
    private String materia;
    private int calificacion;
    private Materia mater;
    
    public Alumno(int dni, String nombre, String apellido, String materia, int calificacion)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public int getDni()
    {
        return dni;    
    }
    public String getnombre()
    {
        return nombre;    
    }
    public String getapellido()
    {
        return apellido;    
    }
    public String getmateria()
    {
        return materia;    
    }
    public int getcalificacion()
    {
        return calificacion;    
    }
    
    
    public void setDni(int nuevDni)
    {
        dni = nuevDni;    
    }
    public void setnombre(String nuevNombre)
    {
        nombre = nuevNombre;    
    }
    public void setapellido(String nuevApellido)
    {
        apellido = nuevApellido;    
    }
    public void setmateria(String nuevMateria)
    {
        materia = nuevMateria;    
    }
    public void setcalificacion(int nuevCalificacion)
    {
        calificacion = nuevCalificacion;    
    }
    
    public void registrarAlum (){
        System.out.println ("Se esta trabajando en esta actualizacion.");
    }
    
    public int promnotas (int canttp)
    {
        int nota = 0;
        int tot = 0;
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < canttp ; i++){
            System.out.println("Ingrese una nota");
            nota = sc.nextInt();
            tot = tot + nota; 
            System.out.println(tot);
        }
        tot = tot/canttp;
        return tot;
    }
    
    public void notas()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Desea ver las notas del estudiante? (SI O NO)");
        String vernota = sc.nextLine();
        vernota = vernota.toLowerCase();
        String si = "si"; 
        if (vernota.equals(si)){
            System.out.println("Desea ingresar una nota nueva al estudiante? (SI O NO)");
            String resp = sc.nextLine();
            if (resp.equals(si)){
                mater.mostrarMaterias();
                System.out.println("Ingrese en que materia va a cargar las notas");
                int nuevnota = sc.nextInt();
                System.out.println("Ingrese la cantidad de trabajos que realizo el alumno");
                int canttp = sc.nextInt();
                System.out.println("El promedio del alumno es de: " + promnotas(canttp));
            }else {
                System.out.println("Ingrese la cantidad de trabajos que realizo el alumno");
            }
        }else {
            System.out.println("Desea matricular al alumno a una materia?");
            String matri = sc.nextLine();
            if (matri.equals(si)){
                mater.matricularNuevaMateria();
            }
        }
    }
    
    
    
}