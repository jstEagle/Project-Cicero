Whenever possible we try to find the root of equations using algebraic methods. However when this doesn't work another way of finding them is to use numerical methods.

Numerical methods are methods used to find the roots of functions that cannot be found algebraically or can only be found with great difficulty.

##### Always:
- Use algebra if possible
- Sketch graph to see roots easier
- Always state the degree of accuracy

### Interval estimation - change of sign methods
when looking for roots we are looking for the x-intercept (x , 0) where f(x) = 0.
$\therefore$ we are looking for the points at which the y-value changes from positive to negative or the other way round.

##### Method 1 - sketch
$$f(x) = x^3 + 3x - 5$$
```desmos-graph
left=-10; right=10;
top=10; bottom=-10;
---
y = x^3 + 3x - 5
```
$$\therefore\ we\ can\ tell\ that\ the\ interval\ in\ which\ the\ root\ lies\ is\ [1, 2]$$

##### Method 2 - sub in values into $f(x)$ until sign changes
$$e^x - x = x^2 + 2$$
$$e^x - x - x^2 - 2 = 0$$
$$f(2) = -0.61$$
$$f(3) = 6.0855$$
$$\therefore \ interval:\ [2,3]$$

##### Method 3 - Compare the two sides of the equation
$$e^x - x < x^2 + 2$$
$$e^x - x > x^2 + 2$$
$$\downarrow$$
$$e^2 - 2 < (2)^2 + 2$$
$$= 5.39 < 6$$
$$\downarrow$$
$$e^3 - 3 > 3^2 + 2$$
$$= 17 > 11$$
$$Change\ of\ sign\ indicates\ the\ interval\ is\ [2,3]$$
______
### Decimal Search
$$f(x) = x^5 - 5x + 3$$

| x   | 0   | 0.1 | 0.2 | 0.3 | 0.4 | 0.5 | 0.6 | 0.7 | 0.8 | 0.9 | 1.0 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| y   | +   | +   | +   | +   | +   | +   | +   | -   | -   | -   | -   |
$$\therefore interval\ [0.6, 0.7]$$
Change step to 0.01

| x   | 0.6 | 0.61 | 0.62 | 0.63 | 0.64 | 0.65 | 0.66 | 0.67 | 0.68 |
| --- | --- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| y   | +   | +    | -    | -    | -    | -    | -    | -    | -    |
$$\therefore interval\ [0.61, 0.62]$$
Change step to 0.001

| x   | 0.616 | 0.617 | 0.618 | 0.619 | 0.62 |
| --- | ----- | ----- | ----- | ----- | ---- |
| y   | +     | +     | +     | -     | -    |
$$\therefore interval\ [0.618, 0.619]$$
Rounded to 2 decimal places: $x = 0.62$
Since the root lies in the interval $[0.618, 0.619]$ we can also say that the root is 0.6185 with a maximum error of 0.0005.

____
### Interval Bisection
The interval is divided into 2 parts - it is bisected. This method is usually quite slow to converge to the root, and is cumbersome when performed manually.
$$x^5 - 5x + 3 = 0$$
$$interval:\ [0, 1]$$
$$f(0.5)> 0$$
$$f(1) < 0$$
$$\therefore value\ is\ inbetween$$
$$[0.5, 1]$$
$$\frac{0.5 + 1}{2} = 0.75$$
$$f(0.5) > 0$$
$$f(0.75) < 0$$
$$\dots$$
$$[0.5625, 0.625]$$
____
### Fixed Point Iteration
You find a single value or point as your estimate for the value of x, rather than establishing an interval within which it must lie. This involves an iterative process, a method of generating a sequence of numbers by continued repetition of the same procedure. If the numbers obtained in this manner approach some limiting value, then they are said to converge to this value.