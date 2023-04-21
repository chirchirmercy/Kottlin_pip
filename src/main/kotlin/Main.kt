fun main(){
println(area(20.0,30.0))
    //invoking convert
    println(convert(23.0))
    user("maercy",20,"red")

    println(diceRoll(0..10))

    numbers(10,30,60)
    nums(20.5)
    numbs()
    random(3)
   var car=Car("Tesla","Aaltima","red",14)
    car.carry(10)
    car.carry(20)
    car.identity()
    println(car.parkingFess(12))
    var bus=Bus("nissan","isuazu","white",30)
    println(bus.maxiTriFare(300.5))
    println(bus.parkingFess(12))



}

//Write a program that calculates the area of a rectangle.
// The user should be prompted to enter the length and width of the rectangle.
fun area(length:Double,width:Double):Double{
    var area =length*width
    return area
}

//Write a program that converts temperature from Celsius to Fahrenheit.
//The user should be prompted to enter the temperature in Celsius.
fun convert(teperature:Double):Double{
var fahrenheit=(teperature*1.8)+32
    return fahrenheit
}

//Write a program that prompts the user to enter their name, age, and favorite color,
// and then prints out a message including all of that information.
fun user(name:String,age:Int,colour:String){
    println("my name is $name i am $age years old and my favourite colour is $colour")
}

//Write a program that simulates a dice roll.
//The user should be prompted to enter the number of sides on the dice,
// and then the program should randomly generate a number
//between 1 and the number of sides. The program should then print out the result of the roll.

fun diceRoll(sides:IntRange):Int{
    var random=sides.random()
    return random
}

//Write a program that calculates the average of three numbers.
// The user should be prompted to enter the three numbers.

fun numbers(num1:Int,num2:Int,num3:Int){
    var average=num1+num2+num3
    println(average/3)

}

//Write a program that converts a number from decimal to binary.
// The user should be prompted to enter the decimal number.
fun nums(num:Double){
var num=num
    println(num.toInt())
}

//Write a program that calculates the factorial of a number.
// The user should be prompted to enter the number.

fun numbs(){
    var num =10
    var i =1

    var factorial:Long=1
    while(i<=10) {
        factorial *= i.toLong()
        i++
    }
    println(factorial)
}

//Write a program that generates a random number between 1 and 100
// and prompts the user to guess the number.
// //The program should keep prompting the user until they guess correctly.

fun random(nums:Int){
    for(numbs in 1..100){
      if(numbs===nums)  {
          println("guess the number")
      }else{
          println("keep prompting")
      }
    }
}

//Write a program that calculates the area and circumference of a circle.
// //The user should be prompted to enter the radius of the circle.


fun circumfrence(){

}


//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
 //carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity

open class Car(var make:String,var model:String,var colour: String,var capacity:Int) {
    fun carry(people: Int) {
        if (people <= capacity) {
            println("carrying $people passengers")
        }
        else{
            var x=people-capacity
            println("over capacity by $x people")
        }
    }
    //identity() : Prints out the color, make and model in the following
    //format e.g: “I am a white subaru legacy”
    fun identity(){
        println("I am a $colour $make $model")
    }
    //calculateParkingFees(hours: Int) : Calculates and returns the
    //parking fees by multiplying the hours by 20
    open fun parkingFess(hours:Int):Int{
       var y=hours*20
       return y
    }
}

//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.

class Bus(make:String,model:String, colour: String, capacity:Int):Car(make,model,colour, capacity){
  fun maxiTriFare(fare:Double):Double{
      var calculate=fare*capacity
      return calculate
  }
    //The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus

    override fun parkingFess(hours:Int):Int{
        var h=hours*capacity
        return h

    }


}