class Ciudad {

    var arrSectores = ArrayList<Sector>()
    constructor(){}

    constructor(arrSectores: ArrayList<Sector>){
        this.arrSectores = arrSectores
    }

    fun mostrarCiudad(): ArrayList<Sector>{
        return arrSectores
    }




}