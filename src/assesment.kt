import java.util.*

fun main() {
    introduction("Sarah",22)
    machine(24)
   println( names(arrayOf("Sarah","StellaJerop","Michelle","Daisy")))
    println(multiply(45,6))
    println(divide(36,6))
    println(modulus(34,7))
    var human=Human("Sarah",21,56.98)
    human.eat(20)
    human.speak("I love watching animations")
    human.birthday()
   println( comparison(56,98))
    rockPaper("paper")
    println(Arrays.toString(longNames("Sarah","Mary","Ashley","Catherine","Papyrus")))

}
fun introduction(name:String,age:Int) {
   println("my name is $name and I am $age years old")
}
fun machine(age:Int){
   if (age<6){
       println("serve milk")
   }
    else if (age>6 && age<15){
        println("serve fanta")
   }
    else{
        println("serve cocacola")
   }
}
fun names(namesArray: Array<String>):Int {
    var count = 0
    for (name in namesArray) {
        if (name.length > 4) {
            count++

        }
    }
    return count
}
fun multiply(x:Int,y:Int):Int{
    return x*y
}
fun divide(x:Int,y:Int):Int{
    return x/y
}
fun modulus(x:Int,y:Int):Int{
    return x%y
}

class  Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight=weight+foodWeight
        println(weight)
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
       var age=age++
        println(age)
    }

}
fun comparison(x:Int,y:Int):Int{
if (x>y){
    return x
}
    else{
        return y
    }
}
fun rockPaper(answer1:String){
if (answer1=="paper"){
    println("player 1 wins")
}
    else if (answer1=="rock"){
     println("player 2 wins")
    }
}


fun longNames(name1:String,name2:String,name3:String,name4:String,name5:String):Array<String>{
 var namesArray= arrayOf("$name1","$name2","$name3","$name4","$name5")
    return namesArray
}
