object q4 extends App{
     def isEven(num:Int):Boolean = num match{
     | case x if(x%2==0) => true
     | case x => false
     | }

     def isOdd(num:Int):Boolean = !(isEven(num))
     println(isEven(10),isEven(10))
     println(isEven(1),isEven(1))
}