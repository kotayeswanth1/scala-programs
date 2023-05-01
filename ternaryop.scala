import scala.io.StdIn.readInt;
object ternaryop{
def main(args:Array[String])={
println("please enter the value");

var ip: Int =readInt()
ip match{
case 1 => println("this isi first case")
case 2 => println("this is second case")
case _ => println("this is thrid line")

}
}
}