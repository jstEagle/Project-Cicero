The modulus (also known as absolute) value function is written as $|x|$ and it is defined as $|x| = \begin{Bmatrix} -x, \ if\ x \le 0 \\ x, \ if\ x \ge 0 \end{Bmatrix}$
You can also write $|a| = |b| \leftarrow \rightarrow a^2 = b^2$, because the quadratic power will make any negative positive and then you take the surd and the function becomes the original function.

The absolute value graph is essentially just a graph with all the parts that are negative (below the y-axis) reflected across the x-axis to be positive.

```desmos-graph
left=-20; right=20;
bottom=-3; top=20;
---
y = \abs(x)
y = \abs(x-3)+5 |dotted|
(0,0)|label:(0,0)
(3,5)|label:(3,5)
```
$y = |x|$ - Solid
$y = |x-3|+5$ - Dotted


The absolute value of a number is its magnitude without any direction. i.e. the distance from (0,0)

$$|3| = 3$$
$$|-3| = 3$$
_Operates as a bracket_
### $$ y = |x^2 - 2|$$
```desmos-graph
y = \abs(x^2-2)
y = x^2 - 2 | dotted | -1.414<x<1.414 |
```
_$y = x^2 -2$ : Dotted_
### Example
$$|x-3|\ if\ x=1$$
$$|(1)-3| = 2$$
_________
$$|2x-1| = 7$$
$$2x-1 = 7\ or\ 2x-1 = -7$$
$$x = 4\ or\ x = -3$$
_______
### $$y = \sin{|x|}\ \  x \epsilon[-2\pi,2\pi]$$
```desmos-graph
y = \sin(\abs(x)) |-2\pi <x < 2\pi |
```
The function $\sin(|x|)$ is a modification of the sine function $sin(x)$ where the absolute value of $x$ is taken. The absolute value function $|x|$ essentially removes the negative sign from $x$, making all values positive. 

In the context of $sin(|x|)$, this means that the function is symmetric with respect to the y-axis. The graph of $\sin(|x|)$ will look the same for positive and negative values of $x$.

Here's a brief explanation:

1. For $x \ge 0 : \sin(|x|) = \sin(x)$
2. For $x < 0: \sin(|x|) = \sin(-x) = -\sin(x)$

So, the graph of $\sin(|x|)$ will have the same shape as $\sin(x)$, but it will be reflected in the y-axis for negative values of $x$. The absolute value essentially "flips" the negative part of the graph to the positive side.

The sine function has a periodic nature, and the absolute value won't change the periodicity or the general shape of the sine curve, but it will affect its symmetry.
### $$ y = \cos{|x|}\ \ x \epsilon[-2\pi, 2\pi]$$
```desmos-graph
y = \cos(\abs(x)) | -2\pi < x < 2\pi|
```

### $$y = \tan{|x|} \ \ x \epsilon[-2\pi, 2\pi]$$
```desmos-graph
y = \tan(\abs(x)) | -2\pi < x < 2\pi|
```
_______
### $$ y = |x-2|\ and\ y = ||x|-2|$$
```desmos-graph
y = \abs(x-2)
y = \abs(\abs(x)-2)
```
_______
### Solving Absolute Value Equations
##### Method 1
$$ |x-5| = 2x-7$$
$$If\ x-5 \ge 0$$
$$Then\ x \ge 5$$
$$ \downarrow$$
$$x-5 = 2x-7$$
$$-5+7 = 2x-x$$
$$x= 2$$
$$\therefore there\ is\ no\ sol.\ for\ x-5 \ge 0$$
$$If\ \ x - 5 \le 0$$
$$Then\ x \le 5$$
$$-(x-5) = 2x+7$$
$$-x+5 = 2x-7$$
$$12 = 3x$$
$$x = 4$$
```desmos-graph
y = \abs(x-5)
y = 2x-7
```
##### Method 2
$$|x-3| = |x-5|$$
$$(|x-3|)^2 = (|x-5|)^2$$
$$(x-3)^2 - (x-5)^2 = 0$$
$$((x-3)+(x-5))((x-3)-(x-5))= 0$$
$$(2x-8)2=0$$
$$2x - 8 = 0$$
$$x = 4$$
$$\downarrow Check$$
$$|4-3| = |4-5|$$
$$|1| = |-1|$$
$$1 = 1$$
$$\therefore x=4\ is\ valid$$
________
#### Drawing Graphs
$$ y = |x-3| + 2x+1$$
$$when\ x-3\ge 0 $$
$$x \ge 3$$
$$so\ for\ x\epsilon [3, \infty)$$
$$y = x-3 + 2x+1$$
$$y = 3x-2$$
$$ \\\ $$
$$when\ x-3 \le 0$$
$$x \le 3$$
$$so\ for\ x\epsilon (-\infty, 3]$$
$$y = -(x-3)+2x+1$$
$$= -x+3+2x+1$$
$$= x+4$$
```desmos-graph
left=-10; right=10;
top=10; bottom=-10;
---
y = 3x-2 | x \ge 3 |
y = x+4 | x \le 3 |
x = 3 | dotted |
```

$$ y = |x-5|-|x+2|$$
