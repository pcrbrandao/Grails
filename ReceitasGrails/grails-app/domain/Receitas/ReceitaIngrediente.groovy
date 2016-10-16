package Receitas

class ReceitaIngrediente {

    static belongsTo = [receita:Receita, ingrediente:Ingrediente]
    int quantidade

    static constraints = {
        receita nullable: false
        ingrediente nullable: false
    }
}
