<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>HypothesisTesting</title></svelte:head><div class="note">
   <h1 class="title">Hypothesis Testing</h1>
<h2 class="heading"> H<Katex math={"_0"}/> - Null Hypothesis</h2>
<p>Nothing is changed, what we believed to be true previously still applies.</p>
<p></p>
<h2 class="heading"> H<Katex math={"_1"}/> - Alternate Hypothesis</h2>
<p>A new possibility that we are investigating.</p>
<p></p>
<h2 class="heading"> Significance level</h2>
<p>It is the level at which an event is so unlikely to be coincidence that we reject the null hypothesis and concede that something has probably changed.</p>
<p></p>
<p>Usually, a significance level of 5% or 1% is used by scientists but it depends on the situation. Clearly a level of 1% will provide more certainty for your conclusion that 5%.</p>
<p></p>
<p><b>If probability of event > Significance level <Katex math={"\\rightarrow"}/> Accept Null Hypothesis</b></p>
<p></p>
<p>**If probability of event <Katex math={"<"} inline/> Significance level <Katex math={"\\rightarrow"}/> Reject Null Hypothesis</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> Example</h2>
<p>Records show that <mark class="hltr-orange">1% of the population</mark> has a positive reaction to a test for a particular allergy. In a village, <mark class="hltr-orange">120 people are tested and four people have a positive reaction</mark>. Test at the <mark class="hltr-orange">5% level of significance</mark> if there is any evidence of an increase in the population with a positive reaction for this particular allergy.</p>
<p></p>
<p><Katex math={" X \\sim B(120, 0.01)"} displayMode/></p>
<p><Katex math={"H_0: \\lambda = 1.2"} displayMode/></p>
<p><Katex math={"H_1: \\lambda > 1.2"} displayMode/></p>
<p><Katex math={"X\\sim Po(1.2)"} displayMode/></p>
<p><Katex math={"5\\% \\ significance"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"p(x \\ge 4) = 1 - p(x < 4)"} displayMode/></p>
<p><Katex math={"= 1 - e^{-1.2}(1 + 1.2 + \\frac{1.2^2}{2!} + \\frac{1.2^3}{3!})"} displayMode/></p>
<p><Katex math={"= 3.38\\%"} displayMode/></p>
<p><Katex math={"3.38\\% < 5\\%"} displayMode/></p>
<p><Katex math={"\\therefore \\ H<i>0"}/> is rejected, <Katex math={"H</i>1"}/> is accepted. This means that there has been an increase in the population of people that have a positive reaction.</p>
<p></p>
<p><i>To accept null hypothesis <Katex math={"p(x \\ge 4) > 5\\%"}/></i></p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> Example</h2>
<p>Studies suggest that 10% of the world's population is left-handed. Bailin suspects that being left-handed is less common amongst basketball players and plans to test this by asking a random of 50 basketball players if there are left-handed.</p>
<p></p>
<p>1) Find the rejection region at the 5% significance level and state the critical value.</p>
<p></p>
<p>- Define the random variable: <Katex math={"X \\sim B(50, 0.1)"}/>. <Katex math={"X ="}/> number of players who are left handed.</p>
<p>- State <Katex math={"H_0"}/> - 10% of the basketball players are left-handed</p>
<p>- State <Katex math={"H_1"}/> - less than 10% of the basketball players are left-handed</p>
<p>- Type of test - One tailed at 5% significance</p>
<p></p>
<p><Katex math={"X \\sim B(50, 0.1)"} displayMode/></p>
<p><Katex math={"p(X\\le K) \\le 5\\%"} displayMode/></p>
<p><Katex math={"p(X = 0) = 0.9^{50} = 0.0052"} displayMode/></p>
<p><Katex math={"p(X = 1) = 0.0286"} displayMode/></p>
<p><Katex math={"p(X = 2) = 0.0779"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"P(X \\le 1) = \\begin{pmatrix}50 \\\\ 0 \\end{pmatrix}*0.1^0*0.9^{50} + \\begin{pmatrix}50 \\\\ 1 \\end{pmatrix} * 0.1*0.9^{49} "} displayMode/></p>
<p><Katex math={" = 3.38\\%"} displayMode/></p>
<p><Katex math={"p(X \\le 2) = 11.17\\%"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"3.38\\% < 5\\%"} displayMode/></p>
<p>Rejection region is <Katex math={"X \\le 1"}/> </p>
<p>If one or fewer players are left-handed then there is sufficient evidence to suggest that less than 10% of basketball players are left-handed</p>
<p></p>
<p></p>
<p>2) If the critical value is 2, what would be the lest integer significance level for you to conclude that Bailin's suspicion is correct?</p>
<p></p>
<p>i.e. min level of significance level required if n = 2 to reject <Katex math={"H_0"}/> </p>
<p><Katex math={" = 12\\%"} displayMode/></p>
</div>