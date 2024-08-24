### $$y=\cos(x) \rightarrow \frac{dy}{dx} = -\sin(x)$$
### $$y=\sin(x) \rightarrow \frac{dy}{dx} = \cos(x)$$
### $$y=\tan(x) \rightarrow \frac{dy}{dx} = \sec^2(x)$$
_______
### $$y = \cos(kx) \rightarrow \frac{dy}{dx} = -k\sin(kx)$$
### $$y = \sin(kx) \rightarrow \frac{dy}{dx} = k\cos(kx)$$
### $$y = \tan(kx) \rightarrow \frac{dy}{dx} = k\sec^2(kx)$$
____________
### $$f(x) = \sin(x)$$
```desmos-graph
left=-2pi; right=2pi;
top=2; bottom=-2;
---
y = \sin(x)
```
### $$f'(x) = \cos(x)$$
```desmos-graph
left=-2pi; right=2pi;
top=2; bottom=-2;
---
y = \cos(x)
```
_All this is only true if the angle is measured in RADIANS!_

_____
### Proof
$$\frac{d}{dx}(\sin(x))$$
$$=\lim_{h \rightarrow 0} \frac{\sin(x + h) - \sin(x)}{h}$$
$$=\lim_{h \rightarrow 0} \frac{\sin(x)*\cos(h) + \sin(h)*\cos(x) - \sin(x)}{h}$$
$$=\lim_{h \rightarrow 0} \frac{\sin(x)*\cos(h)-\sin(x)+\sin(h)*\cos(x)}{h}$$
$$=\lim_{h \rightarrow 0} \frac{\sin(x)*(\cos(h) - 1)}{h} + \frac{\sin(h)*\cos(x)}{h}$$
$$=\sin(x)\ \lim_{h \rightarrow 0} \frac{\cos(h) -1}{h} \rightarrow 0\ \ \ \ \ + \cos(x)\ \lim_{h \rightarrow 0} \frac{\sin(h)}{h}\rightarrow 1$$
$$=\sin(x)*(0) + \cos(x)*(1)$$
$$=\cos(x)$$
_____
