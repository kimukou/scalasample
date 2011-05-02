package app.scala

/*
import scala.reflect.BeanProperty

trait Output {
   @BeanProperty
   var output: String
}

generates:
public interface Output{
    public abstract void setOutput(java.lang.String);
    public abstract java.lang.String getOutput();
    public abstract void output_$eq(java.lang.String);
    public abstract java.lang.String output();
}

which means Groovy code must implement 4 methods instead of just 2 :(
*/

object Greeter {
   //def greet( input: String, o: Output ) {
   def greet( input: String, o: {def setOutput(t:String)} ) {
      o.setOutput("Hello '"+ input +"' from Scala")
   }
}
