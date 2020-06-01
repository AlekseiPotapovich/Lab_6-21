//Отсортировать в коллекции все слова по длине.

object Main {
  var ms2 = Array("zzz", "xxxxx", "qqqqqqqq", "c", "bbbbbbbbbbbb", "nn");
  var size: Int = ms2.size

  // var ms : Array[String] = new Array[String](3)
  def main(args: Array[String]): Unit = {

    sortArray()
    printfArray()


  }


  def sortArray(): Unit = {

    var str2: String = ""


    for (i <- 0 until size) {
      var sizeElem2: Int = 0
      for (w <- 0 until size) {
        val str1: String = ms2(w)
        val sizeElem1: Int = str1.size


        sizeElem2 = str2.size
        if (w + 1 <= size - 1) {
          str2 = ms2(w + 1)
          sizeElem2 = str2.size
        } else {
          str2 = ms2(w)
          sizeElem2 = ms2(w).size
        }
        //        printf("Str1 " + str1 + "\n")
        //        printf("Str2 " + str2 + "\n")
        if (sizeElem1 <= sizeElem2) {
          var str3: String = str2

          ms2(w) = str3
          if (w + 1 <= size - 1) {
            ms2(w + 1) = str1
          }
        }
      }
    }
  }

    def printfArray(): Unit = {
      for (w <- 0 until size) {
        printf(ms2(w) + " ")
      }
      printf("\n")
    }
  }

