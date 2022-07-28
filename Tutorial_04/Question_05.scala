package Tutorial_04

object Question_05 extends App {
  // Function for converting string to uppercase characters
  def toUpperCase(input: String): String = if(input.length > 1) {
    val firstCharacter: Char = input(0)
    if(firstCharacter.toInt >= 97 && firstCharacter.toInt <= 122){
      s"${(firstCharacter.toInt - 32).toChar}${toUpperCase(input.substring(1, input.length))}"
    }else{
      s"${(firstCharacter.toInt).toChar}${toUpperCase(input.substring(1, input.length))}"
    }
  } else {
    val firstCharacter: Char = input(0)
    if(firstCharacter.toInt >= 97 && firstCharacter.toInt <= 122){
      s"${(firstCharacter.toInt - 32).toChar}"
    }else{
      s"${(firstCharacter.toInt).toChar}"
    }
  }

  // Function for converting character to lowercase characters
  def toLowerCase(input: String): String = if(input.length > 1) {
    val firstCharacter: Char = input(0)
    if(firstCharacter.toInt >= 65 && firstCharacter.toInt <= 90){
      s"${(firstCharacter.toInt + 32).toChar}${toLowerCase(input.substring(1, input.length))}"
    }else{
      s"${(firstCharacter.toInt).toChar}${toLowerCase(input.substring(1, input.length))}"
    }
  } else {
    val firstCharacter: Char = input(0)
    if(firstCharacter.toInt >= 65 && firstCharacter.toInt <= 90){
      s"${(firstCharacter.toInt + 32).toChar}"
    }else{
      s"${(firstCharacter.toInt).toChar}"
    }
  }

  def applyFormats(f:(String) => String ,input: String): String = f(input)

  // Test data
  val names = Array("Benny", "Niroshan", "Saman", "Kumara")
  println(applyFormats(toUpperCase, names(0)))
  println(applyFormats(toUpperCase, names(1)))
  println(applyFormats(toLowerCase, names(2)))
  println(applyFormats(toLowerCase, names(3)))
}
