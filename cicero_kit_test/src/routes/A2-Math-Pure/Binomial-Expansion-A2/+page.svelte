<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Binomial-Expansion-A2</title></svelte:head><div class="note">
   <h1 class="title">Binomial Expansion-A2</h1>
<h2 class="heading"> <Katex math={"(1 + x)^n = 1 + nx + \\frac{n(n-1)}{2!}*x^2 + \\frac{n(n-1)(n-2)}{3!}*x^3 + ... + \\frac{n(n-1)...(n-r + 1)}{r!}*x^r"} displayMode/></h2>
<p><b>Only works when the format is <Katex math={"(1 + x)^n"}/> and with the restriction <Katex math={"|x| < 1"}/>.</b></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>Expand <Katex math={"(1 + x)^4"}/> using the binomial theorem</p>
<p><Katex math={"(1 + x)^4 = 1 + 4x + \\frac{4(3)}{2!}*x^2 + \\frac{4(3)(2)}{3!}*x^3 + \\frac{4(3)(2)(1)}{4!}*x^4 + \\frac{4(3)(2)(1)(0)}{5!}*x^5 "} displayMode/></p>
<p><Katex math={"= 1 + 4x + 6x^2 + 4x^3 + x^4 + 0"} displayMode/></p>
<p><Katex math={"= 1 + 4x + 6x^2 + 4x^3 + x^4"} displayMode/></p>
<p><Katex math={"|x| < 1"} displayMode/></p>
<p></p>
<p></p>
<p>Expand <Katex math={"(1 + x)^{-3}"}/> using the binomial theorem</p>
<p><Katex math={"(1 + x)^{-3} = 1 - 3x + \\frac{-3(-4)}{2!}*x^2 + \\frac{-3(-4)(-5)}{3!}*x^3 + \\frac{-3(-4)(-5)(-6)}{4!}*x^4 + \\dots"} displayMode/></p>
<p><Katex math={"=1 - 3x "} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>Expand <Katex math={"(2-3x)^{-2}"}/> in ascending power of <Katex math={"x"}/>, up to and including the term in <Katex math={"x^2"}/>, simplifying the coefficients.</p>
<p><Katex math={"(2-3x)^{-2} = (2(1-\\frac32x))^{-2}"} displayMode/></p>
<p><Katex math={"= \\frac14(1 - \\frac32x)^{-2}"} displayMode/></p>
<p><Katex math={"= \\frac14(1 + (-2)(-\\frac32x) + \\frac{-2(-3)}{2!}(-\\frac32x)^2 + \\dots)"} displayMode/></p>
<p><Katex math={"=\\frac14(1 + 3x + \\frac{27}{4}x^2 + \\dots)"} displayMode/></p>
<p><Katex math={"= \\frac14 + \\frac34x + \\frac{27}{16}x^2 + \\dots"} displayMode/></p>
<p><Katex math={"\\downarrow "} displayMode/></p>
<p><Katex math={"|-\\frac32x| < 1"} displayMode/></p>
<p><Katex math={"|x| < \\frac23"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p>You might need to use partial fractions before being able to expand.</p>
<div class="link-container"><a href="//"><h1 class="heading">!Partial Fractions<Katex math={" frac{px + q}{(ax + b)(cx + d)(ex + f)} equiv frac{A}{(ax + b)} + frac{B}{(cx + d)} + frac{C}{(ex + f)}"} displayMode/>|Partial Fractions Standard Formula</h1></a></div>
</div>