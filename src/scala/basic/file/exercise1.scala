package scala.basic.file

object exercise1 {
  def degreeC2F(c: Double) = (c * 9 / 5) + 32
  def degreeF2C(f: Double) = (f - 32) * 5 / 9

  def String2Date(s: String) = {
    var ss = s.split("/")
    var year = if (ss(0).length() == 2) "20" + ss(0) else ss(0)
    var month = ss(1) match {
      case "1" | "01" => "January"
      case "2" | "02" => "February"
      case "3" | "03" => "Match"
      case "4" | "04" => "April"
      case "5" | "05" => "May"
      case "6" | "06" => "June"
      case "7" | "07" => "July"
      case "8" | "08" => "August"
      case "9" | "09" => "September"
      case "10" | "10" => "October"
      case "11" | "11" => "Novenber"
      case "12" | "12" => "December"
      case _ => throw new IllegalArgumentException("Month Error");
    }
    var day = ss(2)
    s"$year, $month, $day"
  }

  def main(args: Array[String]): Unit = {
    println(degreeC2F(30))
    println(degreeF2C(68))
    println(String2Date("16/07/25"))
  }
}