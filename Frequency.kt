fun main()
{
    var string="Hello world"
    var size= string.length
    for(i in 0 until size )
    {
        var ch=string[i]
        var c=0
        if(ch!=' ')
        {
         for (j in 0 until size)
         {
            if (ch==string[j])
            {
                c++
            }
                
                 
         }
        
        println("Frequency of $ch is $c")
        }
    }

}