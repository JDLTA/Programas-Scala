import scala.io.StdIn._

object Promedio_Calificaciones {
  
  def ObtenerPromedio(calificaciones: Array[Double]): Double = {
    var sumarCalificaciones = 0.0
    for(i <- calificaciones){
      sumarCalificaciones += i
    }
    return sumarCalificaciones/calificaciones.length
  }
  
  def main(args: Array[String]): Unit = {
  val calificaciones = new Array[Double](5)
    
    for(i <- 0 until calificaciones.length){
      println("Ingresa la calificacion "+i+":")
      calificaciones(i) = readDouble()
    }
    
   if (ObtenerPromedio(calificaciones) >= 90){
       println("Promedio: "+ObtenerPromedio(calificaciones) + " Exelente")
    } else if (ObtenerPromedio(calificaciones) >= 80 && ObtenerPromedio(calificaciones) < 90){
      println("Promedio: "+ObtenerPromedio(calificaciones) +  " Bien")
    }else if (ObtenerPromedio(calificaciones) >= 70 && ObtenerPromedio(calificaciones) < 80){
      println("Promedio: "+ObtenerPromedio(calificaciones) +  " Regular")
    }else{
       println("Promedio: "+ ObtenerPromedio(calificaciones) + " Terrible")
    }

  }

}