class Furgoneta {

    var matricula = ""
    var marca = ""
    var modelo = ""
    var paquetes = 0

    constructor( matricula:String, marca:String, modelo:String, paquetes: Int    ){
        this.matricula = matricula
        this.marca = marca
        this.modelo = modelo
        this.paquetes = paquetes
    }

    override fun toString(): String {
        return "Furgoneta(matricula='$matricula', marca='$marca', modelo='$modelo', paquetes=$paquetes)"
    }


}