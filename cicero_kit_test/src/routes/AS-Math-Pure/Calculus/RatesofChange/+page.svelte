<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>RatesofChange</title></svelte:head><div class="note">
   <h1 class="title">Rates of Change</h1>
<div class="link-container"><a href="//">Using Chain Rule we can find the relationship between related derivatives.</a></div>
<p></p>
<p>For example, imagine a shock wave expanding in a circular shape. What is the relationship between the rate the area of the circle increases and the rate the radius increases.</p>
<img src="/Attachements/Pastedimage20230809122114.png" alt="diagram">
<p>In this problem, the derivatives involved are:</p>
<p><Katex math={" \\frac{dA}{dt}- The\\ rate\\ of\\ change\\ of\\ the\\ Area"} displayMode/></p>
<p><Katex math={" \\frac{dr}{dt}-the\\ rate\\ of\\ change\\ of\\ the\\ Radius"} displayMode/></p>
<div class="link-container"><a href="//">These two rates can be related using the Chain Rule</a></div>
<p><Katex math={" \\frac{dA}{dt} = \\frac{dr}{dt} * \\frac{d?}{d?}"} displayMode/></p>
<p><Katex math={" \\frac{dA}{dt} = \\frac{dr}{dt} * \\frac{dA}{dr}"} displayMode/></p>
<p>In this case the shape is always circular. So <Katex math={"A = \\pi r^2"}/>, and <Katex math={"\\frac{dA}{dr} = 2\\pi r"}/></p>
<p></p>
<p><b>The Radius of a circular shock wave is increasing at a rate of 100m/s. Find the rate of increase of the area when the radius is <mark class="hltr-grey">200m</mark></b></p>
<p></p>
<p><mark class="hltr-grey">This is an irrelevant part that is only used to fill into an equation in the end.</mark></p>
<p></p>
<p>1) <mark class="hltr-blue">Identify the given rate of change</mark></p>
<p></p>
<p>In this case the given rate of change is: radius - 100m/s</p>
<p><Katex math={" \\frac{dr}{dt} = 100m/s"} displayMode/></p>
<p>2) <mark class="hltr-cyan">Find what rate of change you need to find. </mark></p>
<p></p>
<p>In this case the questions asks for the increase in <i>area</i> which means that we need to find the derivative:</p>
<p><Katex math={" \\frac{dA}{dt}"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<div class="link-container"><a href="//">Using Chain Rule we can find the missing equation easily.</a></div>
<p></p>
<p><Katex math={"\\frac{dA}{dt} = \\frac{dr}{dt} * \\frac{d?}{d?}"} displayMode/></p>
<p><Katex math={" \\downarrow"} displayMode/></p>
<p><Katex math={"\\frac{dA}{dt} = \\frac{dr}{dt} * \\frac{dA}{dr}"} displayMode/></p>
<p><i><i></i></i> </p>
<p>3) <mark class="hltr-green">Identify & calculate the third rate of change.</mark></p>
<p><Katex math={"\\frac{dA}{dt}"} displayMode/></p>
<p><Katex math={"A = \\pi r^2"} displayMode/></p>
<p><Katex math={"\\frac{dA}{dr} = 2\\pi r = \\frac{dm^2}{dm}"} displayMode/></p>
<p></p>
<h4 class="heading"> Result</h4>
<p><Katex math={" = 2\\pi r * 100"} displayMode/></p>
<p><Katex math={" = 2\\pi (200) * 100 "} displayMode/></p>
<p><Katex math={"= 40,000\\pi = 126,000m^2/s"} displayMode/></p>
<p></p>
<p><mark class="hltr-grey">This is where the 200 comes in which was irrelevant earlier</mark></p>
<p></p>
<p></p>
<h2 class="heading"> Workbook examples</h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<p>The area of a square is increasing at a rate of 8<Katex math={"cm^2"}/> per second. Find the rate the length of the side is increasing at the instant when the side length is 20cm.</p>
<p></p>
<p>Given: <Katex math={"\\frac{dA}{dt} = 8cm^2/s"}/></p>
<p></p>
<p>Needed: <Katex math={"\\frac{dL}{dt}"}/></p>
<p></p>
<p><Katex math={"\\frac{dL}{dt} = \\frac{dA}{dt} * \\frac{dL}{dA}"} displayMode/></p>
<p><Katex math={" \\downarrow"} displayMode/></p>
<p><Katex math={"A = L^2"} displayMode/></p>
<p><Katex math={"\\therefore \\frac{dA}{dL} = 2L"} displayMode/></p>
<p><Katex math={"\\therefore \\frac{dL}{dA} = \\frac1{2L}"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"8 * \\frac{1}{2L} = \\frac{dL}{dt}"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/><Katex math={" 8 * \\frac{1}{2(20)} = \\frac15 = 0.2cm/s"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>