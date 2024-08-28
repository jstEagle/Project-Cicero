<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>BiasedandUnbiasedestimatesofpopulationparameters</title></svelte:head><div class="note">
   <h1 class="title">Biased and Unbiased estimates of population parameters</h1>
<p><b>An estimate is an unbiased estimate of a given population parameters/statistic (e.g. mean, variance, maximum value, etc.) when the mean of the sampling distribution of that parameter/statistic is equal to the population parameter being investigated</b></p>
<p></p>
<p>Formula to calculate sample variance given E(V)</p>
<h2 class="heading"> <Katex math={"S^2 = E(V)*\\frac{n}{n-1} = \\frac{1}{n-1}(\\sum x^2 f - n\\bar{x}^2)"} displayMode/></h2>
<h2 class="heading"> 3 Different situations</h2>
<p>- You are provided either <Katex math={"\\mu"}/> or <Katex math={"\\mu_\\bar{x}"}/> and population variance <Katex math={"\\sigma^2"}/>, and are asked something about a sample.</p>
<p>- The hand lengths of 5 students are: <Katex math={"\\dots, \\dots, \\dots"}/> . Find the mean and variance of these students' hand lengths. (As such this is a population of ? students)</p>
<p>- Use the data for the ? students to estimate the mean and variance of the length of students' hands at the university. <i>This is a new situation. We are given neither the mean or the variance of the population but are asked for estimates of them from a sample of the population</i></p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Biased <Katex math={"\\rightarrow"}/> Unbiased</h2>
<p>A jar contains a large number of small discs. 40% are numbered 1, 40% are numbered 2 and 20% are numbered 3.</p>
<p></p>
<p>1) Calculate the theoretical population mean and variance for the random variable "number on disk"</p>
<p><Katex math={"\\mu = 1.8"} displayMode/></p>
<p><Katex math={"Var(x) = 0.56"} displayMode/></p>
<p>2) A random sample of 3 discs are taken from the jar. By considering all the possible values for a sample size of 3, determine whether the variance of the sample is an unbiased estimator of the variance of the population</p>
<p><Katex math={"\\frac{1^2 + 1^2 + 2^2}{3} - (\\frac{1 + 1 + 2}{3})^2"} displayMode/></p>
<p><Katex math={" = \\frac29"} displayMode/></p>
<p><center>The probability of selecting this sample</center></p>
<p></p>
<p><Katex math={"0.4 * 0.4 * 0.4 = 0.064"} displayMode/></p>
<p>This results in the following probability distribution table of the sample variances</p>
<p></p>
<p>| V (sample variance) | 0     | <Katex math={"\\frac29"}/> | <Katex math={"\\frac69"}/> | <Katex math={"\\frac89"}/> |</p>
<p>| :------------------ | :---- | :-------- | :-------- | :-------- |</p>
<p>| <Katex math={"P(V=v)"}/>            | 0.136 | 0.528     | 0.192     | 0.144     |</p>
<p></p>
<p>Now calculate the expectation of the sample variances i.e. the mean of the sample variances E(V). If the sample variance is a good estimator, the mean of the sample variances should be more or less equal to the variance of the population.</p>
<p><Katex math={"E(V) = 0*0.136 + \\frac29*0.528 + \\frac69*0.192 + \\frac89*0.144 = 0.3733"} displayMode/></p>
<p><Katex math={"E(V) \\ne \\sigma^2"} displayMode/></p>
<p><center>E(V) is a poor estimator, it is biased</center></p>
<p><center>In order to get a good estimator of the population variance, try this:</center></p>
<p></p>
<h2 class="heading"> <Katex math={"S^2 = Sample\\ varaince"} displayMode/></h2>
<h2 class="heading"> <Katex math={"S^2 = E(V)*\\frac{n}{n-1}"} displayMode/></h2>
<p><Katex math={"0.3733 * \\frac{3}{3-1} = 0.56 = \\sigma^2"} displayMode/></p>
<p><b>In order for E(V) to be an unbiased estimator it must be adjusted this way</b></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>Consider a spinner, with sides 1, 1, 2 and 4.</p>
<p></p>
<p>| X        | 1   | 2    | 4    |</p>
<p>| :------- | :-- | :--- | :--- |</p>
<p>| <Katex math={"P(X=x)"}/> | 0.5 | 0.25 | 0.25 |</p>
<p><b>Population parameters:</b></p>
<p><Katex math={"\\mu = 2"}/></p>
<p><Katex math={"\\sigma^2 = 1.5"}/></p>
<p></p>
<p>We saw that if we spun it once or several times that the mean is always 2. Thus mean is an unbiased estimate, now consider the variance for a sample size of 1, 2 or 3 spins.</p>
<p></p>
<h2 class="heading"> n = 1</h2>
<p></p>
<p>| Outcome | <Katex math={"\\sum x^2"}/> | <Katex math={"\\bar{x}"}/> | <Katex math={"\\sigma^2=\\frac{\\sum x^2}{n} - (\\bar{x})^2"}/> | Probability |</p>
<p>| :------ | :--------- | :-------- | :------------------------------------------ | :---------- |</p>
<p>| 1       | 1          | 1         | 0                                           | 0.5         |</p>
<p>| 2       | 4          | 2         | 0                                           | 0.25        |</p>
<p>| 4       | 16         | 4         | 0                                           | 0.25        |</p>
<p></p>
<p>| Variance | 0   | 0    | 0    |</p>
<p>| :------- | :-- | :--- | :--- |</p>
<p>| <Katex math={"P(V=v)"}/> | 0.5 | 0.25 | 0.25 |</p>
<h4 class="heading"> <Katex math={"\\therefore E(V)\\ne \\sigma^2"} displayMode/></h4>
<h2 class="heading"> n = 2</h2>
<p></p>
<p>| Outcome | <Katex math={"\\sum x^2"}/> | <Katex math={"\\bar{x}"}/> | <Katex math={"\\sigma^2=\\frac{\\sum x^2}{n} - (\\bar{x})^2"}/> | Probability    |</p>
<p>| :------ | :--------- | :-------- | :------------------------------------------ | :------------- |</p>
<p>| 1 1     | 2          | 1         | 0                                           | <Katex math={"\\frac4{16}"}/>   |</p>
<p>| 2 2     | 8          | 2         | 0                                           | <Katex math={"\\frac1{16}"}/>   |</p>
<p>| 4 4     | 32         | 4         | 0                                           | <Katex math={"\\frac{1}{16}"}/> |</p>
<p>| 1 2     | 5          | 1.5       | 0.25                                        | <Katex math={"\\frac{4}{16}"}/> |</p>
<p>| 1 4     | 17         | 2.5       | 2.25                                        | <Katex math={"\\frac{4}{16}"}/> |</p>
<p>| 2 4     | 20         | 3         | 1                                           | <Katex math={"\\frac{2}{16}"}/> |</p>
<p></p>
<p>| V        | 0         | 0.25      | 1         | 2.25      |</p>
<p>| :------- | :-------- | :-------- | :-------- | :-------- |</p>
<p>| <Katex math={"P(V=v)"}/> | <Katex math={"\\frac38"}/> | <Katex math={"\\frac14"}/> | <Katex math={"\\frac18"}/> | <Katex math={"\\frac14"}/> |</p>
<p><Katex math={"E(V) = \\sum V * P(V=v) = \\frac34"} displayMode/></p>
<p><center>E(V) is a biased estimator</center></p>
<p></p>
<p><Katex math={"S^2 = E(V)*\\frac{n}{n-1}"} displayMode/></p>
<p><Katex math={"=\\frac34 * \\frac21"} displayMode/></p>
<p><Katex math={"=1.5"} displayMode/></p>
<p></p>
<h2 class="heading"> n = 3</h2>
<p></p>
<p>| Outcome | <Katex math={"\\sum x^2"}/> | <Katex math={"\\bar{x}"}/>    | <Katex math={"\\sigma^2=\\frac{\\sum x^2}{n} - (\\bar{x})^2"}/> | Probability  |</p>
<p>| :------ | :--------- | :----------- | :------------------------------------------ | :----------- |</p>
<p>| 1 1 1   | 3          | 1            | 0                                           | <Katex math={"\\frac18"}/>    |</p>
<p>| 1 1 2   | 6          | <Katex math={"\\frac34"}/>    | <Katex math={"\\frac29"}/>                                   | <Katex math={"\\frac3{16}"}/> |</p>
<p>| 1 2 2   | 9          | <Katex math={"\\frac53"}/>    | <Katex math={"\\frac29"}/>                                   | <Katex math={"\\frac3{32}"}/> |</p>
<p>| 2 2 2   | 12         | 2            | 0                                           | <Katex math={"\\frac1{64}"}/> |</p>
<p>| 1 1 4   | 18         | 2            | 2                                           | <Katex math={"\\frac3{16}"}/> |</p>
<p>| 1 2 4   | 21         | <Katex math={"\\frac73"}/>    | <Katex math={"\\frac{14}9"}/>                                | <Katex math={"\\frac6{32}"}/> |</p>
<p>| 2 2 4   | 24         | <Katex math={"\\frac83"}/>    | <Katex math={"\\frac89"}/>                                   | <Katex math={"\\frac3{64}"}/> |</p>
<p>| 1 4 4   | 33         | 3            | 2                                           | <Katex math={"\\frac3{32}"}/> |</p>
<p>| 2 4 4   | 36         | <Katex math={"\\frac{10}3"}/> | <Katex math={"\\frac89"}/>                                   | <Katex math={"\\frac3{64}"}/> |</p>
<p>| 4 4 4   | 48         | 4            | 0                                           | <Katex math={"\\frac1{64}"}/> |</p>
<p></p>
<p>| V        | 0            | <Katex math={"\\frac29"}/>    | <Katex math={"\\frac89"}/>    | <Katex math={"\\frac{14}9"}/> | 2            |</p>
<p>| :------- | :----------- | :----------- | :----------- | :----------- | :----------- |</p>
<p>| <Katex math={"P(V=v)"}/> | <Katex math={"\\frac5{32}"}/> | <Katex math={"\\frac9{32}"}/> | <Katex math={"\\frac3{32}"}/> | <Katex math={"\\frac6{32}"}/> | <Katex math={"\\frac9{32}"}/> |</p>
<p><Katex math={"E(V) = \\sum V * P(V=v) = 1"} displayMode/></p>
<p><center>E(V) is a biased estimator</center></p>
<p></p>
<p><Katex math={"S^2 = E(V) * \\frac{n}{n-1}"} displayMode/></p>
<p><Katex math={"= 1 * \\frac32"} displayMode/></p>
<p><Katex math={"= 1.5"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> Summary</h2>
<p><Katex math={"S^2 = \\frac{n}{n-1} * E(V) "} displayMode/></p>
<p><Katex math={"because"} displayMode/></p>
<p><Katex math={"E(V) = \\frac{n-1}{n}*\\sigma^2"} displayMode/></p>
<p><Katex math={"S^2 \\approx \\sigma^2"} displayMode/></p>
<p><Katex math={"S^2 = \\frac{n}{n-1} * E(V)"} displayMode/></p>
<p><Katex math={"E(V) = expected\\ variance = \\frac{\\sum x^2}{n} - \\bar{x}^2"} displayMode/></p>
<p><Katex math={"S^2 = \\frac{n}{n-1}(\\frac{\\sum x^2}{n} - \\bar{x}^2)"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"S^2 = \\frac{1}{n-1}(\\frac{\\cancel{n}\\sum x^2}{\\cancel{n}} - n\\bar{x}^2) = \\frac{1}{n-1}(\\sum x^2 f - n\\bar{x}^2)"} displayMode/></p>
<p><Katex math={"= \\frac{1}{n-1}(\\sum x^2 - \\frac{(\\sum x)^2}{n}) \\rightarrow Given\\ in\\ formula\\ sheet"} displayMode/></p>
<p></p>
</div>