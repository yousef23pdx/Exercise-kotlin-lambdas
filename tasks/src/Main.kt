val greetSeaCreatures: ()->String = {"Hello, Deep Sea Adventurer!"}

val findPearl: (Int)->Int = {a -> a*a}

val divideTreasure: (Double,Double)-> Double = {total_treasure , explorers -> total_treasure/explorers}

val calculateDepth: (Int,Int) -> Int = {t1 , t2 -> t2 - t1}

fun String.loud ():String {

    return this.uppercase()+"!"
}

val diveMessage: (String) -> String = {a -> a.loud()}


fun main(){

    println(greetSeaCreatures())
    println(findPearl(6))
    println(divideTreasure(1000.0 , 5.0))
    println(calculateDepth(800,1500))
    println(diveMessage("deep sea"))

}