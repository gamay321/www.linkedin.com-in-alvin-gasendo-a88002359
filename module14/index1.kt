import java.util.*
//Note* This code require OneCompiler to run the program

fun main(args:Array<String>){

fun breaker(){
  for(o in 1..5){
    println("..")
  }
}

fun header(){
//create a spacer  
  println("")

}
header()

print("Survey ABC internet app form")
print("\r\n")
for(i in 1..50){
  print("-")
}

print("Enter name")
val name = readLine()
println("")
//print("your name is $name")

print("Enter email")
println("")
val email = readLine()

print("\n plese rate the following aspect from 1 to 5..5 is the highest")
println(" ")
println("\n User interface")
val interface1 = readLine()
print("\n interface = $interface1")

print("Product Selection: ")
val ProductSelectionRating = readLine()
print("\n Product = $ProductSelectionRating")

print("Delivery Rating: ")
val deliveryRating = readLine()
print("\n Delivery = $deliveryRating")

print("Customer Support: ")
val CustomerSupportRating = readLine()
print("\n C = $CustomerSupportRating")



print("\n Any additional comments?(Press Enter to Skip)\n")
val comments =  readLine()

print("\n Thank your for your feedback, $name\n")
print("\n Sumarry of your feedback: \n")
print("\nEmail : $email\n")
print("\n User Interface Rating : $interface1\n")
print("\nProduct Selection Rating: $ProductSelectionRating\n")
print("\nDelivery Rating: $deliveryRating\n")
print("\n Cuatomer Support Rating: $CustomerSupportRating\n")

print("\nAdditional Coments :$comments")












}