fun main()
{
    var number=153
    var new_number=number
    var d=0
    var s=0
    while(number!=0)
    {
        d=number%10
        s+=(d*d*d)
        number=number/10
    }
    if(s==new_number)
    {
        println("${new_number} is an armstrong number")
    }
    else
    {
        println("${new_number} is not an armstrong number")
    }
}