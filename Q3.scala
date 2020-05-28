object Q3 extends App{
     def sum(num:Int):Int = num match{
     | case x if(x==1) =>1
     | case x => x+sum(x-1)
     | }

     sum(5)
}