fun main() 
{
    val myfirstcoin=coin()
    println("First Coin tossed to ${myfirstcoin.toss()}!")
    
    val mysecondcoin= coin()
    println("Second Coin tossed to ${mysecondcoin.toss()}!")
    
    val mythirdcoin = coin()
    println("Third Coin tossed to ${mythirdcoin.toss()}!")
    
    val myfourthcoin = coin()
    println("Fourth Coin tossed to ${myfourthcoin.toss()}!")
}

class coin  
{
    fun toss(): String  
    {
        val head = "Heads"
        val tails = "Tails"
        return listOf(head, tails).random()   
    }
}
