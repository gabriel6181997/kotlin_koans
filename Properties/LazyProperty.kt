// Lazy property
// Add a custom getter to make the val lazy really lazy. It should be initialized by invoking initializer() during the first access.
// You can add any additional properties as you need.
// Do not use delegated properties!

class LazyProperty(val initializer: () -> Int) {
  var value: Int? = null
  val lazy: Int
      get() {
          if(value == null) {
              value = initializer()
          }
          return value!!
      }
}
