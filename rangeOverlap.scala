//Question: Merging ranges
//Given a list of tuples which represent ranges of values, merge the ranges that overlap."
//For example:
// f([(1,4), (8,10), (9,12), (3,6)]) = [(1,6), (8,12)]

def compare(a:(Int,Int),b:(Int,Int)) = {
  if(a == b){
    None
  }
  else if(a._2 >= b._1){
    Some((a._1,b._2))
  }else{
    None
  }
}

def rangeOverlap(data:Array[(Int,Int)]) = {
  val arrSorted = data.sortBy(_._1)

  val output =
    for(i <- 0 until arrSorted.length - 1) yield {
      compare(arrSorted(i), arrSorted(i+1))
    }

  output.flatten
}