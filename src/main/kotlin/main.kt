import java.text.DecimalFormat

fun encabezado(): Unit {
    println("------------ Welcome to Growing Cash ® ------------") // Informacion de software
    println("------------ Service development By Smartek industries S.A ® ------------") // Informacion de software
    println("------------ Since on dic. 2020 ------------") // Informacion de software
    println("------------ Author: Matheus ® ------------")
}


fun main() {
    // Area definicion de datos
    var monto: Double // Indica valores monetarios en pesos
    val interes = 37.0 // Presenta la tasa de interes a la que corresponde la operacion
    val plazo = 30 // Indica la cantidad en (dias) correspodniente a la operacion
    var auxDeposito: Double
    var auxIntMasDeposito: Double
    val numList = arrayOf(
        1000,
        2000,
        3000,
        4000,
        5000,
        6000,
        7000,
        150000,
        33000
    ) // valores disponibles en montos dinerarios para calcular la inversion correspondiente

    encabezado()

    val df = DecimalFormat("$ #.##") // formato de exhibicion con 2 decimales
    var x = 0
    while (x < 9) {
        //TODO ver formato de valores
        auxDeposito = numList[x].toDouble()
        monto = numList[x] * ((interes / 100) * plazo / 365)
        auxIntMasDeposito = numList[x] + monto

        println(
            "deposito de ${df.format(auxDeposito)} generan un interes de ... ${df.format(monto)} Deposito mas interes ${
                df.format(
                    auxIntMasDeposito
                )
            }"
        )
        x = x + 1
    }

    pie(plazo, interes)

}

fun pie(plazo: Int, interes: Double): Unit {

    println("todos los intereses se encuentran informados trabajan bajo la tasa de interes y cantidad de dias indicados a continuacion") // Informacion de software
    println("DIAS : $plazo")
    println("TASA DE INTERES = $interes%")
    println("------------ thanks for had use Growing Cash ® ------------") // Informacion de software
    println("------------ for support as please enter in SmartekIndustries.com or contact us Development staff ------------") // Informacion de software

}


















