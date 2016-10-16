package Receitas

class AutenticacaoController {

    def autenticar(Usuario usuario) {
        def registro = Usuario.findByNomeAndSenha(usuario.nome, usuario.senha)
        if (registro) {
            session['usuario'] = registro
            redirect(controller:'grupo')
        } else {
            flash.message = 'Acesso negado'
            redirect(uri:'/')
        }
    }
}
