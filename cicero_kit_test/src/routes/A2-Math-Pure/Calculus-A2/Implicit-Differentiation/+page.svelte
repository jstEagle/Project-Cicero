<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Implicit-Differentiation</title></svelte:head><div class="note">
   <h1 class="title">Implicit Differentiation</h1>
<p>A function is usually defined <b>explicitly</b> by means of a formula:</p>
<p><Katex math={"f(x) - x^2 - x = 2\\ \\ \\ or\\ \\ \\ y= \\sqrt{2x-1}"} displayMode/></p>
<p>Both the above examples can be differentiated by using the rules. However, sometimes the value <Katex math={"y = f(x)"}/> is not given by such a direct formula. Sometimes making y the subject of the formula requires difficult algebra such as:</p>
<p><Katex math={"y^3 + 12y^2 + 48y - 8x + 64 = 0"} displayMode/></p>
<p><Katex math={"y^3 + 12y^2 + 48y + 64 = 8x"} displayMode/></p>
<p><Katex math={"(y+4)^3 = 8x"} displayMode/></p>
<p><Katex math={"y + 4 = 2*\\sqrt[3]{x}"} displayMode/></p>
<p><Katex math={"y = 2*\\sqrt[3]{x} - 4"} displayMode/></p>
<p>That is quite difficult unless you are good at factorising cubes.</p>
<p>And sometimes we simply do not know enough algebra or do not want to know enough algebra to make the subject of the formula and define the function explicitly,</p>
<p>such as <Katex math={"y^3 + 3y^2 - 12y - 10x = 0"}/>.</p>
<p>The above equation cannot be expressed explicitly but we should still be able to find the gradient of the tangent at point. To do this we use implicit differentiation.</p>
<p>The process is called <b>implicit differentiation</b> because y is an implied function of x as opposed to being expressed explicitly in terms of x.</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Examples</h2>
<p>1) </p>
<p><Katex math={"y^2"} displayMode/></p>
<p><Katex math={"\\frac{d}{dx}*y^2"} displayMode/></p>
<p><Katex math={"=\\frac{d}{dy} * \\frac{dy}{dx} * y^2"} displayMode/></p>
<p><Katex math={"= \\frac{d}{dy}y^2 * \\frac{dy}{dx}"} displayMode/></p>
<p><Katex math={"=2y * \\frac{dy}{dx}"} displayMode/></p>
<p></p>
<p></p>
<p>2) </p>
<p><Katex math={"xy"} displayMode/></p>
<p><Katex math={"\\frac{d}{dx}xy = \\frac{d}{dx}x*y + \\frac{d}{dx}y*x"} displayMode/></p>
<p><Katex math={"\\frac{d}{dx}xy = 1y + \\frac{d}{dy} * \\frac{dy}{dx}y*x"} displayMode/></p>
<p><Katex math={"=1y + \\frac{d}{dy}y * \\frac{dy}{dx}*x"} displayMode/></p>
<p><Katex math={"= y + 1 * \\frac{dy}{dx}x"} displayMode/></p>
<p><Katex math={"=y + x\\frac{dy}{dx}"} displayMode/></p>
<p></p>
<p></p>
<p>3) </p>
<p><Katex math={"3x^2y^3"} displayMode/></p>
<p><Katex math={"\\frac{d}{dx}3x^2y^3 = 3(y^3 *\\frac{d}{dx}x^2 + x^2*\\frac{d}{dx}y^3)"} displayMode/></p>
<p><Katex math={"=3(2y^3x+\\frac{d}{dy} *\\frac{dy}{dx}x^2y^3)"} displayMode/></p>
<p><Katex math={"=3(2y^3x + 3y\\frac{dy}{dx}x^2)"} displayMode/></p>
<p><Katex math={"= 6y^3x + 9y*\\frac{dy}{dx}*x^2"} displayMode/></p>
<p></p>
<p></p>
<p>4) </p>
<p><Katex math={"\\sin y"} displayMode/></p>
<p><Katex math={"=\\frac{d}{dx}\\sin y"} displayMode/></p>
<p><Katex math={"=\\frac{d}{dy} * \\frac{dy}{dx}\\sin y"} displayMode/></p>
<p><Katex math={"=\\frac{d}{dy}\\sin y * \\frac{dy}{dx}"} displayMode/></p>
<p><Katex math={"=\\cos y * \\frac{dy}{dx}"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Hard question</h2>
<p>The curve with equation <Katex math={"6e^{2x} + ke^y + e^{2y} = c"}/>,</p>
<p>where k and c are constants, passes through the point P with coordinates <Katex math={"(\\ln3, \\ln2)"}/>.</p>
<p>1) Show that <Katex math={"58 + 2k = c"}/></p>
<p>2) Given also that the gradient of the curve at P is -6, find the values of <Katex math={"k"}/> and <Katex math={"c"}/></p>
<p></p>
<p></p>
<p>1) <Katex math={"\\frac{d}{dx}(6e^{2x} + ke^y + e^{2y}) = \\frac{d}{dx}c"} displayMode/></p>
<p><Katex math={"\\frac{d}{dx} = 0\\ is\\ not\\ the\\ right\\ way"} displayMode/></p>
<p><Katex math={"6e^{2\\ln3} + ke^{\\ln2} + e^{2\\ln2} = c"} displayMode/></p>
<p><Katex math={"6e^{\\ln9} + ke^{\\ln2} + e^{\\ln4} = c"} displayMode/></p>
<p><Katex math={"6(9) + k(2) + 4 = c"} displayMode/></p>
<p><Katex math={"58 + 2k = c"} displayMode/></p>
<p></p>
<p></p>
<p>2) <Katex math={"\\frac{d}{dx}(6e^{2x} + ke^y + e^{2y}) = \\frac{d}{dx}c"} displayMode/></p>
<p><Katex math={"12e^{2x} + ke^y\\frac{dy}{dx} + 2e^{2y}\\frac{dy}{dx} = 0"} displayMode/></p>
</div>