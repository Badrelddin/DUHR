/*

* La sede, podrá generar informes.
* Estos informes serán: de un sector concreto, de una fila entera,
*  de una columna o de toda la ciudad.
* Los informes mostrarán el total de paquetes de cada tipo
*  que hay por sector y un resumen descriptivo de los mismos.
* */

/*
* [ ] [ ] [ ]
* [ ] [ ] [ ]
* [ ] [ ] [ ]
* */


class Sede {

    var ciudad = Ciudad()

    constructor(){}
    constructor(ciudad: Ciudad){
        this.ciudad = ciudad
    }

    open fun getSector():String{
        return "test"
    }


    open fun getFila():String{
        //amonestar al repartidor correspondiente
        // si el total de paquetes que hay sin repartir excede de 20


        return "test"
    }
    open fun getColumna():String{
        return "test"
    }
    open fun getCiudad(){
        for (i in ciudad.mostrarCiudad()){
            for (j in i.mostrarSector()){
                println(j)
            }
        }
    }



}