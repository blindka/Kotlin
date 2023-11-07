package eu.blindka.kotlinbasics

fun main(){ // not a general function, but a starting point for our application, play '>' button for main function
    //val myName = "Eyal" // val is permanent and can't be overwritten, it runs much faster, use var when necessary only
    // TODO:  Add new functionality
    do{
        println("$x")
        x++
    }while (x<=10)
    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("It's comfy.")
        }
    }
    for(num in 1..10){
        println("$num")
    }
}