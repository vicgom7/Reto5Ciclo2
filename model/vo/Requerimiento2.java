package reto4.model.vo;

public class Requerimiento2 {


    private Integer id_Proyecto;
    private String constructora;
    private String ciudad;
    private Integer estrato;

    public Requerimiento2() {
    }
    public Requerimiento2(Integer id_Proyecto, String constructora, String ciudad, Integer estrato) {
        this.id_Proyecto = id_Proyecto;
        this.constructora = constructora;
        this.ciudad = ciudad;
        this.estrato = estrato;
    }
    public Integer getId_Proyecto() {
        return id_Proyecto;
    }
    public void setId_Proyecto(Integer id_Proyecto) {
        this.id_Proyecto = id_Proyecto;
    }
    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public Integer getEstrato() {
        return estrato;
    }
    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    


}
