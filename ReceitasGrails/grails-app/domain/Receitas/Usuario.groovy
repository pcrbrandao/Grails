package Receitas

class Usuario {

    String nome
    String senha

    static constraints = {
        nome nullable: false, blank: false, maxSize: 64, unique: true
        senha nullable: false, blank: false, maxSize: 8, unique: false
    }

    String toString() {
        this.nome
    }
}
