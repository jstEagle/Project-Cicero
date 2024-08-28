<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>PoissonDistribution</title></svelte:head><div class="note">
   <h1 class="title">Poisson Distribution</h1>
<h2 class="heading"> <Katex math={"X \\sim Po(\\lambda)"} displayMode/></h2>
<h2 class="heading"> <Katex math={"P(X=x) = \\frac{e^{-\\lambda}*\\lambda^x}{x!}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\lambda = E(x) = Var(x)"} displayMode/></h2>
<p><b>The Poisson distribution is where discrete and infinite events occur in continuous but finite intervals of time or space.</b></p>
<p></p>
<p><i>It is sometimes known as the distribution of rare events</i></p>
<p></p>
<p>eg</p>
<p>The number of earthquakes per year (the number of earthquakes is discrete, and the one year time period is continuous but finite time interval)</p>
<p></p>
<p>The number of misprints on a page (the number of misprints is discrete, and the one page is the continuous but finite period of space)</p>
<p></p>
<p>The number of defects in a 5km telecommunication cable</p>
<p></p>
<p>- In theory there is not upper limit to the number of events</p>
<p>- The parameter for the Poisson distribution is <Katex math={"X \\sim Po(\\lambda)"}/> That is because the mean and variance of a Poisson distribution are equal, hence a Poisson distribution has only one parameter.</p>
<p>- Compare this with the binomial distribution which has two parameters, n and p</p>
<p></p>
<p>The following conditions must apply for a Poisson distribution:</p>
<p>1) Each event is independent of the next</p>
<p>2) Events cannot occur simultaneously</p>
<p>3) for small intervals the probability of the event occurring is proportional to the size of the interval</p>
<p></p>
<h2 class="heading"> Grains of rice on chessboard</h2>
<p></p>
<p>| Number of grains                             | 0     | 1     | 2      | 3     | 4     | 5     | 6      | >6    |</p>
<p>| -------------------------------------------- | ----- | ----- | ------ | ----- | ----- | ----- | ------ | ----- |</p>
<p>| Number of squares                            | 11    | 8     | 12     | 5     | 3     | 3     | 4      | 18    |</p>
<p>| Relative freq. (/64)                         | 0.172 | 0.125 | 0.1875 | 0.078 | 0.046 | 0.046 | 0.0625 | 0.281 |</p>
<p>| <Katex math={"P(X=x) = \\frac{e^{-\\lambda}*\\lambda^x}{x!}"}/> |       |       |        |       |       |       |        |       |</p>
<p><Katex math={"E(x) = 3.8"} displayMode/></p>
<p><Katex math={"Var(x) = 9.35"} displayMode/></p>
<p><b>This is not a Poisson distribution</b></p>
<p></p>
</div>