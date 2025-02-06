```groovy
def myMethod(Map params) {
  if (params.containsKey("key")) {
    println params["key"]
  } else {
    println "Key not found"
  }
}

myMethod( [:] )
```