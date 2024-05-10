package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    while (true){

        try {
            val input = readLine()
            if (input != null){
                val (ast, ans, bst) = input.split(" ")
                if (ans=="+"){
                    val a: Double = ast.toDouble()
                    val b: Double = bst.toDouble()
                    val sum = a+b
                    println("=" + sum)
                }
                else if(ans == "-"){
                    val a: Double = ast.toDouble()
                    val b: Double = bst.toDouble()
                    val sum = a-b
                    println("=" + sum)
                }
                else if(ans == "*"){
                    val a: Double = ast.toDouble()
                    val b: Double = bst.toDouble()
                    val sum = a*b
                    println("=" + sum)
                }
                else if(ans == "/"){

                    val a: Double = ast.toDouble()
                    val b: Double = bst.toDouble()
                    if(b.toInt() == 0){
                        println("er")
                    }
                    else{
                        val sum = a/b
                        println("=" + sum)
                    }

                }
                else{
                    println("Er")
                }
            }






        }catch (e: Exception){
            println("Er1")
        }

    }
}