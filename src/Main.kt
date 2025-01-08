// import java.util.Scanner

fun main() {
    // Write your solution here

    // Stage 1 printing all the monthly earnings

    // items declaration and initialization with earning

    // val scanner = Scanner(System.`in`)
    val bubblegum = 2002
    val toffee = 118
    val iceCream = 2250
    val milkChocolate = 1680
    val doughnut = 1075
    val pancake = 80
    print("Enter the staff expenses: ")
    val staffExpenses = readLine()!!.toInt()
    // val staffExpenses = scanner.nextInt()
    print("Enter the other expenses: ")
    val otherExpenses = readLine()!!.toInt()
    // val otherExpenses = scanner.nextInt()

    // calculating the total monthly earning
    val income = (bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake)
    val expenses = staffExpenses + otherExpenses
    val netIncome = income - expenses

    // printing the outputs
    println("Earned amount:")
    println("Bubblegum: $$bubblegum")
    println("Toffee: $$toffee")
    println("Ice cream: $$iceCream")
    println("Milk chocolate: $$milkChocolate")
    println("Doughnut: $$doughnut")
    println("Pancake: $$pancake")
    println("Staff expenses: $$staffExpenses")
    println("Other expenses: $$otherExpenses")
    println()
    println("Income: $$income")
    println()
    println("Net income: $$netIncome")

}