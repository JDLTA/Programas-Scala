import scala.io.StdIn._
object NumeroDeMes {
  def NumeroDeDias(mes: Int):String = {
    if(mes == 2){
      "El mes "+mes+" tiene: 28 dias"
    }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
      "El mes "+mes+" tiene: 30 dias"
    }else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
      "El mes "+mes+" tiene: 31 dias"
    }else{
      "ingrse un mes de 1 al 12"
    }
}
  def main(args: Array[String]): Unit = {
     println("Ingresa el número de mes para saber cuantos dias tiene:")
     val mes=readInt()
println(NumeroDeDias(mes))
  }
}