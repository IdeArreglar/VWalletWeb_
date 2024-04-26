package pe.edu.upc.vwalletweb.dtos;

public class MenusCarosDTO {
    private String menu;
    private float gasto;

    public MenusCarosDTO() {
    }

    public MenusCarosDTO(String menu, float gasto) {
        this.menu = menu;
        this.gasto = gasto;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public float getGasto() {
        return gasto;
    }

    public void setGasto(float gasto) {
        this.gasto = gasto;
    }
}
