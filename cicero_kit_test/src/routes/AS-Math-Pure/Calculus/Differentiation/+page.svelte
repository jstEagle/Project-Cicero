<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Differentiation</title></svelte:head><div class="note">
   <h1 class="title">Differentiation</h1>
<p><Katex math={"f(x) = x^{-1}(2x^{-2}-\\sqrt{x})"} displayMode/></p>
<p><Katex math={"= x^{-1}(2x^{-2}-x^{\\frac12})"} displayMode/></p>
<p><Katex math={"= 2x^{-3}-x^{-\\frac12}"} displayMode/></p>
<p><Katex math={"=-6x^{-4}+x^{-\\frac32}"} displayMode/></p>
<p><Katex math={"=\\frac{-6}{x^4}+\\frac{1}{x^{\\frac32}}"} displayMode/></p>
<p><Katex math={"=\\frac{-6}{x^4} + \\frac{1}{\\sqrt{x^3}}"} displayMode/></p>
<p></p>
<h1 class="heading"> Stationary points</h1>
<p></p>
<h2 class="heading"> Min & Max</h2>
<p></p>
<img src="/Attachements/Pastedimage20230803111427.png" alt="diagram">
<p></p>
<p>When m = 0. This means that the gradient of the tangent it 0.</p>
<p>Left and right of this tangent, any other tangents drawn are expected to have a non-zero gradient and a change of sign left and right of the turning point is expected.</p>
<p></p>
<img src="/Attachements/Pastedimage20230803111946.png" alt="diagram">
<p></p>
<p>2 turning points means that the discriminant of the function f'(x) is > 0</p>
<p></p>
<p>1 turning point means that the discriminant of the function f'(x) is = 0</p>
<p></p>
<p>Point of inflection means that the discriminant of the function f'(x) <Katex math={"<"} inline/> 0, meaning that the graph f'(x) has non-real roots.</p>
<p></p>
<h2 class="heading"> Points of Inflection</h2>
<p></p>
<img src="/Attachements/Pastedimage20230803112405.png" alt="diagram">
<p>The point of inflection is a change in concavity.</p>
<p></p>
<p></p>
<h1 class="heading"> Method for finding the Nature of the turning points of a graph</h1>
<p></p>
<p>Take the second derivative of the function.</p>
<p></p>
<p>Plug in the roots of the first derivative of the function into the second derivative.</p>
<p></p>
<p>A negative solution to the previous step means that the turning point is a maximum.</p>
<p>A positive solution to the previous step means that the turning point is a minimum.</p>
<p></p>
<h2 class="heading"> Increasing = gradient is positive</h2>
<p></p>
<h2 class="heading"> Decreasing = gradient is negative</h2>
<p></p>
<p></p>
<h2 class="heading"> Example</h2>
<p><Katex math={"y=2x^3-3x^2"} displayMode/></p>
<p><Katex math={"\\frac{dy}{dx} = 6x^2-6x"} displayMode/></p>
<p><Katex math={"6x^2-6x"} displayMode/></p>
<p><Katex math={"=x^2-x"} displayMode/></p>
<p><Katex math={"0 = x(x-1)"} displayMode/></p>
<p><Katex math={"x = 0\\ or\\ x = 1"} displayMode/></p>
<p></p>
<p><Katex math={"\\frac{d^2y}{dx^2} = 12x - 6"} displayMode/></p>
<p><Katex math={"tp - (0,0)\\ and\\ (1,-1)"} displayMode/></p>
<p><Katex math={"(0,0)-Maximum"} displayMode/></p>
<p><Katex math={"(1,-1)-Minimum"} displayMode/></p>
</div>