<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>BinomialDistribution</title></svelte:head><div class="note">
   <h1 class="title">Binomial Distribution</h1>
<h2 class="heading"> <Katex math={" X \\sim B(n, p)"} displayMode/></h2>
<p></p>
<h4 class="heading"> <Katex math={" E(x) = np"} displayMode/></h4>
<h4 class="heading"> <Katex math={" Var(x) = npq"} displayMode/></h4>
<h2 class="heading"> <Katex math={" p(X = r) = \\begin{pmatrix} n \\\\ r \\end{pmatrix} p ^r q^{n-r}"} displayMode/></h2>
<h2 class="heading"> n - Number of trials</h2>
<h2 class="heading"> p - Probability of event</h2>
<p></p>
<p></p>
<h3 class="heading"> How many</h3>
<p></p>
<p>I.E. What is the probability of getting rolling <u>5 sixes</u> when a die is thrown 12 times.</p>
<p></p>
<h2 class="heading"> Key features</h2>
<p>- Fixed number of trials - n</p>
<p>- Two outcomes only</p>
<p>- Random</p>
<p>- Independent</p>
<h2 class="heading"> <Katex math={" X \\sim B(12, \\frac16)"} displayMode/></h2>
<h2 class="heading"> <Katex math={" p(X = 5) = \\begin{pmatrix} 12 \\\\ 5 \\end{pmatrix} (\\frac16) ^5\\ (\\frac56)^{7}"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> Example</h2>
<p></p>
<p>A factory makes water pistols, 8% of which do not work properly.</p>
<p></p>
<p>1) A random sample of 19 water pistols is taken. Find the probability that at most 2 do not work properly.</p>
<p></p>
<p>2) In a random sample of n water pistols, the probability that at least one does not work properly is greater than 0.9. Find the smallest possible value of n.</p>
<p></p>
<p>3) A random sample of 1800 water pistols is taken. Use an approximation to find the probability that there are at least 152 that do not work properly.</p>
<p></p>
<p>4) Justify the use of your approximation in part (3)</p>
<p></p>
<p></p>
<p>1) <Katex math={" X \\sim B(19, 0.08)"} displayMode/></p>
<p><Katex math={" p(X \\le 2) = p(X = 0) + p(X = 1) + p(X = 2)"} displayMode/></p>
<p><Katex math={" p(X = 0) = \\begin{pmatrix} 19 \\\\ 0 \\end{pmatrix} (0.08)^0\\ (0.92)^{19}"} displayMode/></p>
<p><Katex math={" p(X = 1) = \\begin{pmatrix} 19 \\\\ 1 \\end{pmatrix} (0.08)^1\\ (0.92)^{18}"} displayMode/></p>
<p><Katex math={" p(X = 2) = \\begin{pmatrix} 19 \\\\ 2 \\end{pmatrix} (0.08)^2\\ (0.92)^{17}"} displayMode/></p>
<p><Katex math={" = 0.205 + 0.33886 + 0.26519"} displayMode/></p>
<p><Katex math={" = 0.809\\ (3sf)"} displayMode/></p>
<p></p>
<p></p>
<p>2) </p>
<p><Katex math={" X \\sim B(n,0.08)"} displayMode/></p>
<p><Katex math={" p(X \\ge 1) = 1 - p(0)"} displayMode/></p>
<p><Katex math={" = 1 - p(0.92)^n > 0.90"} displayMode/></p>
<p><Katex math={" 0.1 > (0.92)^n"} displayMode/></p>
<p><Katex math={"n > 27.6"} displayMode/></p>
<p><Katex math={" \\therefore n = 28"} displayMode/></p>
<p></p>
<p></p>
<p></p>
<p>3) </p>
<div class="link-container"><a href="//">Approximating a Binomial Distribution to a Normal Distribution</a></div>
<p></p>
<p><Katex math={" X \\sim N(\\bar{x} , \\sigma{^2}) "} displayMode/></p>
<p><Katex math={" E(x) = 1800 * 0.08 = 144"} displayMode/></p>
<p><Katex math={"\\sigma{^2} = npq = 144 * 0.92 = 132.48"} displayMode/></p>
<p></p>
<p><Katex math={" X \\sim N(144, 132.48)"} displayMode/></p>
<p><Katex math={"p(X \\ge 152) \\rightarrow p(X \\ge 151.5)"} displayMode/></p>
<p><Katex math={"z = \\frac{151.5 - 144}{\\sqrt{132.48}} "} displayMode/></p>
<p><Katex math={" = 0.652\\ (Rounded)"} displayMode/></p>
<p><Katex math={" p = 0.2571"} displayMode/></p>
<p><Katex math={" = 0.257\\ (3sf)"} displayMode/></p>
<p></p>
<p></p>
<p></p>
<p>4) </p>
<p><Katex math={"np > 5\\ and\\ nq > 5"} displayMode/></p>
<p><Katex math={"1800 * 0.08 > 5"} displayMode/></p>
<p><Katex math={"1800 * 0.92"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>