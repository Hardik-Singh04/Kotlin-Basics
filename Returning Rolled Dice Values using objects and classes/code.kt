fun main() 
{
    val myfirstdice=Dice(6)
    println("Your ${myfirstdice.Sides} sided dice rolled ${myfirstdice.roll()}!")
    
    val myseconddice = Dice(20)
    println("Your ${myseconddice.Sides} sided dice rolled ${myseconddice.roll()}!")
    
    val mythirddice = Dice(40)
    println("Your ${mythirddice.Sides} sided dice rolled ${mythirddice.roll()}!")
    
    val myfourthdice = Dice(60)
    println("Your ${myfourthdice.Sides} sided dice rolled ${myfourthdice.roll()}!")
}

class Dice (val Sides: Int) 
{
    fun roll(): Int 
    {
        val randomnumber = (1..Sides).random()
        return randomnumber
    }
}
