package pe.edu.upc.vwalletweb.dtos;

public class CantidaddeMenusporSedeDTO {

    private String sede_cafeteria;
    private int cantidad_menus;

    public String getSede_cafeteria() {
        return sede_cafeteria;
    }

    public void setSede_cafeteria(String sede_cafeteria) {
        this.sede_cafeteria = sede_cafeteria;
    }

    public int getCantidad_menus() {
        return cantidad_menus;
    }

    public void setCantidad_menus(int cantidad_menus) {
        this.cantidad_menus = cantidad_menus;
    }
}
