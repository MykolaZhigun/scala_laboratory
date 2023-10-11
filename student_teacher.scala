class Address(private val city: String, private val region: String) {
  override def toString: String = s"$city, $region"
}

class Human(private val name: String, private val surname: String, private val age: Int, private val address: Address) {
  protected val name_people: String = name
  protected val surname_people: String = surname
  protected val personAge: Int = age
  protected val homeAddress: Address = address

  override def toString: String = s"Name: $name_people\nSurname: $surname_people\nAge: $personAge\nAddress: $homeAddress"
}

class Student(name: String, surname: String, age: Int, address: Address)
  extends Human(name, surname, age, address) {

  def printStudentInfo(): Unit = {
    val humanInfo = super.toString()
    println(s"$humanInfo\n")
  }
}


class Teacher(name: String, surname: String, age: Int, address: Address)
  extends Human(name, surname, age, address)
  {

    def printTeacherInfo(): Unit = {
      val teacherInfo = super.toString()
      println(s"$teacherInfo")
    }
}



object Main extends App {
  val addressHuman = new Address("Kherson", "Kherson Region")
  val student = new Student("Oleg", "Petrov", age = 21, addressHuman)
  val teacher = new Teacher(name = "Igor", surname = "Dmitrievich", age = 42, addressHuman)

  println("\nStudent Info:")
  student.printStudentInfo()

  println("Teacher Info:")
  teacher.printTeacherInfo()
}

Main.main(Array.empty[String])
