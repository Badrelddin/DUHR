class Furgoneta {

    var matricula = ""
    var marca = ""
    var modelo = ""
    var paquetes = 0

    constructor(){}
    constructor(matricula: String, marca: String, modelo: String, paquetes: Int) {
        this.matricula = matricula
        this.marca = marca
        this.modelo = modelo
        this.paquetes = checkPaquetes(paquetes)
    }

    private fun checkPaquetes(nPaquete: Int): Int {
        var N = 4
        if (!(nPaquete < N && nPaquete > 0)) {
            println("Se ha sobrepasado el número de paquetes permitos")
            var nPquetes = readln().toInt()
        }
        return nPaquete
    }

    override fun toString(): String {
        return "Furgoneta(matricula='$matricula', marca='$marca', modelo='$modelo', paquetes=$paquetes)"
    }
}