<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>ApproximatingaBinomialdistributiontoaPoissondistribution</title></svelte:head><div class="note">
   <h1 class="title">Approximating a Binomial distribution to a Poisson distribution</h1>
<p>In binomial cases where p is either very large or very small, and n is very large, the binomial distribution <Katex math={"X \\sim B(n, p)"}/> can be approximated by the Poisson distribution.</p>
<p></p>
<p><b>Why does it work?</b></p>
<p><Katex math={"X \\sim B(n, p)"}/></p>
<p></p>
<p>1 meter of pipe has 4 defects <Katex math={"\\lambda = 4"}/> </p>
<p>If we cut it into 10 pieces then <Katex math={"n = 10 \\rightarrow 0.4\\ defects / 10cm"}/></p>
<p><Katex math={"n = 100 \\rightarrow 0.04 / 1cm"}/></p>
<p></p>
<p><Katex math={"\\therefore\\ suited\\ to\\ X \\sim B(n, \\frac4n)"} displayMode/></p>
<p><Katex math={"X \\sim B(100, \\frac4{100})"} displayMode/></p>
<p>i.e. pipe cut into 100 pieces, with a probability of <Katex math={"\\frac4{100}"}/> that a defect is present in any one piece.</p>
<p></p>
<p>Since the event is so rare: <Katex math={"prob > 1\\ defect"}/> is tiny <Katex math={"\\therefore"}/> two outcomes: One defect / Not one defect.</p>
<p></p>
<p><Katex math={"X \\sim B(n, \\frac4n)"} displayMode/></p>
<p><Katex math={"E(x) = n*p = n * \\frac4n = 4"} displayMode/></p>
<p><Katex math={"Var(x) = n * p * q= n * \\frac4n * (1 - \\frac4n)"} displayMode/></p>
<p><Katex math={"= 4 * (1 - \\frac4n)"} displayMode/></p>
<p><Katex math={"= 4 - \\frac{16}n = 4"} displayMode/></p>
<p><Katex math={"n \\rightarrow \\infty"} displayMode/></p>
<p><Katex math={"\\frac{16}{n} \\rightarrow 0"} displayMode/></p>
<p><Katex math={"\\therefore Var(x) = E(x)"} displayMode/></p>
<div class="link-container"><a href="//">So Poisson Distribution is suitable when n is very large. And <Katex math={"p \\rightarrow 0"}/> or <Katex math={"q \\rightarrow 0"}/>.</a></div>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> <Katex math={"\\lambda = np"} displayMode/></h2>
<h2 class="heading"> <Katex math={"n > 50"} displayMode/></h2>
<h2 class="heading"> <Katex math={"n*p < 5"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> Example</h2>
<p>It is known that nationally one person in a thousand is allergic to a particular chemical used in making a wood preservative. A firm that makes this wood preservative employs 500 people in one of its factories.</p>
<p></p>
<p>What is the probability that more than two people at the factory are allergic to the chemical?</p>
<p></p>
<p><Katex math={"X \\sim B(500, 0.001)"} displayMode/></p>
<p><Katex math={"p(x > 2) = 1 - p(x \\le 2)"} displayMode/></p>
<p><Katex math={"= 1 - (p(x = 0) + p(x = 1) + p(x = 2))"} displayMode/></p>
<p><Katex math={"= 1 - (0.999^{500} + 500 * 0.001 * 0.999^{499} + \\begin{pmatrix} 500 \\\\ 2 \\end{pmatrix} * 0.001^2 * 0.999^{498})"} displayMode/></p>
<p><Katex math={"= 0.0143"} displayMode/></p>
<p><Katex math={"n*p = 0.5\\ and\\ n > 50"} displayMode/></p>
<p><Katex math={"X \\sim Po(0.5)"} displayMode/></p>
<p><Katex math={"p(x > 2) = 1 - p(x \\le 2)"} displayMode/></p>
<p><Katex math={"= 1 - e^{-0.5} * (1 + 0.5 + \\frac{0.5^2}{2!}) = 0.0144"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>