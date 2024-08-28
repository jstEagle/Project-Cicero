### $$(f * g)' = f'*g + f *g'$$
_____

### $$\frac{d}{dx}(u * v) = u *\frac{dv}{dx} + v * \frac{du}{dx}$$
____

### $$ d(uv) = u*dv + v * du$$
_______
### Proof
$$let\ p(x) = f(x) * g(x)$$
$$p'(x) = \lim_{h\rightarrow 0} \frac{f(x+h) * g(x + h) - f(x)g(x)}{h}$$
$$=\lim_{h\rightarrow 0} \frac{f(x + h)g(x+h) - f(x + h)g(x) + f(x+h)g(x) - f(x)g(x)}{h}$$
$$Note:\ -f(x + h)g(x) + f(x + h)g(x) = 0$$
$$= \lim_{h\rightarrow 0} \frac{f(x + h)(g(x + h) - g(x)) + g(x)(f(x + h) - f(x))}{h}$$
$$=\lim_{h \rightarrow 0} f(x+h) * \frac{g(x+h) - g(x)}{h} + g(x) * \frac{f(x+h) - f(x)}{h} $$
$$\frac{(g(x+h) - g(x)}{h} = Derivative\ of\ g$$
$$\frac{f(x+h) -f(x)}{h} = Derivative\ of\ h$$
$$= f(x) * g'(x) + g(x)*f'(x)$$
______
### Example
Given that $y = (2x+3)(x^2 - 5)$, find $\frac{dy}{dx}$ using the product rule.
$$(2x + 3) = u$$
$$(x^2 - 5) = v$$
$$\frac{dy}{dx} = u*v' + v * u'$$
$$ = 2(x^2-5) + 2x(2x+3)$$
$$= 2x^2 - 10 + 4x^2 + 6x$$
$$6x^2 + 6x - 10$$



Differentiate $y = 20x(x-1)^6$, using the product rule.
$$y = (20x)(x-1)^6$$
$$\frac{dy}{dx} = 20(x-1)^6 + 6(x-1)^5*1(20x)$$
$$= 20(x-1)^6 + 120x(x-1)^5$$
$$=20(x-1)^5((x-1) + 6x)$$
$$= 20(x-1)^5(7x - 1)$$
_____
### Example
