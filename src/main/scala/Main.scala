object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    println("hell git")
    println("再输出一些信息")
  }

  def printAuthor(name: String, sex: String, age: Int): Unit ={
    println(s"name: $name, sex: $sex, age: $age")
  }

  printAuthor("李白","男",48)
  printAuthor("杜甫","男",56)
}