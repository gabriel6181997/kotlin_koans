// Delegates example
// Learn about delegated properties and make the property lazy using delegates.

class LazyProperty(val initializer: () -> Int) {
  val lazyValue: Int by lazy(initializer)
}
