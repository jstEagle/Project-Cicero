<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Differentiating-trigonometric-functions</title></svelte:head><div class="note">
   <h1 class="title">Differentiating-trigonometric-functions</h1>
<h2 class="heading"> <Katex math={"y=\\cos(x) \\rightarrow \\frac{dy}{dx} = -\\sin(x)"} displayMode/></h2>
<h2 class="heading"> <Katex math={"y=\\sin(x) \\rightarrow \\frac{dy}{dx} = \\cos(x)"} displayMode/></h2>
<h2 class="heading"> <Katex math={"y=\\tan(x) \\rightarrow \\frac{dy}{dx} = \\sec^2(x)"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> <Katex math={"y = \\cos(kx) \\rightarrow \\frac{dy}{dx} = -k\\sin(kx)"} displayMode/></h2>
<h2 class="heading"> <Katex math={"y = \\sin(kx) \\rightarrow \\frac{dy}{dx} = k\\cos(kx)"} displayMode/></h2>
<h2 class="heading"> <Katex math={"y = \\tan(kx) \\rightarrow \\frac{dy}{dx} = k\\sec^2(kx)"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> <Katex math={"f(x) = \\sin(x)"} displayMode/></h2>
<img src="/graphs/Differentiatingtrigonometricfunctions0.png" alt="graph">
<h2 class="heading"> <Katex math={"f'(x) = \\cos(x)"} displayMode/></h2>
<img src="/graphs/Differentiatingtrigonometricfunctions1.png" alt="graph">
<p>_All this is only true if the angle is measured in RADIANS!_</p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Proof</h2>
<p><Katex math={"\\frac{d}{dx}(\\sin(x))"} displayMode/></p>
<p><Katex math={"=\\lim_{h \\rightarrow 0} \\frac{\\sin(x + h) - \\sin(x)}{h}"} displayMode/></p>
<p><Katex math={"=\\lim_{h \\rightarrow 0} \\frac{\\sin(x)*\\cos(h) + \\sin(h)*\\cos(x) - \\sin(x)}{h}"} displayMode/></p>
<p><Katex math={"=\\lim_{h \\rightarrow 0} \\frac{\\sin(x)*\\cos(h)-\\sin(x)+\\sin(h)*\\cos(x)}{h}"} displayMode/></p>
<p><Katex math={"=\\lim_{h \\rightarrow 0} \\frac{\\sin(x)*(\\cos(h) - 1)}{h} + \\frac{\\sin(h)*\\cos(x)}{h}"} displayMode/></p>
<p><Katex math={"=\\sin(x)\\ \\lim_{h \\rightarrow 0} \\frac{\\cos(h) -1}{h} \\rightarrow 0\\ \\ \\ \\ \\ + \\cos(x)\\ \\lim_{h \\rightarrow 0} \\frac{\\sin(h)}{h}\\rightarrow 1"} displayMode/></p>
<p><Katex math={"=\\sin(x)*(0) + \\cos(x)*(1)"} displayMode/></p>
<p><Katex math={"=\\cos(x)"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>