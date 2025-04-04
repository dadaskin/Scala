package challenges

enum DecisionTree {

  def decide(value: Int): Boolean =
    ???

  case Result(result: Boolean)
  case Split(
      split: Int,
      lessThanOrEqual: DecisionTree,
      greaterThan: DecisionTree
  )
}
