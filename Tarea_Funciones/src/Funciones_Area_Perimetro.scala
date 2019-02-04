import scala.io.StdIn._

object Funciones_Area_Perimetro {
//para calcular el area de un circulo su formula es la siguiente
//es pi multiplicado por el radio al cuadrado (A = π r²)  
   def AreaDelCirculo(radio: Double): Double ={ 
   3.1416 * radio*radio 
}
   def PerimetroDelCirculo (diametro: Double) : Double ={
    3.1416 * diametro
}
//para calcular el area de un rectangulo su formula es la siguiente   
//el área del rectángulo es simplemente A = h * b
   def AreaDelRectangulo (base: Double, altura: Double): Double ={
    base*altura
  }
//para calcular el perimetro de un rectangulo su formula es la siguiente
//el perímetro es la suma de estos cuatro lados 
  def PerimetroDelRectangulo (largo: Double, ancho: Double): Double ={
    (largo+largo) + (ancho+ancho)
  }
//para calcular el area de un triangulo su formula es la siguiente
//(base * altura)/2  
 def AreaDelTrinagulo(base: Double, altura: Double): Double = {
    (base*altura)/2
  }
//para calcular el perimetro de un triangulo su formula es la siguiente
//(Lado+Lado+Lado) 
  def PerimetroDelTrinagulo(lado1: Double, lado2: Double, lado3: Double): Double = {
    lado1+lado2+lado3
}
  
  
  def main(args: Array[String]): Unit = {

    val MenuPrincipal = 0
    val SubMenu = 0
/*
 * Menu Principal   
 */
    while(MenuPrincipal != 4){
  
        println("\n Cual Figura Desea Calcular: ")
          println("1) Circulo ")
          println("2) Rectangulo ")
          println("3) Triangulo ")
          println("4) SALIR ")
          val MenuPrincipal = readInt()
/*
 * Sub menu          
 */
     if(MenuPrincipal == 1){
       while(SubMenu != 3){
       println("\n Elige una opcion: ")
      println("1) Calcular área ")
      println("2) Calcular perimetro ")
      println("3) SALIR ")
     val SubMenu = readInt()
      
         
 /*
  * Opciones del menu del circulo  
  */
     // Calcular el area del circulo
      if(SubMenu == 1){
            println("Ingrese el radio del circulo: ")
            println("El área del circulo es: "+ AreaDelCirculo(readDouble()))
} 
   //calcular el perimetro del circulo 
    if(SubMenu == 2){
            println("Ingrese el diametro del circulo: ")
            println("El perimetro del circulo es: "+ PerimetroDelCirculo(readDouble()))
}
}
     
}//fin del menu opcion del circulo
        
//===============================Menu para la opcion del rectangulo========================================================  
    if(MenuPrincipal == 2){
       while(SubMenu != 3){
       println("\n Elige una opcion: ")
      println("1) Calcular área ")
      println("2) Calcular perimetro ")
      println("3) SALIR ")
     val SubMenu = readInt()

     
     // Calcular el area del rectangulo     
     if (SubMenu == 1){
            println("Ingresa la base del rectangulo: ")
            val baseRectangulo = readDouble()
            println("Ingresa la altura del rectangulo: ")
            val alturaRectangulo = readDouble()
println("El área del rectangulo es: "+ AreaDelRectangulo(baseRectangulo, alturaRectangulo))
}
// calcular el perimetro del rectangulo
       if (SubMenu == 2){
            println("Ingresa el largo del rectangulo: ")
            val largoRectangulo = readDouble()
            println("Ingresa el ancho del rectangulo ")
            val anchoRectangulo = readDouble()
println("El perimetro del rectangulo es: "+ PerimetroDelRectangulo(largoRectangulo, anchoRectangulo))
}
       }
       
     }//fin del menu opcion del rectangulo 
//===============================Menu para la opcion del triangulo========================================================  
    if(MenuPrincipal == 3){
       while(SubMenu != 3){
       println("\n Elige una opcion: ")
      println("1) Calcular área ")
      println("2) Calcular perimetro ")
      println("3) SALIR ")
     val SubMenu = readInt()

     
     // Calcular el area del triangulo     
     if (SubMenu == 1){
           println("Ingresa la base del triangulo: ")
            val baseTriangulo = readDouble()
            println("Ingresa la altura del triangulo: ")
            val alturaTriangulo = readDouble()
println("El área del triangulo es: "+ AreaDelTrinagulo(baseTriangulo, alturaTriangulo))
}
// calcular el perimetro del triangulo
       if (SubMenu == 2){
            println("Ingresa el lado 1 del triangulo: ")
            val lado1DelTriangulo = readDouble()
            println("Ingresa el lado 2 del triangulo: ")
            val lado2DelTriangulo = readDouble()
            println("Ingresa el lado 3 del triangulo: ")
            val lado3DelTriangulo = readDouble()
println("El perimetro del triangulo es: "+ PerimetroDelTrinagulo(lado1DelTriangulo, lado2DelTriangulo, lado3DelTriangulo))
}
       }
       
     }//fin del menu opcion del triangulo     
    }
  }
}