<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Differential-Equations</title></svelte:head><div class="note">
   <h1 class="title">Differential-Equations</h1>
<p>Newtons law of cooling results in the differential equation: <Katex math={"\\frac{dT}{dt} = k(T- T_0)"}/> </p>
<p>We use differential equations to find information in real life situations.</p>
<p></p>
<p>- A differential equation is an equation involving derivatives</p>
<p>- Recall that <Katex math={"\\frac{dy}{dx} = ..."}/> represents the rate of change of y with respect to x</p>
<p>- With extra information we can solve DE's by integrating and finding <Katex math={"y=... or f(x)=..."}/></p>
<p>- The position of an object is its distance from the origin O in the direction you have chosen to define as being positive.</p>
<p>- The rate of change of position of the object with respect to time is its velocity, and this can take positive or negative values according to whether the object is moving away from the origin of towards it.</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> <Katex math={" k \\propto v = kv"} displayMode/></h2>
<h2 class="heading"> <Katex math={"k \\propto \\frac1v = \\frac{k}v"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>The area <Katex math={"A"}/> of a square is increasing at a rate proportional to the length of its side s. The constant of the proportionality is <Katex math={"k"}/>. Find an expression for <Katex math={"\\frac{ds}{dt}"}/></p>
<p><Katex math={"\\frac{dA}{dt} * \\frac{ds}{dA} = \\frac{ds}{dt}"} displayMode/></p>
<p><Katex math={"\\frac{dA}{dt} = ks"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"A = s^2"} displayMode/></p>
<p><Katex math={"\\frac{dA}{ds} = 2s"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"\\frac{ds}{dt} = ks * \\frac1{2s}"} displayMode/></p>
<p><Katex math={"= \\frac{k}2"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Solving differential equations</h2>
<p>This just mean finding the original equation. i.e. integrating</p>
<p></p>
<h2 class="heading"> Example 1</h2>
<p>Solve the differential equation <Katex math={"\\frac{dy}{dx} = 3x^2 - 2"}/></p>
<p><Katex math={"\\int 3x^2 - 2 *dx"} displayMode/></p>
<p><Katex math={"=\\frac{3x^3}{3} - 2x + c"} displayMode/></p>
<p><Katex math={"= x^3 - 2x + c"} displayMode/></p>
<p></p>
<p></p>
<h2 class="heading"> Example 2</h2>
<p>Find for <Katex math={"y>0"}/>, the general solution of the differential equation <Katex math={"\\frac{dy}{dx} = xy"}/></p>
<p><Katex math={"\\frac{1}{y}*\\frac{dy}{dx} = x"} displayMode/></p>
<p><Katex math={"\\int\\frac{1}y * \\frac{dy}{\\cancel{dx}} * \\cancel{dx} = \\int x * dx"} displayMode/></p>
<p><Katex math={"\\int \\frac1y * dy = \\int x*dx"} displayMode/></p>
<p><Katex math={"ln|y| + c = \\frac{x^2}2 + c"} displayMode/></p>
<p><Katex math={"y = e^{\\frac{x^2}{2} + c}"} displayMode/></p>
<p><Katex math={"y = e^{\\frac{x^2}{2}} * e^c"} displayMode/></p>
<p><Katex math={"e^c = A"} displayMode/></p>
<p><Katex math={"y = Ae^{\\frac{x^2}{2}}"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>