<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Quotient-Rule</title></svelte:head><div class="note">
   <h1 class="title">Quotient Rule</h1>
<h2 class="heading"> <Katex math={"if\\ h(x) = \\frac{f(x)}{g(x)}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\downarrow"} displayMode/></h2>
<h2 class="heading"> <Katex math={" h'(x) = \\frac{g(x)f'(x) - f(x)g'(x)}{[g(x)]^2}"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> <Katex math={" \\frac{dy}{dx} = \\frac{v\\frac{du}{dx} - u\\frac{dv}{dx}}{v^2}"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> <Katex math={"d(\\frac{u}{v}) = \\frac{du*v - dv*u}{v^2}"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Proof</h2>
<p><Katex math={"q(x) = \\frac{f(x)}{g(x)} = f(x) * (g(x))^{-1}"} displayMode/></p>
<p><Katex math={"using\\ the\\ product\\ law"} displayMode/></p>
<p><Katex math={"q'(x) = f'(x) * (g(x))^{-1} + Dx[(g(x))^{-1}]*f(x)"} displayMode/></p>
<p><Katex math={"Dx[(g(x))^{-1}]\\ use\\ chain\\ rule\\ \\downarrow"} displayMode/></p>
<p><Katex math={"= -1(g(x))^{-2} * g'(x)"} displayMode/></p>
<p><Katex math={"\\therefore q'(x) = \\frac{f'(x)}{g(x)} + \\frac{f(x) * -g'(x)}{g(x)^2}"} displayMode/></p>
<p><Katex math={" = \\frac{f'(x)g(x) - f(x)g'(x)}{g(x)^2}"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
</div>