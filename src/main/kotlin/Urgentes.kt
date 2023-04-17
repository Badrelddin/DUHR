class Urgentes: Paquetes {

    var diasRetraso = 0


    constructor(diasRetraso:Int, destinatario: Destinatario, peso:Int, fragil:Boolean): super(destinatario,peso, fragil) {
        this.diasRetraso = diasRetraso
        //var paquetes = Paquetes(destinatario, peso, fragil)
    }

    override fun toString(): String {
        return "Urgentes(diasRetraso=$diasRetraso)"
    }


}