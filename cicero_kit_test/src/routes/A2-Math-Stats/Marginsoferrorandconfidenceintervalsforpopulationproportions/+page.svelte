<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Marginsoferrorandconfidenceintervalsforpopulationproportions</title></svelte:head><div class="note">
   <h1 class="title">Margins of error and confidence intervals for population proportions</h1>
<h2 class="heading"> Confidence intervals for proportions</h2>
<p><Katex math={"p \\pm z\\sqrt{\\frac{p(1-p)}{n}}"} displayMode/></p>
<p></p>
<h2 class="heading"> Confidence interval for difference between two means</h2>
<p><Katex math={"(\\bar{x}<i>1 - \\bar{x}</i>2) = z\\sqrt{\\frac{\\sigma^2<i>1}{n</i>1}+\\frac{\\sigma^2<i>2}{n</i>2}}"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<p>There are many situations in which sample means are not relevant. Sometimes we are interested in the proportion of a population that is for or against something. For example, in the last election there was a referendum on the recreational legalisation of marijuana.</p>
<p></p>
<p>If an issue is important to you it might be worth doing a poll before the elections and using the results to determine if you are likely to get the outcome you favour. The poll is as such a sample,  and it yields a specific proportion of the population. It would be useful to know how likely it is that your issue will be votes for an how reliable the result of the poll is so that you can increase your campaign efforts if there is a chance you might lose.</p>
<p></p>
<p>E.g. a poll is done and it is found that 58% of the people questioned voted for the legalisation of weed. If you are in favour of legalising weed then that sounds optimistic, but how reliable is this estimate of proportion?</p>
<p></p>
<p>Let the vote for the legalisation of weed be considered to be success, x out of n people vote for this so the proportion of successes is <Katex math={"\\hat{p}=\\frac{x}{n} = 0.58"}/> = proportion of people voting to legalise weed.</p>
</div>