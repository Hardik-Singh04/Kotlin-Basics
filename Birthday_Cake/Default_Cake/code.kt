fun main()
{
    val name = "Hardik"
    val age = 19
    val layers = 5
    candles(age)
    top(age)
    bottom(age,layers)
    output(name,age)
}
fun candles(age : Int)
{
    print(" ")
    repeat(age)
    {
        print(",")
    }
    println()
     print(" ")
    repeat(age)
    {
        print("|")
    }
   println()
}
fun top(age : Int)
{
    repeat(age+2)
    {
        print("=")
    }
    println()
}
fun bottom(age : Int , layers : Int)
{
    repeat(layers)
    {
        print(" ")
        repeat(age)
        {
            print("@")
        }
        println()
    }
}
fun output(name : String, age : Int)
{
    println()
    println("        Happy Birthday!")
    println("${name}!, Now you are ${age} year's old....")
}
