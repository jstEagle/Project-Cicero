### $$\frac{dy}{dx} = \frac{dy}{\cancel{dt}} * \frac{\cancel{dt}}{dx}$$
### $$Since\ \frac{dt}{dx} = \frac{1}{\frac{dx}{dt}} \rightarrow \frac{dy}{dx} = \frac{\frac{dy}{dt}}{\frac{dx}{dt}} \ \ if\ \frac{dx}{dt} \ne 0$$
### $$ ax + by + c = 0\ \ \ \ \ a \in \mathbb{z} $$
__________
Parametric equations do not give a relationship between x and y directly in the form $y = f(x)$ but use a third variable $\vartheta$, to do so. This third variable is called the parameter.
_____
### Example

A curve has the parametric equations $x = t^2$ and $y = 2t$
1) Find $\frac{dy}{dx}$ in terms of the parameter t.
2) Find the equation of the tangent to the curve at the general point ($t^2$, $2t$)
3) Find the equation of the tangent at the point where $t$ = 3
4) Eliminate the parameter, and hence sketch the curve and the tangent at the point where $t$ = 3

1) $$\frac{dx}{dt} = 2t \ \ \ \ \ \ \frac{dy}{dt} = 2$$
$$\frac{\frac{dy}{dt}}{\frac{dx}{dt}} = \frac{2}{2t} = \frac1t$$


2) $$(t^2, 2t) \ \ \ \ m = \frac{1}t$$
$$y - y = m(x - x)$$
$$y - 2t = m(x - t^2)$$
$$ty - 2t^2 = x - t^2$$
$$ty - x -t^2 = 0$$
$$t^2 - ty + x = 0$$


3) $$(3)^2 - 3(y) + x = 0$$
$$9 - 3y + x = 0$$
$$y = \frac{x}3 + 3$$


4) $$x = t^2 \ \ \ \ \ y = 2t$$
$$x = (\frac{y}2)^2 \ \ \ \ \ \frac{y}2 = t$$
$$x = \frac{y^2}{4}$$
$$y^2 = 4x$$
$$when\ t = 3\ \ \ \ \ \ (9, 6)$$
$$y = \frac{x}3 + 3$$
```desmos-graph
left=-10; right=10;
top=10; bottom=-10;
---
y = \frac{x}{3} + 3
y^2 = 4x
(9,6)|label:(9,6)
```
______
### Example

A curve has parametric equations $x=4\cos\vartheta$, $y=3\sin\vartheta$.
1) Find $\frac{dy}{dx}$ at the point with parameter $\vartheta$
2) Find the equation of the normal a the general point $(4\cos\vartheta, 3\sin\vartheta)$.
3) Find the equation of the normal at the point where $\vartheta = \frac{\pi}{4}$.
4) Find the co-ordinates of the point where $\vartheta = \frac{\pi}{4}$.
5) Show the curve and the normal on a sketch

1) $$\frac{dx}{d\vartheta} = 4\sin\vartheta \ \ \ \ \ \ \frac{dy}{d\vartheta} = 3\cos\vartheta$$
$$\frac{dy}{dx} = \frac{\frac{dy}{d\vartheta}}{\frac{dx}{d\vartheta}} = -\frac{3\cos\vartheta}{4\sin\vartheta}$$


2) $$y - y = m(x - x)$$
$$m\ of\ normal = \frac{4\sin\vartheta}{3\cos\vartheta}$$
$$\therefore y - 3\sin\vartheta = \frac{4\sin\vartheta}{3\cos\vartheta}(x - 4\cos\vartheta)$$
$$y - 3\sin\vartheta = \frac{4\sin\vartheta}{3\cos\vartheta} * - \frac{16\sin\vartheta\cos\vartheta}{3\cos\vartheta}$$
$$3y\cos\vartheta - 9\sin\vartheta\cos\vartheta = 4x\sin\vartheta - 16\sin\vartheta\cos\vartheta$$
$$3y\cos\vartheta + 7\sin\vartheta\cos\vartheta - 4x\sin\vartheta = 0$$


3) $$\vartheta = \frac{\pi}4$$
$$3y\cos\frac{\pi}{4} + 7\sin\frac{\pi}{4}\cos\frac{\pi}{4} - 4x\sin\frac{\pi}{4} = 0$$
$$3y * \frac{\sqrt2}{2} + 7 * \frac{\sqrt2}{2} * \frac{\sqrt2}{2} - 4x*\frac{\sqrt2}{2} = 0$$
$$3y*\frac{\sqrt2}{2} + \frac72 - 4x*\frac{\sqrt2}{2} = 0$$
$$\frac{3y}{\sqrt{2}} + \frac72 - \frac{4x}{\sqrt{2}} = 0$$
$$3y - 4x + 7\sqrt{2} = 0$$


4) $$x = 4\cos\frac{\pi}4\ \ \ \ \ \ y = 3\sin\frac{\pi}4 $$
$$x = 2\sqrt2 \ \ \ \ \ y = \frac{3\sqrt2}{2}$$
$$(2\sqrt2, \frac{3\sqrt2}{2})$$


5) 
![[Pasted image 20240311094557.png]]
