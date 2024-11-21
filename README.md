# SwapWords Program

## Description
This project was a school assignment for my Java programming course. The task was to write a Java program that uses a stack to reverse words. The program reads text entered by the user, which can be up to 1000 characters long. The program follows these steps:

- Words are read and added to a stack until a word ending in a period (.) is encountered.
- When a period is found, all words in the stack are popped off and printed in reverse order, completing the sentence.
- The process repeats for additional sentences until there are no more words in the input.
- The output consists of sentences with their words reversed, while maintaining the sentence order.

### Example Input and Output:
#### Input: 
Mary had a little lamb. Its fleece was white as snow.

#### Output: 
lamb little a had Mary. snow as white was fleece Its.

## What I Learned
This week's lesson introduced the use of stacks in Java, which I found very helpful. Through the `SwapWords` program, I gained a practical understanding of how stacks operate with their Last-In-First-Out (LIFO) behavior. Using a stack to reverse the words in each sentence helped me clearly see how elements can be pushed onto the stack and then popped off in reverse order. This hands-on approach made the concept of stacks easier to digest.

Additionally, working with strings and detecting sentences that end with a period (.) in Java helped me solidify my string manipulation skills. For example, identifying when a word ends with a period allowed me to correctly determine when to reverse and print the words in a sentence. This assignment provided valuable experience in combining data structures and string processing. Overall, it deepened my understanding of both stacks and handling strings in Java.

