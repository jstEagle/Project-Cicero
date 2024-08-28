<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Numerical-Methods</title></svelte:head><div class="note">
   <h1 class="title">Numerical Methods</h1>
<p>Whenever possible we try to find the root of equations using algebraic methods. However when this doesn't work another way of finding them is to use numerical methods.</p>
<p></p>
<p>Numerical methods are methods used to find the roots of functions that cannot be found algebraically or can only be found with great difficulty.</p>
<p></p>
<h4 class="heading"> Always:</h4>
<p>- Use algebra if possible</p>
<p>- Sketch graph to see roots easier</p>
<p>- Always state the degree of accuracy</p>
<p></p>
<h2 class="heading"> Interval estimation - change of sign methods</h2>
<p>when looking for roots we are looking for the x-intercept (x , 0) where f(x) = 0.</p>
<p><Katex math={"\\therefore"}/> we are looking for the points at which the y-value changes from positive to negative or the other way round.</p>
<p></p>
<h4 class="heading"> Method 1 - sketch</h4>
<p><Katex math={"f(x) = x^3 + 3x - 5"} displayMode/></p>
<img src="/graphs/NumericalMethods0.png" alt="graph">
<p><Katex math={"\\therefore\\ we\\ can\\ tell\\ that\\ the\\ interval\\ in\\ which\\ the\\ root\\ lies\\ is\\ [1, 2]"} displayMode/></p>
<p></p>
<h4 class="heading"> Method 2 - sub in values into <Katex math={"f(x)"}/> until sign changes</h4>
<p><Katex math={"e^x - x = x^2 + 2"} displayMode/></p>
<p><Katex math={"e^x - x - x^2 - 2 = 0"} displayMode/></p>
<p><Katex math={"f(2) = -0.61"} displayMode/></p>
<p><Katex math={"f(3) = 6.0855"} displayMode/></p>
<p><Katex math={"\\therefore \\ interval:\\ [2,3]"} displayMode/></p>
<p></p>
<h4 class="heading"> Method 3 - Compare the two sides of the equation</h4>
<p><Katex math={"e^x - x < x^2 + 2"} displayMode/></p>
<p><Katex math={"e^x - x > x^2 + 2"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"e^2 - 2 < (2)^2 + 2"} displayMode/></p>
<p><Katex math={"= 5.39 < 6"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"e^3 - 3 > 3^2 + 2"} displayMode/></p>
<p><Katex math={"= 17 > 11"} displayMode/></p>
<p><Katex math={"Change\\ of\\ sign\\ indicates\\ the\\ interval\\ is\\ [2,3]"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Decimal Search</h2>
<p><Katex math={"f(x) = x^5 - 5x + 3"} displayMode/></p>
<p></p>
<p>| x   | 0   | 0.1 | 0.2 | 0.3 | 0.4 | 0.5 | 0.6 | 0.7 | 0.8 | 0.9 | 1.0 |</p>
<p>| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |</p>
<p>| y   | +   | +   | +   | +   | +   | +   | +   | -   | -   | -   | -   |</p>
<p><Katex math={"\\therefore interval\\ [0.6, 0.7]"} displayMode/></p>
<p>Change step to 0.01</p>
<p></p>
<p>| x   | 0.6 | 0.61 | 0.62 | 0.63 | 0.64 | 0.65 | 0.66 | 0.67 | 0.68 |</p>
<p>| --- | --- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |</p>
<p>| y   | +   | +    | -    | -    | -    | -    | -    | -    | -    |</p>
<p><Katex math={"\\therefore interval\\ [0.61, 0.62]"} displayMode/></p>
<p>Change step to 0.001</p>
<p></p>
<p>| x   | 0.616 | 0.617 | 0.618 | 0.619 | 0.62 |</p>
<p>| --- | ----- | ----- | ----- | ----- | ---- |</p>
<p>| y   | +     | +     | +     | -     | -    |</p>
<p><Katex math={"\\therefore interval\\ [0.618, 0.619]"} displayMode/></p>
<p>Rounded to 2 decimal places: <Katex math={"x = 0.62"}/></p>
<p>Since the root lies in the interval <Katex math={"[0.618, 0.619]"}/> we can also say that the root is 0.6185 with a maximum error of 0.0005.</p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Interval Bisection</h2>
<p>The interval is divided into 2 parts - it is bisected. This method is usually quite slow to converge to the root, and is cumbersome when performed manually.</p>
<p><Katex math={"x^5 - 5x + 3 = 0"} displayMode/></p>
<p><Katex math={"interval:\\ [0, 1]"} displayMode/></p>
<p><Katex math={"f(0.5)> 0"} displayMode/></p>
<p><Katex math={"f(1) < 0"} displayMode/></p>
<p><Katex math={"\\therefore value\\ is\\ inbetween"} displayMode/></p>
<p><Katex math={"[0.5, 1]"} displayMode/></p>
<p><Katex math={"\\frac{0.5 + 1}{2} = 0.75"} displayMode/></p>
<p><Katex math={"f(0.5) > 0"} displayMode/></p>
<p><Katex math={"f(0.75) < 0"} displayMode/></p>
<p><Katex math={"\\dots"} displayMode/></p>
<p><Katex math={"[0.5625, 0.625]"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Fixed Point Iteration</h2>
<p>You find a single value or point as your estimate for the value of x, rather than establishing an interval within which it must lie. This involves an iterative process, a method of generating a sequence of numbers by continued repetition of the same procedure. If the numbers obtained in this manner approach some limiting value, then they are said to converge to this value.</p>
</div>