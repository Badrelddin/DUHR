open class Paquetes {

    //Atributos
    var destinatario: Destinatario ?= null;
    var peso = 0
    var fragil = false


    //Contructores
    constructor(destinatario: Destinatario?, peso:Int, fragil:Boolean){
        this.destinatario = destinatario
        this.peso = peso
        this.fragil = fragil
    }

    constructor(nombre:String, direccion: String, tlf:Int, peso:Int, indicador:Boolean){
        this.destinatario = Destinatario(nombre, direccion, tlf)
        this.peso = peso
        this.fragil = indicador
    }


    //Funciones
    override fun toString(): String {
        return "Paquetes(destinatario=$destinatario, peso=$peso, indicador=$fragil)"
    }


}