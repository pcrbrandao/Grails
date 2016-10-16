import Receitas.*

class BootStrap {

    def init = { servletContext ->
        Usuario.findOrSaveByNomeAndSenha("Pedro", "1234")
    }
    def destroy = {
    }
}
