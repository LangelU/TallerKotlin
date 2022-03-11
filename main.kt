import kotlin.math.roundToInt
fun main(args: Array<String>) {
  println("Bienvenido al menú principal")
  println("Opciones disponibles")
  println("1. Generar serie fibonacci")
  println("2. Generar números primos")
  println("3. Calcular sumatoria de un número")
  println("4. Calcular el área de un círculo")
  println("5. Conversor centígrados a Fahrenheit o Kelvin")
  println("Eliga una de las opciones digitando el número correspondiente")
  val option: Int
  option = readLine()?.toInt() as Int

  if(option == 1){
    println("*Generador de serie Fibonacci*")
    println("Indique hasta cuál número generar la serie")
    var N = readLine()?.toInt() as Int
    fibonacci(N)
  }
  else if(option == 2){
    println("*Calculador de sumatoria*")

  }
  else if (option == 3){
    println("*Generador de números primos")

    
  }
  else if(option == 4){
    println("*Calculador de área de un círculo*")
    println("Indique el radio")
    var r = readLine()?.toInt() as Int
    Acirculo(r)
  }
  else if (option == 5){
    println("*Conversor de temperatura*")
    println("Ingrese la temperatura en grados celsius")
    var N = readLine()?.toInt() as Int
    converTemp(N)
  }
  else if(option <= 0 || option > 5){
    println("Indicó un valor erróneo")
  }
}
//Fibonacci serie
fun fibonacci(N: Int){
  var a = 1
  var b = 1
    print("Serie fibonacci hasta el número $N: $a $b ")
    for (i in 3..N){
        val c = a + b
        print("$c ")
        a = b
        b = c
    }
}

fun converTemp(N: Int){
  var Fah = (N * 1.8) + 32
  var Kelv = N + 273.15

  println("La conversión de $N° a Fahrenheit es de $Fah")
  println("La conversión de $N° a Kelvins es de $Kelv")
}

fun Acirculo(r: Int){
  var exponent = 2
  var pi = 3.14159
  val r2 = Math.pow(r.toDouble(), exponent.toDouble())
  var A = ((pi * r2) * 100.0).roundToInt() / 100.0
  println("El área para un círculo de radio $r es de $A")
}

/*
Diseñar una función llamada MainMenú que generará un menú
principal en línea de comando que ofrecerá las siguientes
opciones y cada opción será una función específica, como son:
  a) Generar los N primero números de la serie Fibonacci
  b) Calcular la sumatoria de un número N
  c) Generar los 10 primeros números primos
  d) Calcular el área de un círculo
  e) Convertir centígrados a Fahrenheit y a Kelvins
¨*/

/*
Integrantes:
Nuñez Albin
Urueta Luis
*/