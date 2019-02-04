
import scala.io.StdIn._
object TiendaDePantalones_Dickies {
  
  def totalDePago(numeroDePantalones: Int): Double = {
    val precioNormal = 356.82
    
    if(numeroDePantalones < 5){
      precioNormal * numeroDePantalones
      
    } else if (numeroDePantalones >= 5 && numeroDePantalones < 12){
       (precioNormal * 0.85)* numeroDePantalones
       
    } else {
      (precioNormal * 0.70)* numeroDePantalones
    }
}
  def main(args: Array[String]): Unit = {
     println("Cuantos pantalones desean comprar:")
    val numPantalones = readInt()
    
println("Total de pago: "+totalDePago(numPantalones))
  }
}