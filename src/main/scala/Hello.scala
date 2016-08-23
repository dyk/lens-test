
import monocle.macros.Lenses

@Lenses case class Company(name: String, city: String)
@Lenses case class Employee(company: Company, name: String)


object Hello {
  def main(args: Array[String]): Unit = {

    val c = Company("a","b")
    val e = Employee(c,"Henryk Kwiatek")

    import monocle.syntax.apply._

    //klasycznie
    val c1 = (Employee.company ^|-> Company.name).set("tadam!")(e)

    //albo ze scalaz
    import scalaz._, Scalaz._
    val c2 = e |> (Employee.company ^|-> Company.name).set("tadam!")

    println(c1)
    println(c2)
  }
}
