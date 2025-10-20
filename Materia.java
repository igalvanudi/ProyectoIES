import java.util.*;
public class Materia
{
    private String tipo;
    private String nombre;
    private int aprob;
    private int regul;
    private ArrayList <String> materias = new ArrayList<String>();
    
    public Materia(int aprob, int regul, String tipo, String nombre)
    {
        this.tipo = tipo;
        this.nombre = nombre;
        this.aprob = aprob;
        this.regul = regul;
    }

    public String matricularNuevaMateria()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la materia");
        String matnombre = sc.nextLine();
        materias.add(matnombre);
        return matnombre;
    }
    
    public void mostrarMaterias(){
        for (int i = 0; i < materias.size(); i++){
            System.out.println(materias.get(i));
        }
        
    }
}