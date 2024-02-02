package test.web.bancolombia.data;

import test.web.bancolombia.models.UsuarioModel;
import test.web.bancolombia.models.buildes.UsuarioBuilder;

public class UsuarioData {

    public static UsuarioModel usuarioValido(){
        return UsuarioBuilder.con()
                .elUsuario("779804")
                .yClave("10df2f32286b7120My0zLTQwODk3Nw==30e0c83e6c29f1c3")
                .build();
    }

    private UsuarioData() {
    }

}
