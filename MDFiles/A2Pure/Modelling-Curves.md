### Power Function
### $$y=kx^n$$
### $$x\ is\ to\ the\ power\ n$$
### $$y = bx^4$$
Always for the graph log k vs log d
### Exponential Function
### $$y=ka^x$$
### $$ x\ is\ an\ exponent$$
### $$y = 2(3)^x$$
Always for the graph log k vs d
____
### Example
A water pipe is going to be laid between two points and an investigation is carried out as to how, fora given pressure difference, the rate of flow R liters per second varies with the diameter of the pipe d cm. The following data is collected:

| d (cm)  | 1    | 2   | 3   | 5   | 10  |
| ------- | ---- | --- | --- | --- | --- |
| R (L/s) | 0.02 | 0.32    | 1.62    | 12.53    | 199.80    |
It is suspected that the relationship between R and d may be of the form 
$$ R=kd^n$$
$$where\ k\ and\ d\ are\ constants$$
1) Explain how the graph of log d against log R tells you whether this is a good model for the relationship

_We must show that log d vs log R gives us a straight line equation form. _
$$R = kd^n$$
$$\log R = \log kd^n$$
$$\log R = \log k + n\log d$$
$$y = mx + c$$
$$\downarrow$$
$$\log R = n\log d + \log k$$

2) Make a table of values of log d against log R and plot these on a graph.

| D     | 1   | 2   | 3   | 5   | 10  |
| ----- | --- | --- | --- | --- | --- |
| R     | 0.02    | 0.32    | 1.62    | 12.53    | 199.80    |
| log d | 0    | 0.30103    | 0.477121    | 0.69897    | 1    |
| log R      | -1.69897    | -0.49485    | 0.209515    | 1.097951    | 2.300595    |

![[Pasted image 20240214210816.png]]

So the power equation $y=kx^n$ works! It requires that we plot log y vs log x. Log y vs x does not give a straight line. This is what we plot for the exponential function model $y=ka^x$ 

3) Find the relationship between d and R. i.e. find the rule that links d and R using your graph to estimate the values of n and k.

$$\log R = n\log d + \log k$$
$$use\ the\ table\ of\ data\ and\ graph$$
$$-1.69897 = \log k + n0$$
$$\log k = 10^{-1.69897}$$
$$k = 0.0200$$
$$R = 0.02d^4$$
$$ $$
$$n = \frac{2.3000595 + 1.69897}{1-0}$$
$$=3.999565$$
$$\approx 4$$


##### Finding n & k quickly using algebra
$$(1, 0.02)\ (2, 0.32)$$
$$R = kd^n$$
$$0.02 = k1^n$$
$$\therefore k = 0.02$$
$$ $$
$$0.32 = k.2^n$$
$$0.32 = (0.02)2^n$$
$$16 = 2^n$$
$$\therefore n = 4$$
$$R = 0.02d^4$$
