package learnkotlin.inaction.chapter1.hello

data class User(val id: Int, val name: String)

fun main(args: Array<String>) {
  val name = "iranna"
  println("Hello ${name}, Welcome to kotlin")
  val user = User(10, name)
  println(user)
  val copiedUserMatching = user.copy()
  if (user == copiedUserMatching) {
    println("Same users")
  } else {
    println("different user")
  }
}