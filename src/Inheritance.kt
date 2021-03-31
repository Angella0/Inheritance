 open class Transport(var make:String, var model:String, var color:String, var capacity:Int){
    fun Carry(people:Int){
        var x=people-capacity
        if(people<=capacity){
            println("carrying $people passengers")
        }
        else{

            println("over capacity by $x people")
        }
    }
    fun identity(){
        println("$color $make $model")

    }
    fun calculateParkingFees(hours:Int):Int{

        return hours*20

    }
}
 class Car(make:String,model: String,color: String,capacity: Int):Transport(make,model,color,capacity){}


 class Bus(make: String,model: String,color: String,capacity: Int):Transport(make, model, color, capacity){
      fun calculate(hours: Int):Int{
         return hours*capacity
     }
     fun maxTripFare(fare:Double):Double{
         var max=0
         return max+fare
     }
 }

 fun main(){
     var car =Car("prado","E200","White",5)
     car.Carry(3)
     println(car.calculateParkingFees(2))
     var bsy=Bus("Toyota","premio","Black",45)
     println(bsy.maxTripFare(300.toDouble()*bsy.capacity))
     println(bsy.calculate(4))
     bsy.identity()
 }


