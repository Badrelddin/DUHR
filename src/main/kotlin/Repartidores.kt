class Repartidores {

    var id = ""
    var nombre = ""
    var filaAsign = 0
    var amonestaciones = 0

    constructor(id:String, nombre:String, filaAsign: Int, amonestaciones:Int){
        this.id = id
        this.nombre = nombre
        this.filaAsign = filaAsign
        this.amonestaciones = amonestaciones

    }


    open fun amonestar():Int{
        return amonestaciones++
    }
    override fun toString(): String {
        return "Repartidores(id='$id', nombre='$nombre', filaAsign=$filaAsign, amonestaciones=$amonestaciones)"
    }


}