import scala.io.StdIn._

object CalculoDe_IndiceDeMasaCOrporal {
   def calcularIndiceDeMasaCorporal(peso:Double, altura:Double):Double = {
    peso / Math.pow(altura, 2)
}
   
  def main(args: Array[String]): Unit = {
     println("Ingresa Cuanto Pesas:")
    val peso = readDouble()
     println("Ingresa Cuanto Mides:")
val altura = readDouble()

val indiceDeMasaCorporal = calcularIndiceDeMasaCorporal(peso, altura)

if (indiceDeMasaCorporal > 40){
      println("Tu indice de masa corporal es: "+indiceDeMasaCorporal+" obesidad mórbida (obesidad de grado IV)")
      
    } else if(indiceDeMasaCorporal >=35 && indiceDeMasaCorporal < 40){
       println("Tu indice de masa corporal es: "+indiceDeMasaCorporal+" obesidad premórbida (obesidad de grado III)")
       
    } else if(indiceDeMasaCorporal >=30 && indiceDeMasaCorporal < 35){
       println("Tu indice de masa corporal es: "+indiceDeMasaCorporal+" sobrepeso crónico (obesidad de grado II)")
       
    }  else if(indiceDeMasaCorporal >=25 && indiceDeMasaCorporal < 30){
       println("Tu indice de masa corporal es: "+indiceDeMasaCorporal+" sobrepeso (obesidad de grado I)")
       
    } else if(indiceDeMasaCorporal >=18 && indiceDeMasaCorporal < 25){
       println("Tu indice de masa corporal es: "+indiceDeMasaCorporal+" peso normal (saludable)")
       
    } else if(indiceDeMasaCorporal >=17 && indiceDeMasaCorporal < 18){
      println("Tu indice de masa corporal es: "+indiceDeMasaCorporal+" bajo peso")
      
    } else if(indiceDeMasaCorporal >=16 && indiceDeMasaCorporal < 17){
      println("Tu indice de masa corporal es: "+indiceDeMasaCorporal+" infrapeso")
    } else{
      println("Tu indice de masa corporal es: "+indiceDeMasaCorporal+"  Criterio de ingreso en hospital")
    }
}

  
}