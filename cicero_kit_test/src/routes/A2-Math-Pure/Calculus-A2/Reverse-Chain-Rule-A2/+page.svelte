<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Reverse-Chain-Rule-A2</title></svelte:head><div class="note">
   <h1 class="title">Reverse Chain Rule A2</h1>
<h2 class="heading"> <Katex math={"\\int g(x)^n *dx = \\frac{g(x)^{n+1}}{n+1} * \\frac{1}{g'(x)} "} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\int(4x+5)^6 * dx = \\frac{(4x+5)^7}{7} * \\frac{1}{4} "} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<h2 class="heading"> <Katex math={"\\int 2x(x^2 + 1)^3 * dx"} displayMode/></h2>
<p><Katex math={"let\\ (x^2 + 1) = u"} displayMode/></p>
<p><Katex math={"\\frac{du}{dx} = 2x"} displayMode/></p>
<p><Katex math={"\\therefore du = 2x*dx"} displayMode/></p>
<p><Katex math={"\\int 2x(u)^3 * dx"} displayMode/></p>
<p><Katex math={" = \\int u^3 * du"} displayMode/></p>
<p><Katex math={"= \\frac{u^4}{4}"} displayMode/></p>
<p><Katex math={"= \\frac{(x^2 + 1)^4}{4}"} displayMode/></p>
</div>