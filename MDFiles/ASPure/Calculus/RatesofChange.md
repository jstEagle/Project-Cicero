Using [[Chain Rule]] we can find the relationship between related derivatives.

For example, imagine a shock wave expanding in a circular shape. What is the relationship between the rate the area of the circle increases and the rate the radius increases.
![[Pasted image 20230809122114.png]]
In this problem, the derivatives involved are:
$$ \frac{dA}{dt}- The\ rate\ of\ change\ of\ the\ Area$$
$$ \frac{dr}{dt}-the\ rate\ of\ change\ of\ the\ Radius$$
These two rates can be related using the [[Chain Rule]] 
$$ \frac{dA}{dt} = \frac{dr}{dt} * \frac{d?}{d?}$$
$$ \frac{dA}{dt} = \frac{dr}{dt} * \frac{dA}{dr}$$
In this case the shape is always circular. So $A = \pi r^2$, and $\frac{dA}{dr} = 2\pi r$

**The Radius of a circular shock wave is increasing at a rate of 100m/s. Find the rate of increase of the area when the radius is <mark class="hltr-grey">200m</mark>**

<mark class="hltr-grey">This is an irrelevant part that is only used to fill into an equation in the end.</mark>

1) <mark class="hltr-blue">Identify the given rate of change</mark>

In this case the given rate of change is: radius - 100m/s
$$ \frac{dr}{dt} = 100m/s$$
2) <mark class="hltr-cyan">Find what rate of change you need to find. </mark>

In this case the questions asks for the increase in _area_ which means that we need to find the derivative:
$$ \frac{dA}{dt}$$
________
Using [[Chain Rule]] we can find the missing equation easily.

$$\frac{dA}{dt} = \frac{dr}{dt} * \frac{d?}{d?}$$
$$ \downarrow$$
$$\frac{dA}{dt} = \frac{dr}{dt} * \frac{dA}{dr}$$
____ 
3) <mark class="hltr-green">Identify & calculate the third rate of change.</mark>
$$\frac{dA}{dt}$$
$$A = \pi r^2$$
$$\frac{dA}{dr} = 2\pi r = \frac{dm^2}{dm}$$

##### Result
$$ = 2\pi r * 100$$
$$ = 2\pi (200) * 100 $$
$$= 40,000\pi = 126,000m^2/s$$

<mark class="hltr-grey">This is where the 200 comes in which was irrelevant earlier</mark>


### Workbook examples
____
The area of a square is increasing at a rate of 8$cm^2$ per second. Find the rate the length of the side is increasing at the instant when the side length is 20cm.

Given: $\frac{dA}{dt} = 8cm^2/s$

Needed: $\frac{dL}{dt}$

$$\frac{dL}{dt} = \frac{dA}{dt} * \frac{dL}{dA}$$
$$ \downarrow$$
$$A = L^2$$
$$\therefore \frac{dA}{dL} = 2L$$
$$\therefore \frac{dL}{dA} = \frac1{2L}$$
$$\downarrow$$
$$8 * \frac{1}{2L} = \frac{dL}{dt}$$
$$\downarrow$$$$ 8 * \frac{1}{2(20)} = \frac15 = 0.2cm/s$$
_______
