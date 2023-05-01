import scala.io.StdIn.readLine;
import scala.io.StdIn.readInt;

object Studentmarks1{
def main(args:Array[String])={

var a=args(0);
println("a:"+a);

println("please enter the name");
var name:String=readLine()

println("please enter the marks");
var marks:Int=readInt()

var m = readInt;
println("maths: "+m);


var s = readInt;
println("science: "+s);

var k = readInt;
println("chemistry:"+k);

var total =m+s+k;
println("total:"+total);

var percentage:Float =(total*100f)/300f;
println("percentage:"+percentage);

if(percentage>90.0f){
println("first class")
}
else if(percentage>80.0f){
println("second class")
}
else if(percentage>70.0f){
println("third class")
}
else if(percentage>30.0f){
println("fail")
}
else{
println("pass")
}

}
}


