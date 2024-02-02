package test.web.bancolombia.models;

public class UsuarioModel {

    private String usuario;
    private String clave;

    public UsuarioModel() {
        this.usuario = "";
        this.clave = "";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
