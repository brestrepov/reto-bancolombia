package test.web.bancolombia.models.buildes;

import test.web.bancolombia.models.UsuarioModel;

public class UsuarioBuilder {

    private final UsuarioModel usuario = new UsuarioModel();

    public static UsuarioBuilder con(){
        return new UsuarioBuilder();
    }

    public UsuarioBuilder elUsuario(String usuario) {
        this.usuario.setUsuario(usuario);
        return this;
    }

    public UsuarioBuilder yClave(String clave) {
        this.usuario.setClave(clave);
        return this;
    }

    public UsuarioModel build(){
        return this.usuario;
    }
}
