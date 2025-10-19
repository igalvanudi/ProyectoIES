public class Alumno
{
    
    private int dni;
    private String nombre;
    private String apellido;
    
    public Alumno(int dni, String nombre, String apellido)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
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
    
    
}