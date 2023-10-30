package eu.blindka.kotlinbasics

fun main(){ // not a general function, but a starting point for our application, play '>' button for main function
    //val myName = "Eyal" // val is permanent and can't be overwritten, it runs much faster, use var when necessary only
    // TODO:  Add new functionality
    var x = 100
    while(x >= 0) {
        if(x%2 == 0)
        {
            if(x==0)
            {
                println("$x.")
                break
            }
            print("$x,")
        }
        x--
    }
    println("While loop is done!")
}