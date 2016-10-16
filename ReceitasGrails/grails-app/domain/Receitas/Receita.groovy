package Receitas

class Receita {

    String titulo
    String descricao
    int rendimento

    static constraints = {
        titulo nullable: false, blank: false, maxSize: 64, unique: true
        descricao nullable: true, blank: true, maxSize: 124, unique: false
    }

    String toString() {
        this.titulo
    }
}
