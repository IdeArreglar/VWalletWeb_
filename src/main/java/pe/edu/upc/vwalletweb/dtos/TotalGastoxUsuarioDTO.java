package pe.edu.upc.vwalletweb.dtos;

public class TotalGastoxUsuarioDTO {
    private String name_usuario;
    private float totalGasto;

    public String getName_usuario() {
        return name_usuario;
    }

    public void setName_usuario(String name_usuario) {
        this.name_usuario = name_usuario;
    }

    public float getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(float totalGasto) {
        this.totalGasto = totalGasto;
    }
}
