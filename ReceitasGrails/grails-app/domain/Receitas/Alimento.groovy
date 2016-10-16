package Receitas

class Alimento {

    String descricao

    static belongsTo = [grupo:Grupo]

    static constraints = {
        descricao nullable: false, blank: false, maxSize: 64, unique: true
        grupo nullable: false
    }

    String toString() {
        this.descricao
    }
}
