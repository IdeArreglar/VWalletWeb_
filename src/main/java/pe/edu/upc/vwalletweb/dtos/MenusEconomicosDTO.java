package pe.edu.upc.vwalletweb.dtos;

public class MenusEconomicosDTO {
    private int id;
    private float precio;

    public MenusEconomicosDTO() {
    }

    public MenusEconomicosDTO(int id, float precio) {
        this.id = id;
        this.precio = precio;
    }

    public int getId() {return id; }

    public float getPrecio() {return precio; }

    public void setId(int id) { this.id = id; }

    public void setPrecio(float precio) { this.precio = precio; }
}
