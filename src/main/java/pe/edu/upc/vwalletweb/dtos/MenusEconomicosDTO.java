package pe.edu.upc.vwalletweb.dtos;

public class MenusEconomicosDTO {
    private int idMenu;
    private String platoPrincipal;
    private float precioMenu;

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }
    public String getPlatoPrincipal() {return platoPrincipal;}
    public void setPlatoPrincipal(String platoPrincipal) {this.platoPrincipal = platoPrincipal;}

    public float getPrecioMenu() {
        return precioMenu;
    }

    public void setPrecioMenu(float precioMenu) {
        this.precioMenu = precioMenu;
    }
}
