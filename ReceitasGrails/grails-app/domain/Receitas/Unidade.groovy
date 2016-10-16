package Receitas

class Unidade {

    String nome
    String simbolo

    static constraints = {
        nome nullable: false, blank: false, maxSize: 64, unique: true
        simbolo nullable: false, blank: false, maxSize: 4, unique: true
    }

    String toString() {
        "${this.simbolo}: ${this.nome}"
    }
}
