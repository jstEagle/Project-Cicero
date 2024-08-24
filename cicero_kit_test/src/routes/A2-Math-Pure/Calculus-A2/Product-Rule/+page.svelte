<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Product-Rule</title></svelte:head><div class="note">
   <h1 class="title">Product-Rule</h1>
<h2 class="heading"> <Katex math={"(f * g)' = f'*g + f *g'"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> <Katex math={"\\frac{d}{dx}(u * v) = u *\\frac{dv}{dx} + v * \\frac{du}{dx}"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<p></p>
<h2 class="heading"> <Katex math={" d(uv) = u*dv + v * du"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Proof</h2>
<p><Katex math={"let\\ p(x) = f(x) * g(x)"} displayMode/></p>
<p><Katex math={"p'(x) = \\lim_{h\\rightarrow 0} \\frac{f(x+h) * g(x + h) - f(x)g(x)}{h}"} displayMode/></p>
<p><Katex math={"=\\lim_{h\\rightarrow 0} \\frac{f(x + h)g(x+h) - f(x + h)g(x) + f(x+h)g(x) - f(x)g(x)}{h}"} displayMode/></p>
<p><Katex math={"Note:\\ -f(x + h)g(x) + f(x + h)g(x) = 0"} displayMode/></p>
<p><Katex math={"= \\lim_{h\\rightarrow 0} \\frac{f(x + h)(g(x + h) - g(x)) + g(x)(f(x + h) - f(x))}{h}"} displayMode/></p>
<p><Katex math={"=\\lim_{h \\rightarrow 0} f(x+h) * \\frac{g(x+h) - g(x)}{h} + g(x) * \\frac{f(x+h) - f(x)}{h} "} displayMode/></p>
<p><Katex math={"\\frac{(g(x+h) - g(x)}{h} = Derivative\\ of\\ g"} displayMode/></p>
<p><Katex math={"\\frac{f(x+h) -f(x)}{h} = Derivative\\ of\\ h"} displayMode/></p>
<p><Katex math={"= f(x) * g'(x) + g(x)*f'(x)"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>Given that <Katex math={"y = (2x+3)(x^2 - 5)"}/>, find <Katex math={"\\frac{dy}{dx}"}/> using the product rule.</p>
<p><Katex math={"(2x + 3) = u"} displayMode/></p>
<p><Katex math={"(x^2 - 5) = v"} displayMode/></p>
<p><Katex math={"\\frac{dy}{dx} = u*v' + v * u'"} displayMode/></p>
<p><Katex math={" = 2(x^2-5) + 2x(2x+3)"} displayMode/></p>
<p><Katex math={"= 2x^2 - 10 + 4x^2 + 6x"} displayMode/></p>
<p><Katex math={"6x^2 + 6x - 10"} displayMode/></p>
<p></p>
<p></p>
<p></p>
<p>Differentiate <Katex math={"y = 20x(x-1)^6"}/>, using the product rule.</p>
<p><Katex math={"y = (20x)(x-1)^6"} displayMode/></p>
<p><Katex math={"\\frac{dy}{dx} = 20(x-1)^6 + 6(x-1)^5*1(20x)"} displayMode/></p>
<p><Katex math={"= 20(x-1)^6 + 120x(x-1)^5"} displayMode/></p>
<p><Katex math={"=20(x-1)^5((x-1) + 6x)"} displayMode/></p>
<p><Katex math={"= 20(x-1)^5(7x - 1)"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
</div>