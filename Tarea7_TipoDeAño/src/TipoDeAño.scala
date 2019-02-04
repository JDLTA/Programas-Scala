import scala.io.StdIn._

object TipoDeAno {
  
   def tipoDeAño(año:Int):Boolean = {    
     
    if(año%4 == 0 ){
      
      true 
      
      } else {
 
        false
        
      }
    
    }
def main(args: Array[String]): Unit = {
    println("Ingresa un año:")
    val año=readInt()
println("El año es bisiesto:" + tipoDeAño(año) )
  }
}