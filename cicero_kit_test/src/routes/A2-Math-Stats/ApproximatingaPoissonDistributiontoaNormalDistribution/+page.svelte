<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>ApproximatingaPoissonDistributiontoaNormalDistribution</title></svelte:head><div class="note">
   <h1 class="title">Approximating a Poisson Distribution to a Normal Distribution</h1>
<p>- <b>The Poisson distribution can be approximated by the Normal Distribution when <Katex math={"\\lambda"}/> is large. i.e. when <Katex math={"\\lambda > 15"}/></b></p>
<p></p>
<p>- We use a Normal Distribution to approximate the Poisson for a similar reason as the above. i.e. to avoid long and tedious Poisson Calculations.</p>
<p></p>
<p>- Because the Poisson distribution is a discrete distribution and it is being approximated by a continuous Normal distribution, we must ensure that we use a <b>continuity correction!</b></p>
<p></p>
<p><Katex math={"P(x > 98) \\rightarrow P(x > 98.5)"} displayMode/></p>
<p><Katex math={"P(x \\ge 155) \\rightarrow P(x \\ge 154.5)"} displayMode/></p>
<p><Katex math={"P(x = 12) \\rightarrow P(11.5 \\le x \\le 12.5)"} displayMode/></p>
<p><Katex math={"P(x < 97) \\rightarrow P(x < 96.5)"} displayMode/></p>
<p><Katex math={"P(x \\le 18) \\rightarrow P(x \\le 18.5)"} displayMode/></p>
<p><Katex math={"P(52 \\le x < 60) \\rightarrow P(51.5 \\le x < 59.5)"} displayMode/></p>
<h2 class="heading"> <Katex math={"\\mu\\ and\\ \\sigma \\rightarrow \\lambda\\ and\\ \\sqrt{\\lambda}"} displayMode/></h2>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>Assume Manuela posts on average 24 pictures per week.</p>
<p>Find the probability that she posts:</p>
<p>1) 30 pictures</p>
<p>2) Between 24 & 26 pictures</p>
<p></p>
<p>1) Poisson:</p>
<p>   <Katex math={"X \\sim Po(24)"} displayMode/></p>
<p>   <Katex math={"P(x = 30) = \\frac{e^{-24} * 24^{30}}{30!} = 0.0362 (3sf)"} displayMode/></p>
<p>   Normal:</p>
<p>   Because <Katex math={"\\lambda > 15"}/> it is an appropriate approximation.</p>
<p>   <Katex math={"P(x = 30) \\rightarrow P(29.5 \\le x \\le 30.5)"} displayMode/></p>
<p>   <Katex math={"X \\sim N(24, 24)"} displayMode/></p>
<div class="link-container"><a href="//"><h1 class="heading">   !Normal DistributionCalculating Z-value</h1></a></div>
<p>   <Katex math={"\\frac{30.5 - 24}{\\sqrt{24}} \\ge Z \\ge \\frac{29.5 - 24}{\\sqrt{24}}"} displayMode/></p>
<p>   <Katex math={"\\Phi(1.327) - \\Phi(1.123) = 0.0385"} displayMode/></p>
<p>2) Poisson:</p>
<p>   <Katex math={"P(24 \\le x \\le 26)"} displayMode/></p>
<p>   <Katex math={"e^{-24}(\\frac{24^{24}}{24!} + \\frac{24^{25}}{25!} + \\frac{24^{26}}{26!})"} displayMode/></p>
<p>   <Katex math={"= 0.231"} displayMode/></p>
<p>   Normal:</p>
<p>   <Katex math={"P(23.5 \\le x \\le 26.5)"} displayMode/></p>
<p>   <Katex math={"\\frac{26.5-24}{\\sqrt{24}} \\ge Z \\ge \\frac{23.5-24}{\\sqrt{24}}"} displayMode/></p>
<p>   <Katex math={"\\Phi(0.510) - \\Phi(-0.102) = 0.236"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>