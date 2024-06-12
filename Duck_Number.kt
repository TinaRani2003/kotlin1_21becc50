fun main()
{
    var num=1405
    var d=0
    var flag=0
    while(num!=0)
    {
        d=num%10
        if(d==0)
           {
            flag=1
           }
           num=num/10
    }
    if(flag==1)
       println("The number is a duck number")
    else
      println("The number is not a duck number")

}