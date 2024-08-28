<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Integration-by-parts</title></svelte:head><div class="note">
   <h1 class="title">Integration by parts</h1>
<h2 class="heading"> <Katex math={"\\int u*v' = u*v - \\int u'*v"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\int^b_au*v' = [u*v]^b_a - \\int^b_au' * v"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Choose u - LAATE</h2>
<h2 class="heading"> L - ln / log</h2>
<h2 class="heading"> A - Arctan</h2>
<h2 class="heading"> A - Algebra</h2>
<h2 class="heading"> T - Trig</h2>
<h2 class="heading"> E - Exponents - <Katex math={"e^x"}/></h2>
<h2 class="heading"> Then choose v</h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Proof</h2>
<p><Katex math={"\\frac{d}{dx}[u*v] = \\frac{du}{dx}*v + \\frac{dv}{dx}*u"} displayMode/></p>
<p><Katex math={"\\int \\frac{d}{dx}[u*v] = \\int\\frac{du}{dx}*v + \\int\\frac{dv}{dx}*u "} displayMode/></p>
<p><Katex math={"\\int u*\\frac{du}{dx}*dx = u*v - \\int\\frac{du}{dx}*v "} displayMode/></p>
<p><Katex math={"= \\int u*v' = u*v - \\int u'*v"} displayMode/> <i>_</i><i></i></p>
<h2 class="heading"> Example - Indefinite</h2>
<p>Find <Katex math={"\\int 2xe^x*dx"}/></p>
<p><Katex math={"u = 2x"} displayMode/></p>
<p><Katex math={"\\int 2xe^x*dx = 2x*ex - \\int2e^x*dx"} displayMode/></p>
<p><Katex math={"=2xe^x - 2e^x"} displayMode/></p>
<p></p>
<p></p>
<p>Find <Katex math={"\\int \\ln x * dx"}/></p>
<p><Katex math={"u = \\ln x"} displayMode/></p>
<p><Katex math={"v = x"} displayMode/></p>
<p><Katex math={"\\int \\ln x *dx = lnx * x - \\int \\frac1x * x * dx"} displayMode/></p>
<p><Katex math={"= \\ln x * x - x + c"} displayMode/></p>
<p><Katex math={"=x \\ln x - x + c"} displayMode/></p>
<p></p>
<p></p>
<p>Find <Katex math={"\\int x \\sqrt{1+x}*dx"}/></p>
<p><Katex math={"u = x"} displayMode/></p>
<p><Katex math={"v'=\\sqrt{1+x}"} displayMode/></p>
<p><Katex math={"=x*\\frac23(1+x)^{\\frac32}-\\int \\frac23(1+x)^{\\frac32}*dx "} displayMode/></p>
<p><Katex math={"=\\frac{10}{15}x(1+x)^{\\frac32} - \\frac{4}{15}(1+x)^\\frac25 + c"} displayMode/></p>
<p><Katex math={"=\\frac1{15}(1+x)^{\\frac32}(10x-4(1+x)) + c "} displayMode/></p>
<p><Katex math={"=\\frac1{15}(1+x)^{\\frac32}(6x-4) + c"} displayMode/></p>
<p><Katex math={"=\\frac2{15}(1+x)^{\\frac32}(3x-2) + c"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example - Definite</h2>
<p>Evaluate <Katex math={"\\int^2_0 xe^x*dx"}/></p>
<p><Katex math={"u = x"} displayMode/></p>
<p><Katex math={"v' = e^x"} displayMode/></p>
<p><Katex math={"= [xe^x]^2_0 - \\int^2_0 e^x * dx"} displayMode/></p>
<p><Katex math={"= [xe^x]^2_0 - [e^x]^2_0"} displayMode/></p>
<p><Katex math={"=([(2)e^{(2)}] - [(0)e^{(0)}]) - ([e^{(2)}] - [e^{(0)}])"} displayMode/></p>
<p><Katex math={"=e^2 + 1"} displayMode/></p>
<p><Katex math={"= 8.39\\ (3sf)"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>