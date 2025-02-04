# Java Streams API
 
## 📌 Introduction

Java Streams API was introduced in Java 8 to provide a functional programming approach for processing collections. It represents a pipeline of functions that can be applied to a source (such as arrays or collections) and consists of intermediate and terminal operations.

Streams enable efficient and parallel processing, improving readability, flexibility, and performance.

---

## 🎯 Key Features

- Functional-style processing of collections
- Laziness: Operations are executed only when a terminal operation is invoked
- Parallel processing: Enables concurrent execution for better performance
- No storage: Streams do not store elements but operate on an existing source
- Pipeline processing: Intermediate operations return a new Stream, allowing method chaining

## 🔹 Stream Characteristics

- A stream can be sequential or parallel.
- Once a stream is consumed (via a terminal operation), it cannot be reused.
- Intermediate operations return another stream, while terminal operations return a result.
- Elements flow through the pipeline, getting processed at each stage.


## Functional Interfaces Used in Streams

### Functional Interface Table

| Functional Interface | Description | Example |
|----------------------|-------------|---------|
| **Predicate**         | Boolean function that tests a condition | `Predicate<Integer> isEven = x -> x % 2 == 0;` |
| **Function<T, R>**    | Applies a transformation and returns a value | `Function<Integer, Integer> square = x -> x * x;` |
| **Consumer**          | Performs an action and returns nothing | `Consumer<String> print = x -> System.out.println(x);` |
| **Supplier**          | Provides a value when invoked | `Supplier<Integer> random = () -> 100;` |
| **BiPredicate<T, U>** | Predicate working on two values | `(x, y) -> (x + y) % 2 == 0;` |
| **BiFunction<T, U, R>** | Takes two arguments and returns a result | `(x, y) -> (x + y).length();` |
| **UnaryOperator**     | Like Function, but input and output types are the same | `UnaryOperator<Integer> doubleIt = x -> x * 2;` |
| **BinaryOperator**    | Like BiFunction but with the same types | `BinaryOperator<Integer> add = (x, y) -> x + y;` |


---


## Creating Streams

### 🔹 From Collections

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> numberStream = numbers.stream();
```

### 🔹 From Arrays

```java
int[] intArray = {1, 2, 3, 4, 5};
IntStream intStream = Arrays.stream(intArray);

String[] stringArray = {"apple", "banana", "cherry"};
Stream<String> stringStream = Arrays.stream(stringArray);
```

### 🔹 Generating Streams
```java
// Generate random numbers
Stream<Integer> randomNumbers = Stream.generate(() -> new Random().nextInt()).limit(5);

// Iterate from a starting value
Stream<Integer> numbers = Stream.iterate(0, n -> n + 2).limit(5);
```

---

## 🔄 Stream Pipeline

A typical stream pipeline consists of:

**Source** → **Intermediate Operations** → **Terminal Operations**

---

## 🔹 Intermediate Operations

Intermediate operations return another stream, allowing method chaining. They are lazy and execute only when a terminal operation is called.

| Method            | Description                             | Example                                       |
|-------------------|-----------------------------------------|-----------------------------------------------|
| **.distinct()**    | Removes duplicate elements              | `stream.distinct();`                          |
| **.sorted()**      | Sorts elements                          | `stream.sorted();`                            |
| **.map(Function)** | Applies transformation                  | `stream.map(x -> x * 2);`                    |
| **.filter(Predicate)** | Filters elements                      | `stream.filter(x -> x % 2 == 0);`            |
| **.limit(n)**      | Limits number of elements               | `stream.limit(5);`                            |
| **.skip(n)**       | Skips first n elements                  | `stream.skip(2);`                             |
| **.peek(Consumer)**| Performs action without modifying stream| `stream.peek(System.out::println);`          |
| **.flatMap(Function)** | Flattens nested structures (List of Lists) | `list.stream().flatMap(Collection::stream);` |

## Example

```java
// Example of Intermediate Operations on a Stream
List<Integer> processedList = numbers.stream()
        .filter(n -> n % 2 == 0)   // Filter even numbers
        .map(n -> n * 2)          // Multiply by 2
        .distinct()               // Remove duplicates
        .sorted()                 // Sort elements
        .peek(System.out::println) // Print elements
        .collect(Collectors.toList()); // Collect as a list
```

---

## 🔹 Terminal Operations

Terminal operations consume the stream and return a result. Once executed, the stream cannot be reused.

| Method              | Description                                 | Example                                         |
|---------------------|---------------------------------------------|-------------------------------------------------|
| **.collect(Collector)**  | Collects elements into a collection         | `stream.collect(Collectors.toList());`          |
| **.forEach(Consumer)**   | Performs an action on each element          | `stream.forEach(System.out::println);`          |
| **.reduce(BinaryOperator)** | Reduces elements to a single value         | `stream.reduce(0, Integer::sum);`               |
| **.count()**            | Counts elements in the stream               | `long count = stream.count();`                  |


---

## ⏭ Short-Circuit Operations

Short-circuiting terminal operations exit early as soon as a condition is met.

| Method               | Description                               | Example                                          |
|----------------------|-------------------------------------------|--------------------------------------------------|
| **.anyMatch(Predicate)** | Returns true if any element matches       | `stream.anyMatch(x -> x % 2 == 0);`              |
| **.allMatch(Predicate)** | Returns true if all elements match       | `stream.allMatch(x -> x > 0);`                   |
| **.noneMatch(Predicate)** | Returns true if no element matches       | `stream.noneMatch(x -> x < 0);`                  |
| **.findFirst()**      | Returns the first element (Optional)      | `Optional<Integer> first = stream.findFirst();`  |
| **.findAny()**        | Returns any element (Optional)            | `Optional<Integer> any = stream.findAny();`      |


---

## ⚡ Parallel Streams

Parallel streams divide tasks into multiple threads, improving performance for large datasets.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.parallelStream().map(n -> n * 2).forEach(System.out::println);
```
### 📌 Ensure tasks are independent when using parallel streams to avoid unexpected results.

### Enforcing Sequential Execution

To ensure that tasks are executed sequentially in a parallel stream, you can use the `sequential()` method:

```java
numbers.parallelStream()
    .map(n -> n * 2)
    .sequential()
    .forEachOrdered(System.out::println);
```

---

## 📌 Collectors Utility Class

Java provides Collectors to simplify reducing and grouping stream results.

| Collector                        | Description                           |
|-----------------------------------|---------------------------------------|
| **.toList()**                     | Converts to List                      |
| **.toSet()**                      | Converts to Set                       |
| **.joining()**                    | Joins Strings                         |
| **.averagingInt()**               | Computes average                      |
| **.groupingBy(Function)**         | Groups elements                       |
| **.partitioningBy(Predicate)**    | Partitions elements                   |
| **.toMap(KeyMapper, ValueMapper)**| Converts to Map                       |

## ✅ Conclusion

Java Streams provide a functional and efficient way to process data with minimal code and support parallel processing. They enhance readability and performance, making Java more expressive. 🚀

---

## 📖 My Blog
Check out my latest articles on [Medium](https://varadpatil.medium.com/streams-the-ultimate-powerhouse-aed376e59191).


## 📌 Happy Coding! 😊



