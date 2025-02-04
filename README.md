# What is @ExtensionMethod in Lombok?
- The @ExtensionMethod annotation allows you to extend a class with methods from a utility class. It enables the calling of static utility methods as though they are instance methods of the class being extended.

## Here’s a simple breakdown:

- Without @ExtensionMethod: You call static utility methods in a traditional way, using ClassName.methodName().
- With @ExtensionMethod: You can call utility methods as if they are directly part of the class, which makes the code more concise and readable.