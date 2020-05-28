object Q5 extends App{
    def isEven(num:Int):Int = num match{
     | case x if(x%2==0) =>x
     | case x => 0
     | }

     def evSum(num:Int, n:Int=1):Int = n match{
     | case x if(x>=num) =>0
     | case x => isEven(x)+evSum(num,x+1)
     | }
     
     evSum(6)

}