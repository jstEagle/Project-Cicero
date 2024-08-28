A function is usually defined **explicitly** by means of a formula:
$$f(x) - x^2 - x = 2\ \ \ or\ \ \ y= \sqrt{2x-1}$$
Both the above examples can be differentiated by using the rules. However, sometimes the value $y = f(x)$ is not given by such a direct formula. Sometimes making y the subject of the formula requires difficult algebra such as:
$$y^3 + 12y^2 + 48y - 8x + 64 = 0$$
$$y^3 + 12y^2 + 48y + 64 = 8x$$
$$(y+4)^3 = 8x$$
$$y + 4 = 2*\sqrt[3]{x}$$
$$y = 2*\sqrt[3]{x} - 4$$
That is quite difficult unless you are good at factorising cubes.
And sometimes we simply do not know enough algebra or do not want to know enough algebra to make the subject of the formula and define the function explicitly,
such as $y^3 + 3y^2 - 12y - 10x = 0$.
The above equation cannot be expressed explicitly but we should still be able to find the gradient of the tangent at point. To do this we use implicit differentiation.
The process is called **implicit differentiation** because y is an implied function of x as opposed to being expressed explicitly in terms of x.
_____
### Examples
1) 
$$y^2$$
$$\frac{d}{dx}*y^2$$
$$=\frac{d}{dy} * \frac{dy}{dx} * y^2$$
$$= \frac{d}{dy}y^2 * \frac{dy}{dx}$$
$$=2y * \frac{dy}{dx}$$


2) 
$$xy$$
$$\frac{d}{dx}xy = \frac{d}{dx}x*y + \frac{d}{dx}y*x$$
$$\frac{d}{dx}xy = 1y + \frac{d}{dy} * \frac{dy}{dx}y*x$$
$$=1y + \frac{d}{dy}y * \frac{dy}{dx}*x$$
$$= y + 1 * \frac{dy}{dx}x$$
$$=y + x\frac{dy}{dx}$$


3) 
$$3x^2y^3$$
$$\frac{d}{dx}3x^2y^3 = 3(y^3 *\frac{d}{dx}x^2 + x^2*\frac{d}{dx}y^3)$$
$$=3(2y^3x+\frac{d}{dy} *\frac{dy}{dx}x^2y^3)$$
$$=3(2y^3x + 3y\frac{dy}{dx}x^2)$$
$$= 6y^3x + 9y*\frac{dy}{dx}*x^2$$


4) 
$$\sin y$$
$$=\frac{d}{dx}\sin y$$
$$=\frac{d}{dy} * \frac{dy}{dx}\sin y$$
$$=\frac{d}{dy}\sin y * \frac{dy}{dx}$$
$$=\cos y * \frac{dy}{dx}$$
_____
### Hard question
The curve with equation $6e^{2x} + ke^y + e^{2y} = c$,
where k and c are constants, passes through the point P with coordinates $(\ln3, \ln2)$.
1) Show that $58 + 2k = c$
2) Given also that the gradient of the curve at P is -6, find the values of $k$ and $c$


1) $$\frac{d}{dx}(6e^{2x} + ke^y + e^{2y}) = \frac{d}{dx}c$$
$$\frac{d}{dx} = 0\ is\ not\ the\ right\ way$$
$$6e^{2\ln3} + ke^{\ln2} + e^{2\ln2} = c$$
$$6e^{\ln9} + ke^{\ln2} + e^{\ln4} = c$$
$$6(9) + k(2) + 4 = c$$
$$58 + 2k = c$$


2) $$\frac{d}{dx}(6e^{2x} + ke^y + e^{2y}) = \frac{d}{dx}c$$
$$12e^{2x} + ke^y\frac{dy}{dx} + 2e^{2y}\frac{dy}{dx} = 0$$
