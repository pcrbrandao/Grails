package Receitas

class Ingrediente {

    String nome

    static belongsTo = [unidade:Unidade, alimento:Alimento]

    static constraints = {
        nome nullable: false, blank: false, maxSize: 64, unique: true
        alimento nullable: false
        unidade nullable: false
    }

    String toString() {
        this.nome
    }
}
