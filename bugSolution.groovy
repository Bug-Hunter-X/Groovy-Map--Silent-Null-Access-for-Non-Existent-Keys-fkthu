```groovy
def myMethod(Map params) {
  if (params.containsKey("key")) {
    println params["key"]
  } else {
    println "Key not found"
  }
}

def myMethodSafe(Map params) {
  def value = params.get("key") //Use the get() method
  if (value != null) {
    println value
  } else {
    println "Key not found"
  }
}

myMethod( [:] )
myMethodSafe([:] )

def myMethodSafeElvis(Map params) {
  println params.get("key") ?: "Key not found" //Use Elvis operator
}
myMethodSafeElvis([:])
```