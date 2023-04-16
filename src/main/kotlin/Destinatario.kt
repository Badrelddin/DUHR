class Destinatario {
    var nombre = ""
    var direccion = ""
    var tlf = 0

    constructor(nombre:String, direccion: String, tlf:Int){
        this.nombre = nombre
        this.direccion = direccion
        this.tlf = tlf
    }



    override fun toString(): String {
        return "Destinatario(nombre='$nombre', direccion='$direccion', tlf=$tlf)"
    }

}