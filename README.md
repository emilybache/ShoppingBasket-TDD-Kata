# Shopping Basket TDD Kata

This code is some design sketches of a solution to the [Shopping Basket Kata](https://sammancoaching.org/kata_descriptions/shopping_basket.html). The interesting part of that exercise is not so much writing the implementation to calculate discounts, but in designing the data structures and classes and functions. There are many ways to do it, these are some ideas. All the test cases are for the specific example included in the problem description. This is not the first test you write if you're doing TDD, but it gives you an idea of a design you could head for.

## Guided Learning Hour
This exercise is featured in my YouTube Videos [Usage-First Design in TDD](https://youtu.be/4xNPMbV4J4w) and [Incremental TDD](https://youtu.be/5BftptSNrAg).

## Test List
I include a list of examples that you could turn into test cases. The same test list works for more than one design. To practice doing TDD, choose one of the design ideas and make sure the test that's there compiles, but is not being run, (set it to "Ignore"). Then start writing the first test on this list (empty basket), see it fail, then write just enough implementation to make it pass. Continue with the next example, gradually building up the functionality incrementally. By the end you should be able to get the original test to pass.

 * Empty basket - basket contains no items
 * one item "A" - basket contains 1 item "A"
 * two items "A" - basket contains 2 items "A"
 * two items, "A" and "B" - basket contains 1 item "A"
 * Empty basket - total price 0
 * "A" costs $10, basket contains one "A" - total $10
 * "D" costs $160, basket contains one "D" - total $152 (5% discount)
 * "E" costs $250, basket contains one "E" - total $225 (10% discount)
 * Basket contains two "D" - total $288 (10% discount)
 * Remove the "Ignore" marking on the original test and hopefully it will pass!

## Language Versions
The various language versions are not direct translations of one another. I would like them to all be equivalent to the C# version but havn't got around to that yet. Pull requests welcomed.
