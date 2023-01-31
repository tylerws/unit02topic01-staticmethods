In this assignment, all exercises should be completed in the same file. Write some code in the `main` method to demonstrate/test each method.

1. `max3`

Write a static method called `max3` that takes three `int` arguments and returns the value of the largest one. Add an overloaded function that does the same thing with three `double` values.

first argument | second argument | third argument | return value
---|---|---|---
1 | 4 | 1 | 4
-9 | -7 | -2 | -2
3.141 | 2.718 | 0.5 | 3.141
1 | 2 | 0.00001 | 2.0

2. `odd`

Write a static method `odd` that takes three `boolean` arguments and returns `true` if an odd number of the argument values are `true`, and `false` otherwise

first argument | second argument | third argument | return value
---|---|---|---
false | false | false | false
true | false | false | true
false | true | false | true
true | true | false | false
true | false | true | false
true | true | true | true

3. `majority`

Write a static method `majority` that takes three `boolean` arguments and returns `true` if at least two of the argument values are `true`, and `false` otherwise. Extra challenge: try doing this without using an `if` statement

first argument | second argument | third argument | return value
---|---|---|---
false | false | false | false
true | false | false | false
true | true | false | true
true | false | true | true
true | true | true | true

4. `trigIdentity`

Write a static method `trigIdentity` that takes a `double` argument `x`, and returns the `double` value obtained from the formula sin^2(`x`) + cos^2(`x`). (Regardless of `x`, the returned value should be very close to 1.0)