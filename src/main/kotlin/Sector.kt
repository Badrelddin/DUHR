import java.util.ArrayList

class Sector {
    var paquetes = ArrayList<Paquetes>()

    constructor(paquetes: ArrayList<Paquetes>){
        this.paquetes = paquetes
    }

    open fun addPaquete(paquete: Paquetes){
        paquetes.add(paquete)
    }

    open fun mostrarSector():ArrayList<Paquetes>{
        return paquetes
    }

}