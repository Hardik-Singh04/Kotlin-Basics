fun main() 
{
  val myfirstdice=dice()
  val myseconddice=dice()
  val mythirddice=dice()
  
  val dice1=myfirstdice.roll()
  val dice2=myseconddice.roll()
  val dice3=mythirddice.roll()
  
  println("Your ${myfirstdice.sides} sided dice rolled ${dice1}!")
  println("Your ${myfirstdice.sides} sided dice rolled ${dice2}!")
  println("Your ${myfirstdice.sides} sided dice rolled ${dice3}!")
}

class dice
{
    var sides=6
    fun roll():Int
    {
        val randomnumber=(1..6).random()
        return randomnumber
    }   
}
