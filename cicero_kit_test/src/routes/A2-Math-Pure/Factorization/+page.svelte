<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Factorization</title></svelte:head><div class="note">
   <h1 class="title">Factorization</h1>
<h2 class="heading"> <Katex math={"27y^6 + 64x^9 = (3y^2 + 4x^3)(9y^4 - 12x^3y^2 + 16x^6)"} displayMode/></h2>
<h2 class="heading"> <Katex math={"27y^6 - 64x^9 = (3y^2 - 4x^3)(9y^4 + 12x^3y^2 + 16x^6)"} displayMode/></h2>
<h2 class="heading"> Explained example:</h2>
<p>Factorize: <Katex math={"x^3 - 8"}/></p>
<p><Katex math={"(x-?)(x^2+?x+?)"} displayMode/></p>
<p>The first question mark will be the last part -8 cube rooted because its <Katex math={"x^3"}/> </p>
<p>so...</p>
<p><Katex math={"(x-2)(x^2+?x+?)"} displayMode/></p>
<p>-2 and the last question mark have to multiply together to give 8 so the last question mark is <Katex math={"? = 4"}/></p>
<p><Katex math={"(x-2)(x^2+?x+4)"} displayMode/></p>
<p>And the last question mark has to cancel will the the -2 meaning that it has to be +2</p>
<p>leaving the factorized form to be...</p>
<p><Katex math={"(x-2)(x^2+2x+4)"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h3 class="heading"> Another run through</h3>
<p>Factorize <Katex math={"x^3 + 9^3"}/></p>
<p><Katex math={"(x+?)(x^2 - ?x + ?)"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"(x+9)(x^2-?x+?)"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"(x+9)(x^2 - ?x + 9^2)"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"(x+9)(x^2-9x+9^2)"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>