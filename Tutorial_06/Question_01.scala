package Tutorial_06

object Question_01 extends App {
  // Encryption algorithm with shift parameter
  def encrypt(input: String, shift: Int) = input.map((character) => ((character.toInt - 64 + shift) % 26 + 64).toChar)

  // Decryption algorithm with shift parameter
  def decrypt(input: String, shift: Int) = input.map((character) => ((character.toInt - 64 - shift) % 26 + 64).toChar)

  // Cipher algorithm
  def cipher(input: String, shift: Int, fn:(String, Int) => String) = fn(input, shift);

  // Driver program
  print("Is encrypt(true or false)?: ")
  val isEncrypt = scala.io.StdIn.readBoolean()
  if(isEncrypt){
    print("Please enter the text which need to encrypt(uppercase): ")
    val text = scala.io.StdIn.readLine()
    print("Please enter number of shifts: ")
    val shift = scala.io.StdIn.readInt()

    if(shift >= 0 && shift <= 26) println(s"Encrypted version ${cipher(text, shift, encrypt)}")
    else println("Cannot perform encryption(shift is invalid)")
  } else {
    print("Please enter the text which need to decrypt(uppercase): ")
    val text = scala.io.StdIn.readLine()
    print("Please enter number of shifts")
    val shift = scala.io.StdIn.readInt()

    if(shift >= 0 && shift <= 26) println(s"Decrypted version ${cipher(text, shift, decrypt)}")
    else println("Cannot perform decryption(shift is invalid)")
  }

}
