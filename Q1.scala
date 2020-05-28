object Q1 extends App{
     def gcd(a:Int, b:Int):Int = b match{
     | case 0 => a
     | case b if(b>a) => gcd(b,a)
     | case _ => gcd(b,a%b)
     | }

      def Prime(n:Int,m:Int=2):Boolean = m match{
     | case x if(n==x) =>true
     | case x if(gcd(n,m)>1) => false
     | case x => Prime(n,m+1)
     | }
      Prime(5)
      Prime(8)


}