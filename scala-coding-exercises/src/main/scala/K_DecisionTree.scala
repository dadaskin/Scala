enum K_DecisionTree {

  def decide(value: Int): Boolean =
    this match {
      case Result(result) => result
      case Split(split, lte, gt) =>
        if (value <= split) lte.decide(value)
        else gt.decide(value)
    }

  case Result(result: Boolean)
  case Split(
              split: Int,
              lessThanOrEqual: K_DecisionTree,
              greaterThan: K_DecisionTree
            )
}
