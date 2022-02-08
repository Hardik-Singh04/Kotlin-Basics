fun main() 
{
    val myfirstdice=Dice(6)
    val dice1=myfirstdice.roll()
    println("Your ${myfirstdice.Sides} sided dice rolled ${dice1}!")
    
    val myseconddice = Dice(20)
    val dice2=myseconddice.roll()
    println("Your ${myseconddice.Sides} sided dice rolled ${dice2}!")
    
    val mythirddice = Dice(40)
    val dice3 = mythirddice.roll()
    println("Your ${mythirddice.Sides} sided dice rolled ${dice3}!")
    
    val myfourthdice = Dice(60)
    val dice4 = myfourthdice.roll()
    println("Your ${myfourthdice.Sides} sided dice rolled ${dice4}!")
}

class Dice (val Sides: Int) 
{
    fun roll(): Int 
    {
        val randomnumber = (1..Sides).random()
        return randomnumber
    }
}
