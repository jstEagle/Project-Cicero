<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>ContinuousRandomVariables</title></svelte:head><div class="note">
   <h1 class="title">Continuous Random Variables</h1>
<p>This is just finding the probability of an event we know can be modelled by some function, by finding the area under the graph between two points.</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Median and Quartiles</h2>
<p>The median value of a continuous random variable X with p.d.f. <Katex math={"f(X)"}/> is the value m for which</p>
<p><Katex math={"p(X < m) = p(X > m) = 0.5"} displayMode/></p>
<p>consequently</p>
<p><Katex math={"\\int^m<i>{-\\infty}f(X)*dx = 0.5\\ \\  and\\  \\int^{\\infty}</i>mf(X)*dx = 0.5"} displayMode/></p>
<p><i>the same works with quartiles just using 0.25</i></p>
<p></p>
<h2 class="heading"> Mode</h2>
<p>The mode of a continuous random variable X whose p.d.f. is <Katex math={"f(X)"}/> has the greatest value. Thus the mode is the value of X where the curve is at its highest. If the mode is at a local maximum of <Katex math={"f(X)"}/> then it may often be found by differentiating <Katex math={"f(X)"}/> and solving the equation <Katex math={"f'(X) = 0"}/></p>
<p></p>
<p>i.e.</p>
<img src="/graphs/ContinuousRandomVariables0.png" alt="graph">
<p></p>
<p></p>
<h2 class="heading"> Mean and Variance</h2>
<p><Katex math={"\\int f(x)*dx = prob.\\ of\\ x = p(x)"} displayMode/></p>
<p><Katex math={"E(X) = \\sum x*p(X)\\ for\\ discrete\\ data"} displayMode/></p>
<p><Katex math={"E(X) = \\int x * f(x)*dx "} displayMode/></p>
<p><Katex math={"Var(X) = \\sum x^2 * p(X) - \\bar{x}^2 = \\int x^2 * f(x) *dx - [\\int x * f(x) * dx]^2 "} displayMode/></p>
<p></p>
<h2 class="heading"> Uniform (rectangular) distribution</h2>
<p><Katex math={"f(x) = \\left\\{ \\begin{array}{c} \\frac{1}{b-a}\\ \\ \\ \\ a \\le x \\le b \\\\ 0\\ \\ \\ otherwise \\end{array} \\right."} displayMode/></p>
<p><Katex math={"Median = \\frac{b+a}{2}"} displayMode/></p>
<p><Katex math={"No\\ mode"} displayMode/></p>
<p><Katex math={"Var(X) = \\frac{(b-a)^2}{12}"} displayMode/></p>
<p>Proof:</p>
<p><Katex math={"\\int^b_a x^2(\\frac{1}{b-a})*dx - (\\frac{b+a}{2})^2 "} displayMode/></p>
<p><Katex math={"=[\\frac{x^3}{3}(\\frac{1}{b-a})]^b_a*(\\frac{1}{b-a}) - (\\frac{b+a}{2})^2 "} displayMode/></p>
<p><Katex math={"= \\frac{b^3}{3(b-a)}-(\\frac{b-a}{2})^2"} displayMode/></p>
<p><Katex math={"= \\frac{b^3-a^3}{3(b-a)} - (\\frac{b-a}{2})^2"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"b^3-a^3 = (b-a)(a^2 + ab + b^2)"} displayMode/></p>
<p><Katex math={"= \\cancel{a^2b} + \\cancel{ab^2} + b^3 - a^3 - \\cancel{a^2b} - \\cancel{ab^2}"} displayMode/></p>
<p><Katex math={"=\\frac{(b-a)(a^2 + ab + b^2)}{3(b-a)} - (\\frac{b+a}{2})^2 "} displayMode/></p>
<p><Katex math={"=\\frac{a^2 + ab + b^2}{3} - \\frac{b^2 + 2ab + a^2}{4} "} displayMode/></p>
<p><Katex math={"= \\frac{4a^2 + \\cancel{4ab} + \\cancel{4b^2} - \\cancel{3b^2} - \\cancel{6ab} - 3a^2}{12}"} displayMode/></p>
<p><Katex math={"= \\frac{b^2 - 2ab + a^2}{12}"} displayMode/></p>
<p><Katex math={"= \\frac{(b-a)^2}{12}"} displayMode/></p>
<p></p>
<img src="/graphs/ContinuousRandomVariables1.png" alt="graph">
<p></p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>The oil refinery are thinking of fitting an electronic security system inside the head office. They have been told by manufacturers that the lifetime, X years, of the system they have in mind has the p.d.f. of</p>
<p><Katex math={"f(x) = \\left\\{ \\begin{array}{c} \\frac{3x(20-x)}{4000}\\ \\ \\ for\\ 0 \\le x \\le 20 \\\\ 0\\ \\ \\ otherwise \\end{array} \\right."} displayMode/></p>
<p>1. Show that the manufacturer's statement is consistent with <Katex math={"f(x)"}/> being a probability density function.</p>
<p><Katex math={"If\\ f(x)\\ is\\ p.d.f.\\ then\\ \\int^{20}_0\\frac{3x(20-x)}{4000} = 1"} displayMode/></p>
<p><Katex math={"\\int^{20}<i>0 \\frac{3x(20-x)}{4000}*dx = \\int^{20}</i>0\\frac{60x-3x^2}{4000}*dx = \\frac{1}{4000}*\\int^{20}_0 60x - 3x^2*dx"} displayMode/></p>
<p><Katex math={"= [\\frac{1}{4000}((\\frac{60x^2}2) - \\frac{3x^3}3)]^{20}_0"} displayMode/></p>
<p><Katex math={" = [\\frac1{4000} (30x^2 - x^3)]^{20}_0"} displayMode/></p>
<p><Katex math={"= [\\frac{3x^2}{400} - \\frac{x^3}{4000}]^{20}_0 = [\\frac{3(20^2)}{400} - \\frac{(20)^3}{4000}] - [\\frac{3(0)^2}{400} - \\frac{(0)^3}{4000}]"} displayMode/></p>
<p><Katex math={" = 1"} displayMode/></p>
<p><Katex math={"\\therefore\\ is\\ p.d.f."} displayMode/></p>
<p></p>
<p>2. Find the probability that it fails in the tenth year</p>
<p><Katex math={"\\frac{1}{4000}\\int^{10}_9 60x - 3x^2 *dx"} displayMode/></p>
<p><Katex math={"= [\\frac{3x^2}{400} - \\frac{x^3}{4000}]^{10}_9 = [\\frac{3(10)^2}{400} - \\frac{(10)^3}{4000}] - [\\frac{3(9)^2}{400} - \\frac{(9)^3}{4000}] "} displayMode/></p>
<p><Katex math={" = (0.5) - (0.42525)"} displayMode/></p>
<p><Katex math={" = 0.0748"} displayMode/></p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>A continuous random variable, X, has the following PDF:</p>
<p><Katex math={"f(x) = \\left\\{ \\begin{array}{c} \\frac1{27}x^2\\ \\ \\ \\ \\ \\ \\ \\ \\ \\ 0\\le x\\le3 \\\\ \\frac13(5-x)\\ \\ \\ 3<x\\le5 \\\\ 0\\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ otherwise \\end{array} \\right."} displayMode/></p>
<p>1. Find the median</p>
<p>Have to use second part, so working from the back of the graph to the front</p>
<p><Katex math={"\\int^5<i>m\\frac13(5-x)*dx = \\frac13*\\int^5</i>m 5- x *dx = 0.5"} displayMode/></p>
<p><Katex math={"=[\\frac53x-\\frac{x^2}6]^5_m = [\\frac53(5) - \\frac{(5)^2}6] - [\\frac53(m) - \\frac{(m)^2}{6}] = 0.5"} displayMode/></p>
<p><Katex math={"\\frac{25}6 - \\frac53m + \\frac{m^2}6 = 0.5 "} displayMode/></p>
<p><Katex math={"25 - 10m + m^2 = 3"} displayMode/></p>
<p><Katex math={"Quadratic\\ equation"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"m = \\cancel{6.73}\\ because\\ > 5"} displayMode/></p>
<p><Katex math={"\\therefore m = 3.27"} displayMode/></p>
<p>2. Find the lower quartile</p>
<p><Katex math={"\\frac1{27}*\\int^Q_0 x^2*dx = 0.25"} displayMode/></p>
<p><Katex math={"=[\\frac{x^3}{81}]^Q_0= 0.25"} displayMode/></p>
<p><Katex math={"=\\frac{Q^3}{81} = 0.25"} displayMode/></p>
<p><Katex math={"Q = 2.73"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>The response time, in seconds, for a contestant in a general knowledge quiz is modelled by a continuous random variable X whose X p.d.f is</p>
<p><Katex math={"f(x) = \\frac{x}{50}\\ \\ \\ \\ \\ for\\ 0 < x\\le 10"} displayMode/></p>
<p>The rules state that a contestant who makes no answer is disqualified from the whole competition. This has the consequence that everybody gives an answer, if only a guess, to every question. Find</p>
<p></p>
<p>1. The mean time in seconds for a contestant to respond to a particular question</p>
<p><Katex math={"E(X) = \\int^{10}<i>0x * \\frac{x}{50} * dx = \\int^{10}</i>0 \\frac{x^2}{50} * dx"} displayMode/></p>
<p><Katex math={"= [\\frac{x^3}{150}]^{10}_0 = [\\frac{(10)^3}{150}] - [\\frac{(0)^3}{150}]"} displayMode/></p>
<p><Katex math={"= \\frac{1000}{150} = \\frac{20}3 "} displayMode/></p>
<p></p>
<p>2. The standard deviation of the time taken.</p>
<p><Katex math={"\\sigma = \\sqrt{\\sigma^2} = \\sqrt{\\int^{10}_0 x^2 * \\frac{x}{50} * dx - (E(X))^2} "} displayMode/></p>
<p><Katex math={"= [\\frac{x^4}{200}^{10}_0] = [\\frac{(10)^4}{200}] - [\\frac{(0)^4}{200}]"} displayMode/></p>
<p><Katex math={"= \\sqrt{50 - (\\frac{20}3)^2} = 2.36"} displayMode/></p>
<p></p>
<p>3. The organiser estimates the proportion of contestants who are guessing by assuming that they are those whose time is at least one standard deviation greater than the mean. Using this assumption, estimate the probability that a randomly selected response is a guess.</p>
<p><Katex math={"p(X \\ge \\frac{20}3 + \\frac{\\sqrt{50}}3)"} displayMode/></p>
<p><Katex math={"= \\int^{10}<i>{\\frac{20}3 + \\frac{\\sqrt{50}}3} \\frac{x}{50} = [\\frac{x^2}{100}]^{10}</i>{\\frac{20}3 + \\frac{\\sqrt{50}}3}"} displayMode/></p>
<p><Katex math={"= \\frac{10^2}{100} - \\frac{(\\frac{20}3 + \\frac{\\sqrt{50}}3)}{100} = 1- 0.814 "} displayMode/></p>
<p><Katex math={"=0.186 "} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>