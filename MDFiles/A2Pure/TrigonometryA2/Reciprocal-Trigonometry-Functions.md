### Cosecant
```desmos-graph
left=-2pi ; right=2pi;
top=3; bottom=-3;
---
y = \frac{1}{\sin(x)}
y = \sin(x)
```
On the graph above, the reciprocal of $\sin \theta = y$ is drawn (in blue) as $\csc \theta = \frac{1}{\sin \theta} = \frac{H}O = \frac{r}{y}$
_This is not the inverse $\sin^{-1}(x)$_

Period: 2$\pi$
Range: $y \ge 1 \cap y \le -1$
Domain: $x \in \mathbb{R}$
$x \ne k\pi\ \ k \in \mathbb{Z}$

| $\theta$                  | -2$\pi$ | $-\frac{3\pi}2$ | $-\pi$ | $-\frac{\pi}2$ | 0   | $\frac{\pi}2$ | $\pi$ | $\frac{3\pi}2$ | $2\pi$ |
| ------------------------- | ------- | --------------- | ------ | -------------- | --- | ------------- | ----- | -------------- | ------ |
| $y = \sin \theta$         | 0       | 1                | 0       | -1               | 0    | 1              | 0      | -1               | 0       |
| $y=\frac{1}{\sin \theta}$ | __        | 1                | __       | -1               | __    | 1              | __      | -1               | __       |
________

### Secant
$\sec \theta = \frac{1}{\cos \theta}$ and $\cos \theta$             $\sec \theta = \frac{H}{A} = \frac{r}{x}$

```desmos-graph
left=-2pi; right=2pi;
top=3; bottom=-3;
---
y = \frac{1}{\cos(x)}
y = \cos(x)
```

| $\theta$ | -2$\pi$ | $-\frac{3\pi}2$ | $-\pi$ | $-\frac{\pi}2$ | 0 | $\frac{\pi}2$ | $\pi$ | $\frac{3\pi}2$ | $2\pi$ |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| $y = \cos \theta$ | 1 | 0 | -1 | 0 | 1 | 0 | -1 | 0 | 1 |
| $y=\frac{1}{\cos \theta}$ | 1 | __ | -1 | __ | 1 | __ | -1 | __ | 1 |
Period: 2$\pi$
Range: $y \ge 1 \cap y \le -1$
Domain: $x = \frac{\pi}2 + k\pi\ \ \ k \in \mathbb{Z}$

______
### Cotangent
$y = \cot \theta = \frac{1}{\tan \theta}$
```desmos-graph
left=-2pi; right=2pi;
top=5; bottom=-5;
---
y = \frac{1}{\tan(x)}
y = \tan(x)
```
$y = \tan(x)$ in green
$y = \cot(x)$ in blue
_____
### Theory
### $$\cot \theta = \frac{1}{\tan \theta} = \frac{A}{O} = \frac{x}{y}$$
### $$\sec \theta = \frac{1}{\cos \theta} = \frac{H}A = \frac{r}{x}$$
### $$\csc \theta = \frac{1}{\sin\theta} = \frac{H}{O} = \frac{r}y$$

### Identities

### $$\sin^2\theta + \cos^2\theta \equiv 1$$
$$Dividing\ both\ sides\ by\ \cos^2\theta$$
$$\frac{\sin^2\theta + \cos^2\theta}{\cos^2\theta} = \frac{1}{\cos^2\theta}$$
$$\frac{\sin^2\theta}{cos^2\theta} + \frac{\cos^2\theta}{\cos^2\theta} = \frac{1}{\cos^2\theta}$$

$$\tan^2\theta + 1 = \frac{1}{\cos^2\theta}$$
$$\therefore \tan^2\theta + 1 = \sec^2\theta$$

### $$\sin^2\theta + \cos^2\theta \equiv 1$$
$$Dividing\ both\ sides\ by\ \sin^2\theta$$
$$\frac{\sin^2\theta + \cos^2\theta}{\sin^2\theta} = \frac{1}{\sin^2\theta}$$
$$\frac{1}{\tan^2\theta} + 1 = \csc^2\theta$$
$$\cot^2\theta + 1 = \csc^2\theta$$
____
### Examples
Find $\csc 120^o$ leaving your answer in surd form.
$$\sin120^o = \sin(180^o - 60^o)$$
$$\sin60^o = \frac{\sqrt{3}}2$$
$$\therefore \csc120^o = \frac{2}{\sqrt3}$$



Find the values of $\theta$ in the interval $0^o \le \theta \le 360^o$ for which $\sec^2\theta = 4 + 2\tan\theta$
$$\sec^2\theta = 4 + 2\tan\theta$$
$$1 + \tan^2\theta = 4 + \tan\theta$$
$$\tan^2\theta - 2\tan\theta - 3 = 0$$
$$(\tan\theta - 3)(\tan\theta + 1) = 0$$
$$\tan\theta = 3$$
$$\tan\theta = -1$$
$$\theta \in \set{71^o...}$$
