<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Randomdiscretevariable</title></svelte:head><div class="note">
   <h1 class="title">Random discrete variable</h1>
<p>In probability theory and statistics, <b>discrete random variables</b> are essential tools for modeling and analyzing random phenomena. A discrete random variable is a variable that takes on a countable number of distinct values, each with an associated probability.</p>
<p></p>
<h2 class="heading"> Notation</h2>
<p></p>
<p>Discrete random variables are often denoted by capital letters, such as <Katex math={"X"} inline/>, <Katex math={"Y"} inline/>, or <Katex math={"Z"} inline/>. The possible values that a discrete random variable can take are represented as <Katex math={"x"} inline/>, <Katex math={"y"} inline/>, <Katex math={"z"} inline/>, etc.</p>
<p></p>
<h2 class="heading"> Probability Mass Function (PMF)</h2>
<p></p>
<p>The probability mass function (PMF) of a discrete random variable <Katex math={"X"} inline/>, denoted as <Katex math={"P(X = x)"} inline/>, defines the probability that <Katex math={"X"} inline/> takes on a particular value <Katex math={"x"} inline/>. The PMF satisfies two crucial properties:</p>
<p></p>
<p>1. <b>Non-negativity</b>: For all <Katex math={"x"} inline/>, <Katex math={"P(X = x)"} inline/>.</p>
<p>2. <b>Summation to 1</b>: The sum of the probabilities over all possible values of (X) equals 1.</p>
<p></p>
<p><Katex math={"sum_{x} P(X = x) = 1"}/></p>
<p></p>
<h2 class="heading"> Expected Value (Mean)</h2>
<p></p>
<p>The expected value (or mean) of a discrete random variable <Katex math={"(X)"} inline/>, denoted as <Katex math={"(E(X))"} inline/> or <Katex math={"(mu)"} inline/>, represents the average value of <Katex math={"(X)"} inline/> and is calculated as the weighted sum of all possible values of <Katex math={"(X)"} inline/>, weighted by their respective probabilities.</p>
<p></p>
<p><Katex math={"E(X) = sum_{x} x . P(X = x)"}/></p>
<p></p>
<h2 class="heading"> Variance</h2>
<p></p>
<p>The variance of a discrete random variable <Katex math={"X"} inline/>, denoted as <Katex math={"text{Var}(X)"} inline/>, measures the spread or dispersion of <Katex math={"X"} inline/>'s values. It quantifies how much <Katex math={"X"} inline/> varies from its expected value. The formula for variance is:</p>
<p></p>
<p><Katex math={"text{Var}(X) = sum_{x} x^2 . P(X = x) - E(X)^2"}/></p>
<p></p>
<p>Where:</p>
<p>- <Katex math={"x"} inline/> represents each possible value of <Katex math={"X"} inline/>.</p>
<p>- <Katex math={"P(X = x)"} inline/> is the probability of <Katex math={"X"} inline/> taking the value <Katex math={"x"} inline/>.</p>
<p>- <Katex math={"E(X)"} inline/> is the expected value of <Katex math={"X"} inline/>.</p>
<p></p>
<h2 class="heading"> Example: Rolling a Fair Six-Sided Die</h2>
<p></p>
<p>Let's illustrate these concepts with an example of a discrete random variable: rolling a fair six-sided die (D6). The possible values of \\(X\\) (the outcome) are {1, 2, 3, 4, 5, 6}, each with equal probability:</p>
<p></p>
<p><Katex math={"P(X = 1) = P(X = 2) = P(X = 3) = P(X = 4) = P(X = 5) = P(X = 6) = \\frac{1}{6}"}/></p>
<p></p>
<p>The PMF is a table representing these probabilities:</p>
<p></p>
<p>|   x   | 1 | 2 | 3 | 4 | 5 | 6 |</p>
<p>|:-----:|---|---|---|---|---|---|</p>
<p>| P(X=x)|1/6|1/6|1/6|1/6|1/6|1/6|</p>
<p></p>
<p>To calculate the expected value:</p>
<p></p>
<p><Katex math={"E(X) = \\sum_{x} x . P(X = x) = (1 . \\frac{1}{6}) + (2 . \\frac{1}{6}) + (3 . \\frac{1}{6}) + (4 . \\frac{1}{6}) + (5 . \\frac{1}{6}) + (6 . \\frac{1}{6}) = \\frac{7}{2}"}/></p>
<p></p>
<p>Now, let's calculate the variance using the formula:</p>
<p></p>
<p><Katex math={"\\text{Var}(X) = \\sum_{x} x^2 . P(X = x) - E(X)^2 \\\\\\left[(1^2 . \\frac{1}{6}) + (2^2 . \\frac{1}{6}) + (3^2 . \\frac{1}{6}) + (4^2 . \\frac{1}{6}) + (5^2 . \\frac{1}{6}) + (6^2 . \\frac{1}{6})\\right] - \\left(\\frac{7}{2}\\right)^2 \\\\\\frac{35}{12}"}/></p>
<p></p>
<p>So, the variance of rolling a fair six-sided die is <Katex math={"(\\frac{35}{12})"}/>.</p>
</div>