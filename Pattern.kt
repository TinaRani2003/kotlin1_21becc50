fun main()
{
    var n=5
    for(i in 1..n){
        for(j in i..(n-1))
           print("  ")
        for(j in 1..((2*i)-1))
           print("* ")
        for(j in i..(n-1))
           print("  ")
        println()
    }
    for(i in 1..n)
    {
        for(j in 1 until i)
           print("  ")
        for(j in 1 ..(2*n)-((2*i)-1))
             print("* ")
        for(j in 1 until i)
           print("  ")
        println()
    }

}