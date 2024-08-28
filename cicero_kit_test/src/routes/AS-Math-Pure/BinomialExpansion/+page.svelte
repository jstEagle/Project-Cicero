<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>BinomialExpansion</title></svelte:head><div class="note">
   <h1 class="title">Binomial Expansion</h1>
<h2 class="heading"> <Katex math={"(a+b)^n =... + \\begin{pmatrix} n \\\\ r \\end{pmatrix}a^{n-r}\\ b^r +..."} displayMode/></h2>
<h2 class="heading"> <Katex math={"(a+b)^n = \\sum^n_{k=0}\\begin{pmatrix} n \\\\ k \\end{pmatrix} a^{n-k} \\ b^k"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>Find the term independent of x in the expansion of <Katex math={"(\\frac{2}{x} - 3x)^6"}/> </p>
<p></p>
<p><Katex math={"\\begin{pmatrix} 6 \\\\ r \\end{pmatrix} (\\frac{2}{x})^{6-r} (-3x)^r"} displayMode/></p>
<p><Katex math={"(\\frac{1}{x})^{6-r}(-3x)^r"} displayMode/></p>
<p><Katex math={"\\frac{x^r}{x^{6-r}} = x^0"} displayMode/></p>
<p><Katex math={"x^{r-6+r} = x^0"} displayMode/></p>
<p><Katex math={"2r-6 = 0"} displayMode/></p>
<p><Katex math={"2r = 6"} displayMode/></p>
<p><Katex math={"r = 3"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"\\begin{pmatrix} 6 \\\\ 3 \\end{pmatrix} (\\frac{2}{x})^{3} (-3x)^3"} displayMode/></p>
<p><Katex math={" = -4320"} displayMode/></p>
<p></p>
<p></p>
<p>Find the value of a for which there is no term independent of x in the expansion</p>
<p></p>
<p><Katex math={"(1+ax^2)(\\frac{2}{x} - 3x)^6"} displayMode/></p>
<p><Katex math={"(1+ax^2)(-4320 + ......)"} displayMode/></p>
<p><Katex math={"\\frac{x^r}{x^{6-r}} = x^{-2}"} displayMode/></p>
<p><Katex math={"2r - 6 = -2"} displayMode/></p>
<p><Katex math={"2r = 4"} displayMode/></p>
<p><Katex math={"r = 2"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"\\begin{pmatrix} 6 \\\\ 2 \\end{pmatrix} (\\frac{2}{x})^{4} (-3x)^2"} displayMode/></p>
<p><Katex math={"(1+ax^2)(-4320 + \\begin{pmatrix} 6 \\\\ 2 \\end{pmatrix} (\\frac{2}{x})^{4} (-3x)^2)"} displayMode/></p>
<p><Katex math={"(1 + ax^2)(...+\\frac{2160}{x^2} - 4320 + ...)"} displayMode/></p>
<p><Katex math={"-4320 + 2160a = 0"} displayMode/></p>
<p><Katex math={"2160a = 4320"} displayMode/></p>
<p><Katex math={"a = 2"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>