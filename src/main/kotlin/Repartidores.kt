class Repartidores {

    var id = ""
    var nombre = ""
    var filaAsign = 0
    var amonestaciones = 0

    constructor(){}
    constructor(id:String, nombre:String, filaAsign: Int, amonestaciones:Int, Furgoneta:Furgoneta){
        this.id = id
        this.nombre = nombre
        this.filaAsign = filaAsign
        this.amonestaciones = amonestaciones
        var furgoneta = Furgoneta
    }


    override fun toString(): String {

        return "Repartidores(id='$id', nombre='$nombre', filaAsign=$filaAsign, amonestaciones=$amonestaciones)"
    }

}