class Certificados: Paquetes {

    var fechaEntrega = ""
    var DNI = ""

    constructor(fechaEntrega:String, dni:String,destinatario: Destinatario, peso:Int, fragil:Boolean): super(destinatario,peso, fragil) {
        this.fechaEntrega = fechaEntrega
        this.DNI = dni
        var paquetes = Paquetes(destinatario, peso, fragil)
    }

    override fun toString(): String {
        return "Certificados(fechaEntrega='$fechaEntrega', DNI='$DNI')"
    }


}