<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>LinearCombinationsofRandomVariables</title></svelte:head><div class="note">
   <h1 class="title">Linear Combinations of Random Variables</h1>
<h2 class="heading"> E(X) = + or -</h2>
<h2 class="heading"> Var(X) = ALWAYS +</h2>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h4 class="heading"> Distributions:</h4>
<div class="link-container"><a href="//"><h1 class="heading">Example|Random Discrete Variable (Binomial)</h1></a></div>
<div class="link-container"><a href="//"><h1 class="heading">Normal Distribution</h1></a></div>
<div class="link-container"><a href="//"><h1 class="heading">Poisson Distribution</h1></a></div>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<div class="link-container"><a href="//">Random discrete variable</a></div>
<p>Consider the following spinner. When it is spun it is equally likely to land on any one of the sections, | 3 | 3 | 3 | 3 | 3 | 2 | 2 | 1 |.</p>
<p>1. If X is the random variable landing on one of the sections, complete the PD table and hence calculate the expected value.</p>
<p></p>
<p>| X      | 1         | 2         | 3         |</p>
<p>| ------ | --------- | --------- | --------- |</p>
<p>| p(X=x) | <Katex math={"\\frac18"}/> | <Katex math={"\\frac28"}/> | <Katex math={"\\frac58"}/> |</p>
<p><Katex math={"E(X) = 2.5"} displayMode/></p>
<p><Katex math={"Var(X) = 0.5"} displayMode/></p>
<h2 class="heading"> Adding a constant</h2>
<p>Lets add 3, let Y be the new random variable, Y = x + 3. The new spinner will look like this,</p>
<p>| 6 | 6 | 6 | 6 | 6 | 5 | 5 | 4 |.</p>
<p></p>
<p>2. The table is shown bellow</p>
<p></p>
<p>| Y = x + 3 | 4         | 5         | 6         |</p>
<p>| --------- | --------- | --------- | --------- |</p>
<p>| p(Y=y)    | <Katex math={"\\frac18"}/> | <Katex math={"\\frac28"}/> | <Katex math={"\\frac28"}/> |</p>
<p><Katex math={"E(Y) = 5.5"} displayMode/></p>
<p><Katex math={"Var(Y) = 0.5 "} displayMode/></p>
<h4 class="heading"> Relationship between <Katex math={"E(x)"}/> and <Katex math={"E(y)"}/></h4>
<p><Katex math={"E(Y) = E(X + 3) = E(X) + 3"} displayMode/></p>
<p><Katex math={"Var(Y) = Var(X + 3) = Var(X)"} displayMode/></p>
<p></p>
<h2 class="heading"> Multiplying by a constant</h2>
<p>Lets multiply by 4, let m be the new random variable, m = 4x.</p>
<p>The new spinner looks like this. | 12 | 12 | 12 | 12 | 12 | 8 | 8 | 4 |.</p>
<p></p>
<p>3. The table is shown bellow</p>
<p></p>
<p>| M = 4x | 4         | 8         | 12        |</p>
<p>| ------ | --------- | --------- | --------- |</p>
<p>| p(M=m) | <Katex math={"\\frac18"}/> | <Katex math={"\\frac28"}/> | <Katex math={"\\frac58"}/> |</p>
<p><Katex math={"E(M) = 10"} displayMode/></p>
<p><Katex math={"Var(M) = 8"} displayMode/></p>
<p></p>
<p></p>
<h2 class="heading"> Graph to show the relationship between <Katex math={"E(X)"}/>, <Katex math={"E(Y)"}/> and <Katex math={"E(M)"}/>.</h2>
<p></p>
<p><Katex math={"E(X)"}/> = blue dot                   <Katex math={"E(Y)"}/> = green cross                  <Katex math={"E(M)"}/> = red open</p>
<img src="/graphs/LinearCombinationsofRandomVariables0.png" alt="graph">
<p></p>
<h2 class="heading"> Rules</h2>
<p><Katex math={"E(X + b) = E(X) + b"} displayMode/></p>
<p><Katex math={"E(aX) = aE(X)"} displayMode/></p>
<p><Katex math={"E(aX + b) = aE(X) + b"} displayMode/></p>
<p><Katex math={" "} displayMode/></p>
<p><Katex math={"Var(X + b) = Var(X)"} displayMode/></p>
<p><Katex math={"Var(aX) = a^2Var(X)"} displayMode/></p>
<p><Katex math={"Var(aX + b) = a^2Var(X)"} displayMode/></p>
<p><Katex math={" "} displayMode/></p>
<p><Katex math={"E(X) * E(X) \\ne E(X^2)"} displayMode/></p>
<p><Katex math={" "} displayMode/></p>
<p><Katex math={"E(aX + bY) = aE(X) + bE(Y)"} displayMode/></p>
<p><Katex math={"Var(aX \\pm bY) = a^2Var(X) + b^2Var(Y)"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Normal Distribution</h2>
<div class="link-container"><a href="//">Normal Distribution</a></div>
<p>Physical quantities that are the sum of normally distributed independent variables are themselves normally distributed.</p>
<img src="/Attachements/Pastedimage20240517092210.png" alt="diagram">
<p><Katex math={"E(X<i>1 \\pm X</i>2 \\pm \\dots \\pm X<i>n) = E(X</i>1) \\pm E(X<i>2) \\pm\\dots\\pm E(X</i>n)\\ provided\\ X<i>1 \\pm X</i>2 \\pm \\dots \\pm X_n\\ are\\ independent "} displayMode/></p>
<p><Katex math={"Var(X<i>1 \\pm X</i>2 \\pm \\dots \\pm X<i>n) = Var(X</i>1) + Var(X<i>2) + \\dots + Var(X</i>n)"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p>**If <Katex math={"X<i>1"}/>, <Katex math={"X</i>2"}/>, <Katex math={"\\dots"}/>, <Katex math={"X_n"}/> is a set of normally distributed variables. </p>
<p>Then the distribution of(<Katex math={"X<i>1 \\pm X</i>2 \\pm \\dots \\pm X_n"}/>) is also normal.**</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>The mass, X of a suitcase at an airport is modelled as being normally distributed, with mean 15kg and standard deviation 3kg. Find the probability that a random sample of ten suitcases weighs more than 154kg.</p>
<p></p>
<p>The mass X of one suitcase is given by <Katex math={"X \\sim N(15, 3^2)"}/></p>
<p>Then the mass of each of the ten suitcases has the distribution of X: call them <Katex math={"X<i>1, X</i>2, \\dots + X_{10}"}/>.</p>
<p></p>
<p>Let the random variable T be the total weight of ten suitcases <Katex math={"T = X<i>1 + X</i>2 + \\dots + X_{10}"}/></p>
<p><Katex math={"E(T) = E(X<i>1) + E(X</i>2) + \\dots + E(X_{10})"} displayMode/></p>
<p><Katex math={"Var(T) = Var(X<i>1) + Var(X</i>2) + \\dots + Var(X_{10})"} displayMode/></p>
<p>so <Katex math={"T \\sim N(150, 90)"}/></p>
<p></p>
<p><Katex math={"p(T > 154) = \\frac{154 - 150}{\\sqrt{90}} = 0.337\\ (3sf)"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Difficult example</h2>
<p>A machine produces sheets of paper the thickness of which are normally distributed with mean 0.1mm and standard deviation 0.006mm.</p>
<p></p>
<p>1. State the distribution of the total thickness of eight randomly selected sheets of paper.</p>
<p><Katex math={"X \\sim N(0.8, 0.0170^2)"} displayMode/></p>
<p>2. Single sheets of paper are folded three times. State the distribution of the total thickness.</p>
<p><b>This is a trick questions. Because the paper is folded, it doubles in width each time. Meaning its <Katex math={"2^3"}/> which is 8 width</b></p>
<p></p>
<p><Katex math={"E(T) = E(8X) = 0.8"} displayMode/></p>
<p><Katex math={"Var(T) = Var(8X) = 64(0.006)^2 = 0.00230"} displayMode/></p>
<p>The variation is the variation of one piece of paper multiplied by eight because once a single piece of paper is chosen the variation is not evenly random.</p>
<p></p>
<p><Katex math={"\\therefore T \\sim N(0.8, 0.00230)"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<p></p>
<h2 class="heading"> Poisson Distribution</h2>
<div class="link-container"><a href="//">Poisson Distribution</a></div>
<p></p>
<p><Katex math={"A \\sim Po(3)"} displayMode/></p>
<p><Katex math={"B \\sim Po(4)"} displayMode/></p>
<p><Katex math={"C = A + B"} displayMode/></p>
<p><Katex math={"\\therefore C\\sim Po(7)"} displayMode/></p>
<p><Katex math={"Var(C) = 7"} displayMode/></p>
<p><Katex math={" "} displayMode/></p>
<p><Katex math={"X = A + 2B"} displayMode/></p>
<p><center>Not Poisson distribution because amount changes!</center></p>
<p></p>
<p><Katex math={"E(X) = 3 + 2(4) = 11"} displayMode/></p>
<p><Katex math={"Var(X) = 3 + 4(4) = 19"} displayMode/></p>
<p></p>
<p>Otherwise it is very straight forward, <b>just remember that if any distribution is multiplied then the resultant E(X) and Var(X) are not of a Poisson distribution and you CANNOT treat it like a Poisson!</b></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>