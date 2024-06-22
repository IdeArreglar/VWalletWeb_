package pe.edu.upc.vwalletweb.dtos;

public class PromedioPreciosDeMenuXCafeteriaDTO {

    private String sede_cafeteria;
    private float precio_promedio;

    public String getSede_cafeteria() {
        return sede_cafeteria;
    }

    public void setSede_cafeteria(String sede_cafeteria) {
        this.sede_cafeteria = sede_cafeteria;
    }

    public float getPrecio_promedio() {
        return precio_promedio;
    }

    public void setPrecio_promedio(float precio_promedio) {
        this.precio_promedio = precio_promedio;
    }
}
