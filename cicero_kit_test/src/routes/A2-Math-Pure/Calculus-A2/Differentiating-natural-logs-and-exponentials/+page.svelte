<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Differentiating-natural-logs-and-exponentials</title></svelte:head><div class="note">
   <h1 class="title">Differentiating natural logs and exponentials</h1>
<h2 class="heading"> <Katex math={"y = \\ln x \\rightarrow \\frac{dy}{dx} = \\frac1x\\ \\ \\ \\ \\ | \\ \\ \\ \\ \\ y=e^x\\rightarrow \\frac{dy}{dx} = e^x"} displayMode/></h2>
<h2 class="heading"> <Katex math={"y =a \\ln x \\rightarrow \\frac{dy}{dx} = \\frac{a}x\\ \\ \\ \\ \\ | \\ \\ \\ \\ \\ y = ae^x \\rightarrow \\frac{dy}{dx} = ae^x"} displayMode/></h2>
<h2 class="heading"> <Katex math={"y = \\ln ax \\rightarrow \\frac{dy}{dx} = \\frac{a}{ax} = \\frac1x\\ \\ \\ \\ \\ | \\ \\ \\ \\ \\ y = e^{ax} \\rightarrow \\frac{dy}{dx} = a e^{ax}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"y = \\ln f(x) \\rightarrow \\frac{dy}{dx} = \\frac{f'(x)}{f(x)}\\ \\ \\ \\ \\ | \\ \\ \\ \\ \\ y = e^{f(x)} \\rightarrow \\frac{dy}{dx} = f'(x) * e^{f(x)} "} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Proof</h2>
<p><Katex math={"y = \\ln ax"} displayMode/></p>
<p><Katex math={"let\\ ax = u = f(x)"} displayMode/></p>
<p><Katex math={"y = \\ln u"} displayMode/></p>
<p><Katex math={"\\frac{du}{dx} = a"} displayMode/></p>
<p><Katex math={"\\frac{dy}{du} = \\frac1u"} displayMode/></p>
<p><Katex math={"\\frac{dy}{dx} = \\frac1u * a = \\frac{a}u"} displayMode/></p>
<p><Katex math={"\\frac1{f(x)} = \\frac{a}{ax} = \\frac1x"} displayMode/></p>
<p><Katex math={"\\therefore \\ln f(x) \\rightarrow \\frac{dy}{dx} = \\frac{f'(x)}{f(x)}"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Examples</h2>
<p><Katex math={"y=x\\ln x"} displayMode/></p>
<p><Katex math={"\\frac{dy}{dx} = 1(\\ln x) + x(\\frac1x)"} displayMode/></p>
<p><Katex math={"=\\ln x + 1"} displayMode/></p>
<div class="link-container"><a href="//">using Product Rule</a></div>
</div>