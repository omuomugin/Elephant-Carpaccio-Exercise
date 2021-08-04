## What is this
Personally trying [Elephant Carpaccio Exercise](https://docs.google.com/document/d/1TCuuu-8Mm14oxsOnlk8DqfZAA1cvtYu9WGv67Yj_sSk/pub).

> The Elephant Carpaccio exercise is a great way for software people to practice & learn how to break stories into really thin vertical slices. It also leads to interesting discussions about quality and tech practices.

In this excercise you build program which calculates total price of given item counts, price per item and state code (for calculation taxes).  
The point here is to slice as many as you can in form of user stories.  
Which means each slices should be
- Implementable (including user interface) in 2-6 minutes.
- Noticeable different from last slice
- More valuable to customer than last slice (exception: for first couple of slices, focusing on reduced risk is OK).

## Slices of User Stories I came up with
1. Print "Hello World!" - Reducing Technical Risk
3. Get argument and print it (just like echo) - Reducing Technical Risk
4. Get two int arguments and print it - Reducing Technical Risk
5. Multiply those two ints and calculate them (adding test for the first time) - User can calculate total price
6. Calculate only for UT state. (output should be double in this story) - UT Tax calculatiion supported
7. Output only 2 places of decimal with ceil for valid cent calculation. - Not thinking of valid cent calculation
8. Enable to get prices of items with double. - User can set price per items with double (like 0.99$)
9. Get state letter for argument but only UT is available.(if state is not supported show "error") - User can set state as argument (but UT only supported)
10. Get state letter for argument but only UT, NV is available. - NV supported
11. Get state letter for argument but only UT, NV, TX is available. - TX supported
12. Get state letter for argument but only UT, NV, TX, AL is available. - AL supported
13. Get state letter for argument but only UT, NV, TX, AL, CA is available. - CA supported
14. Discount for 1000$ - Discount Feature enable for 1000$
15. Discount for 5000$ - Discount Feature enable for 5000$ also
16. Discount for 7000$ - Discount Feature enable for 7000$ also
17. Discount for 10000$ - Discount Feature enable for 10000$ also
18. Discount for 50000$ - Discount Feature enable for 50000$ also
19. validate args for types and ranges.
