fun main() 
{
   val total=10
   val diceRange=1..6
    repeat(total)
    { 
   val randomnumber=diceRange.random()
   println("NUMBER : ${randomnumber}")
    } 
}
