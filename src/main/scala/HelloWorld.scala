object HelloWorld {
  def main(args: Array[String]): Unit = {
    //if基礎
//    val age : Int = 22
//
//    if (age < 20) {
//      println("未成年")
//    } else {
//      println("成人しています")
//    }

    //while基礎
//    var i: Int = 0
//
//    while (i <= 10) {
//      println(i)
//      i += 1
//    }
    //for文
//    for(x <- 1 to 5; y <- 1 until 5 if x != y){
//        println("x=" + x + " y=" + y)
//    }

//      //forでのコレクションの展開
//      for(e <- List("aa", "bb", "cc", "dd", "ee")){
//        println(e)
//      }
//
//      //forでコレクションの型変換をする時はyieldをつける
//      //for構文はyieldキーワードを使うことで、コレクションの要素を加工して返すという全く異なる用途に使うことができます
//      for(e <- List("A", "B", "C", "D", "E"))yield{
//          println("key = " + e)
//      }

    //match
    val human: Int = 30
    var name: String = "name"

    human match {
      case 25 => name = "kotake"
      case 26 => name = "hishikawa"
      case 27 => name = "dareyakke?"
      case 28 => name = "ushijima"
      case 29 | 30 => name = "tutomu"
      case _  => name = "human"
    }

    println(name)





  }
}
