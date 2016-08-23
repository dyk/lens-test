
import monocle.macros.Lenses

@Lenses case class Company(name: String, city: String)
@Lenses case class Employee(company: Company, name: String)


object Hello {
  def main(args: Array[String]): Unit = {

    val c = Company("a","b")
    val e = Employee(c,"Henryk Kwiatek")

    import monocle.syntax.apply._

    val c1 = (Employee.company ^|-> Company.name).set("tadam!")(e)
    println(c1)
  }
}
