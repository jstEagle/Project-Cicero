<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Euler's-Number</title></svelte:head><div class="note">
   <h1 class="title">Euler's-Number</h1>
<h2 class="heading"> <Katex math={"e = 2.7182818..."} displayMode/></h2>
<h2 class="heading"> <Katex math={"y = e^x"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\ln_ey = x"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\ln e = 1"} displayMode/></h2>
<h2 class="heading"> Fun Facts</h2>
<p>If you compound an investment of <Katex math={"\\"}/>1$, with an interest rate of 100% an infinite number of times, the annual return tends to be e.</p>
<p><Katex math={" A = p(1 + \\frac{r}n)^{nt}"} displayMode/></p>
<p><Katex math={"A = 1(1+\\frac1n)^n"} displayMode/></p>
<p><Katex math={"A = \\lim_{n \\rightarrow \\infty}\\ (1 + \\frac1n)^n"} displayMode/></p>
<p><Katex math={"= 2.7182... = e"} displayMode/></p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Examples</h2>
<p>1) <Katex math={"\\ln e^5"} displayMode/></p>
<p><Katex math={"=5\\ln e"} displayMode/></p>
<p><Katex math={" = 5"} displayMode/></p>
<p>2) <Katex math={"\\ln 0"} displayMode/></p>
<p><Katex math={"= no\\ sol.\\ /\\ -\\infty"} displayMode/></p>
<p>3) <Katex math={"\\ln e^{-3} + \\ln e^12"} displayMode/></p>
<p><Katex math={"-3\\ln e + 12 \\ln e"} displayMode/></p>
<p><Katex math={" = -3 + 12"} displayMode/></p>
<p><Katex math={"= 9"} displayMode/></p>
<p>4) <Katex math={"\\ln (\\frac{1}{e^{24}})"} displayMode/></p>
<p><Katex math={" = \\ln e^{-24}"} displayMode/></p>
<p><Katex math={"= -24 \\ln e = -24"} displayMode/></p>
<p>5) <Katex math={" \\frac{(\\ln e ^2)^6}{(\\ln e^3)^4}"} displayMode/></p>
<p><Katex math={"=\\frac{(2\\ln e)^6}{(3\\ln e)^4}"} displayMode/></p>
<p><Katex math={"= \\frac{2^6}{3^4}"} displayMode/></p>
<p><Katex math={"= \\frac{64}{81}"} displayMode/></p>
<p>6) <Katex math={" 1-2\\ln x = -4"} displayMode/></p>
<p><Katex math={" -2 \\ln x = -5"} displayMode/></p>
<p><Katex math={" \\ln x = \\frac52"} displayMode/></p>
<p><Katex math={"e^{\\frac52} = x"} displayMode/></p>
<p>7) <Katex math={"Make\\ p\\ the\\ subject\\ of\\ \\ln p - \\ln 1-p = t"} displayMode/></p>
<p><Katex math={"\\ln p -\\ln (1-p) = t"} displayMode/></p>
<p><Katex math={"\\ln \\frac{p}{1-p} = t"} displayMode/></p>
<p><Katex math={"e^t = \\frac{p}{1-p}"} displayMode/></p>
<p><Katex math={"e^t(1-p) = p"} displayMode/></p>
<p><Katex math={"e^t - e^tp = p"} displayMode/></p>
<p><Katex math={"e^t = p + e^tp"} displayMode/></p>
<p><Katex math={"\\frac{e^t}{1+e^t} = \\frac{p(1+e^t)}{1+e^t}"} displayMode/></p>
<p><Katex math={"p = \\frac{e^t}{1+e^t}"} displayMode/></p>
<p>8) <Katex math={"e^{2x} + e^x = 6"} displayMode/></p>
<p><Katex math={"e^x = k"} displayMode/></p>
<p><Katex math={"k^2 + k - 6 = 0"} displayMode/></p>
<p><Katex math={"(k+3)(k-2) = 0"} displayMode/></p>
<p><Katex math={"e^x = -3"} displayMode/></p>
<p><Katex math={"No\\ Sol."} displayMode/></p>
<p><Katex math={"e^x = 2"} displayMode/></p>
<p><Katex math={"\\ln 2 = x"} displayMode/></p>
<p><Katex math={"x = 0.693"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>