object Q6 extends App{
    def fib(num:Int):Int = num match{
     | case x if(x==0) => 0
     | case x if(x==1) => 1
     | case x => fib(x-1)+fib(x-2)
     | }
    
     def fibSeq(num:Int, n:Int=0):Any={
     | println(fib(n))
     | if(n<num-1) fibSeq(num,n+1)
     | }

     fibSeq(6)
}




     