<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>ReverseChainRule</title></svelte:head><div class="note">
   <h1 class="title">Reverse Chain Rule</h1>
<div class="link-container"><a href="/AS-Math-Pure/Calculus/ChainRule">Chain Rule</a></div>
<h2 class="heading"> <Katex math={"\\int (ax+b)^n\\ dx = \\frac{(ax+b)^{n+1}}{n+1} * \\frac1{a} + c"} displayMode/></h2>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h3 class="heading"> Example</h3>
<p><Katex math={" \\int (\\frac{x}4 + 3)^3\\ dx"} displayMode/></p>
<p><Katex math={" \\frac{(\\frac{x}4 + 3)^4}{4} * \\frac{1}{\\frac14} + c"} displayMode/></p>
<p><Katex math={" = (\\frac{x}4 + 3)^4 + c"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h3 class="heading"> Example</h3>
<p><Katex math={"\\int \\frac2{3(x-4)^5}\\ dx"} displayMode/></p>
<p><Katex math={"\\frac23 \\int (x-4)^{-5}\\ dx"} displayMode/></p>
<p><Katex math={"= \\frac23 * \\frac{(x-4)^{-4}}{-4} * \\frac11 + c"} displayMode/></p>
<p><Katex math={" = \\frac{2(x-4)^{-4}}{-12} + c"} displayMode/></p>
<p><Katex math={" = -\\frac{1}{6(x-4)^4} + c"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>