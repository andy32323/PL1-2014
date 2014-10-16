// val für Konstanten
// def für Methoden
// var für Variablen

abstract class Person(val name: String) {
  // String name
  // val name: String

  def sayHello() = {
    print("hello, " + name)
  }
}

trait ByeBye {
  def sayGoodbye = {
    print("bye")
  }
}

class Tillmann(name: String) extends Person(name) with ByeBye {
  override def sayHello = {
    print("hi")
  }
}

object Me extends Tillmann("Tillmann")





trait UniPerson
case class Student(val matrikelnummer: Int) extends UniPerson
case class Professor(val fachgebiet: String) extends UniPerson

object PatternMatching {
  def showUniPerson(p: UniPerson): String =
    p match {
      case Student(m) => "student nr " + m
      case Professor(f) => "professor on " + f
    }

  def test = {
    print(showUniPerson(Student(123)))
    print(showUniPerson(Professor("programming languages")))
  }
}


object AE extends App {
  // Abstract Syntax Tree
  trait Expression
  case class Literal(n: Int) extends Expression
  case class Addition(lhs: Expression, rhs: Expression) extends Expression

  // Example
  val onePlusThree = Addition(Literal(1), Addition(Literal(5), Literal(3)))

  // Interpreter
  def eval(e: Expression): Int =
    e match {
      case Literal(n) => n
      case Addition(lhs, rhs) =>
        eval(lhs) + eval(rhs)
    }
}


// HOMEWORK
//
// Email homework as Scala source file to:
//
//   rendel@informatik.uni-tuebingen.de
//
// Work in groups of 1 or 2 students.
// 
// Put "pl1-hw01" in subject, please
//
// 0. write in the email:
//      - your names
//      - your student ids ("Matrikelnummer")
//      - your study programme ("Studiengang")
//      - how long you study ("Fachsemester")
// 1. install Scala
// 2. experiment with this file
// 3. add Negation
// 4. implement eval without pattern matching
//
// Send question by email to rendel@informatik.uni-tuebingen.de