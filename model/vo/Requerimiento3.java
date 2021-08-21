package reto4.model.vo;

public class Requerimiento3 {

    private Integer idLider;
    private String nombre;
    private String primerApellido;    

    public Requerimiento3() {
    }

    public Requerimiento3(Integer idLider, String nombre,String primerApellido, Integer salario) {
      this.idLider = idLider;
      this.nombre = nombre;
      this.primerApellido = primerApellido;
      
    }
    public Integer getIdLider() {
      return idLider;
    }
  
    public void setIdLider(Integer idLider) {
      this.idLider = idLider;
    }
  
    public String getNombre() {
      return nombre;
    }
  
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
  
    public String getPrimerApellido() {
      return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
      this.primerApellido = primerApellido;
    }
  

}