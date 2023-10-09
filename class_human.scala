class Human(name: String, age: Int, data_birth: String, height: Int, weight: Int, country_live: String, region_live: String) {
  val fullName: String = name
  val personAge: Int = age
  val birthday: String = data_birth
  val height_human: Int = height
  val weight_human: Int = weight
  val country: String = country_live
  val region: String = region_live

  override def toString: String = s"Name: $fullName\nAge: $personAge\nBirthday: $birthday\nCountry: $country\nRegion: $region\nHeight: $height_human\nWeight: $weight_human"
}

object Main extends App {
  val name_people = new Human("Mykola", 18, data_birth = "23.09.2005", height = 179, weight = 53, country_live = "Ukraine", region_live = "Kherson region")

  println(name_people)
}

Main.main(Array.empty[String])
