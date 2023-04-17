fun main(args: Array<String>) {

    var destinatario = Destinatario("nombre", "direccion", 612)
    var arrPaquetes = ArrayList<Paquetes>()

    /*
    for (i in 0 until 5) {
        arrPaquetes.add(paquetes(destinatario))
    }*/

    var arrSectores = ArrayList<Sector>()

    for (i in 0 until 3) {
        var sector = Sector(arrPaquetes)
        arrSectores.add(sector)
    }

    var puertollano = Ciudad(arrSectores)

    var sede = Sede(puertollano)

    sede.getCiudad()

    var i = 119
    do {
        if (i % 2 == 0) {
            var sector = Sector(arrPaquetes)
            var paquete: Paquetes? = null

            var y = (0..2).random()

            var x = (0..99).random()
            for (i in 0 until y) {
                when (x) {
                    in 0 until 49 -> {
                        paquete = Paquetes(destinatario, 10, true)
                        sector.addPaquete(paquete)
                    }

                    in 50..74 -> {
                        paquete = Urgentes(1, destinatario, 2, true)
                        sector.addPaquete(paquete)
                    }

                    in 75..99 -> {
                        paquete = Certificados("hoy", "000123", destinatario, 2, true)
                        sector.addPaquete(paquete)

                    }
                }
            }
        }
        i--
    } while (i > 0)

    /**
    var Madrid = Array<ArrayList<Ciudad>>(3) { ArrayList<Ciudad>() }

    for (i in 0 until 3) {
    for (j in 0 until 3) {
    var furgo = Furgoneta("0${i}${j}A", "Citroen", "C5", 2)
    var repartidor = Repartidores("${i}${j}A", "badr${i}${j}", 2, 0, furgo)

    var ciu = Ciudad(furgo, repartidor)
    Madrid[i].add(ciu)
    }
    }

    for (ciudad in Madrid ){
    println(ciudad)
    }*/

}

fun paquetes(destinatario: Destinatario): Paquetes {
    var x = (0..1).random()

    var paquete: Paquetes? = null

    if (x == 1) paquete = Urgentes(1, destinatario, 2, true)
    else paquete = Certificados("hoy", "000123", destinatario, 2, true)

    return paquete
}


