<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Geometricdistribution</title></svelte:head><div class="note">
   <h1 class="title">Geometric distribution</h1>
<h2 class="heading"> <Katex math={" X \\sim Geo (p)"} displayMode/></h2>
<p><i>When will the event occur?</i></p>
<p></p>
<p>- Discrete data</p>
<p>- Independent</p>
<p>- Random events</p>
<p>- Infinite</p>
<p>- Two events</p>
<p></p>
<p>What is the prob. that you throw a '5' on a single die on the 4th throw?</p>
<p></p>
<p><Katex math={" p(X = 4) = \\frac56*\\frac56*\\frac56*\\frac16 = 0.965\\ (3sf)"} displayMode/></p>
<p><Katex math={"\\frac56"}/> - Failure</p>
<p><Katex math={"\\frac16"}/> - Success</p>
<p></p>
<h2 class="heading"> General formula</h2>
<h3 class="heading"> <Katex math={" p(X = r) = pq^{r-1}"} displayMode/></h3>
<h3 class="heading"> <Katex math={" p(X = 7) = \\frac16 * \\frac56^6 = 0.0558\\ (3sf)"} displayMode/></h3>
<img src="/Attachements/Pastedimage20230819103944.png" alt="diagram">
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Mean</h2>
<p><Katex math={"E(X) = \\frac{1}{p}"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h3 class="heading"> Mode</h3>
<p>Due to the nature of the geometric distribution, the mode is always 1</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h3 class="heading"> Median</h3>
<p>Either trial and error (lame).</p>
<p></p>
<p>or</p>
<p></p>
<h3 class="heading"> <Katex math={"-\\frac{log(2)}{log(1-p)} \\le M \\le 1 - \\frac{log(2)}{log(1-p)} "} displayMode/><Katex math={"M \\epsilon Z"} displayMode/></h3>
<h3 class="divider">Made by jstEagle ;)</h3>
<h3 class="heading"> Sum to Infinity</h3>
<p></p>
<h2 class="heading"> <Katex math={" S_\\infty = \\frac{p}{1-q}"} displayMode/></h2>
<h2 class="heading"> <Katex math={" = \\frac{p}{p}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"= 1"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>Find the probability that fewer than 7 tosses of a coin are required to obtain a pair of heads.</p>
<p><Katex math={" X \\sim Geo(\\frac14)"} displayMode/></p>
<p></p>
<p><Katex math={"p(X<7)"} displayMode/></p>
<p><Katex math={"p(X<7) = 1 - p(X\\ge 7) = 1 - p(X > 6)"} displayMode/></p>
<p><Katex math={"1 - (\\frac34)^6"} displayMode/></p>
<p><Katex math={" = 0.822\\ (3sf)"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>