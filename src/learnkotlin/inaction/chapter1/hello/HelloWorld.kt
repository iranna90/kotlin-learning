package learnkotlin.inaction.chapter1.hello

import com.sun.javaws.exceptions.InvalidArgumentException

data class User(val id: Int, val name: String)

fun add(x: Int, y: Int) = x + y

typealias homeDetails = Map<String, String>

fun checking(x: String) = "hello " + x

var change: ((String) -> (String)) = { x -> checking(x) }

fun doOp(x: String, b: (String) -> (String)): (String) -> (Int) {
  val res = b.invoke(x)
  println("First result is $res")
  return { anotherStr -> (anotherStr + res).length }
}

val predicate: ((((String) -> (String)), String) -> Boolean) = { c, s -> (c.invoke(s)).length > 3 }

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

  println("checking reference")
  if (user === copiedUserMatching) {
    println("they have same reference")
  } else {
    println("they have different reference")
  }

  println(add(10,20))
  println(cal(10,20,"add"))
  println(cal(10,20,"sub"))
}

fun add(x: Int, y: Int) = x + y

fun cal(x: Int, y: Int, op: String) = when (op) {
  "add" -> x + y
  "sub" -> x - y
  else -> throw InvalidArgumentException(null)
}

fun